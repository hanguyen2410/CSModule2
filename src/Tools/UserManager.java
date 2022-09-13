package Tools;

import models.User;
import utils.InstantUtils;
import utils.UserValidateUltils;
import utils.ValidateUltils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.UserValidateUltils.inputFullName;

public class UserManager {
    private final static String PATCH_USER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\src\\User.csv";

    public static List<User> findAll() {
        List<User> users = new ArrayList<>();
        List<String> lines = ReadFifeandWriteFile.read(PATCH_USER);
        for (String line : lines) {
            users.add(User.parseUser(line));
        }
        return users;
    }

    public static boolean checkUserNameInTheList(String userName) {
        List<User> users = findAll();
        if (!users.isEmpty()) {
            for (User username : users) {
                String tamp = username.getUsername();
                if (tamp.equals(userName))
                    return true;
            }
        }
        return false;
    }

    public static void renderUser() {
        System.out.printf("\n%-25s %-25s %-25s %-25s %-25s %-35s %-15s %s\n", "ID", "UserName", "PassWord", "Tên đầy đủ", "Số điện thoại", "Email", "Địa chỉ", "Ngày Tạo");
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(PATCH_USER));
            while ((line = br.readLine()) != null) {
                printMenu(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printMenu(List<String> userList) {
        System.out.printf("\n%-25s %-25s %-25s %-25s %-25s %-35s %-15s %s\n", userList.get(0), userList.get(1), userList.get(2), userList.get(3), userList.get(4), userList.get(5), userList.get(6), InstantUtils.instantToString(Instant.parse(userList.get(7))));
    }

    public static void addUser() {
        List<User> users = findAll();
        Scanner input = new Scanner(System.in);
//    renderUser();
        Long id = System.currentTimeMillis() / 1000;
        String userName = UserValidateUltils.inputUserName();
        String passWord = UserValidateUltils.inputPassWord();
        String fullName = UserValidateUltils.inputFullName();
        String phone = UserValidateUltils.inputPhone();
        String email = UserValidateUltils.inputEmail();
        System.out.println("Nhập địa chỉ người dùng: ");
        String address = input.nextLine();
        User newUser = new User(id, userName, passWord, fullName, phone, email, address);
        newUser.setCreatedAt(Instant.now());
        users.add(newUser);
        ReadFifeandWriteFile.write(PATCH_USER, users);
        renderUser();
    }

    public void editUser() {
        renderUser();
        List<User> users = findAll();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập y nếu muốn chỉnh cửa hoặc nhập b để quay lại menu chính: ");
        String choice = input.nextLine();
        switch (choice) {
            case "y":
                System.out.println("Nhập ID muốn chỉnh sửa: ");
                Long id = Long.parseLong(input.nextLine());
                int count = 0;
                for (User userList : users) {
                    Long tamp = userList.getId();
                    if (tamp.equals(id)) {
                        String userName = UserValidateUltils.inputUserName();
                        String passWord = UserValidateUltils.inputPassWord();
                        String fullName = UserValidateUltils.inputFullName();
                        String phone = UserValidateUltils.inputPhone();
                        String email = UserValidateUltils.inputEmail();
                        System.out.println("Nhập Địa chỉ muốn thay đổi: ");
                        String address = input.nextLine();
                        userList.setUsername(userName);
                        userList.setPassword(passWord);
                        userList.setFullName(fullName);
                        userList.setPhone(phone);
                        userList.setEmail(email);
                        userList.setAddress(address);
                        userList.setId(id);
                        count++;
                        ReadFifeandWriteFile.write(PATCH_USER, users);
                        renderUser();
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("ID Không tồn tại vui lòng nhập lại!");
                    editUser();
                }
                break;
            case "b":
                break;
            default:
                System.out.println("Vui lòng nhập lại!!");
                editUser();
        }

    }

    public void deleteUser() {
        List<User> users = findAll();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập y nếu muốn xóa hoặc nhập b để quay lại menu chính: ");
        String choice = input.nextLine();
        switch (choice) {
            case "y":
                renderUser();
                System.out.println("Nhập id muốn xóa: ");
                Long id = Long.parseLong(input.nextLine());
                int count = 0;
                for (User userList : users) {
                    Long tamp = userList.getId();
                    if (tamp.equals(id)) {
                        System.out.println("Bạn chắc chắn muốn xóa id: " + id + " Bấm ý để đồng ý hoặc b để trở lại menu chính!");
                        choice = input.nextLine();
                        switch (choice) {
                            case "y":
                                users.remove(userList);
                                System.out.println("Đã xóa thành công !!");
                                count++;
                                ReadFifeandWriteFile.write(PATCH_USER, users);
                                renderUser();
                                return;
                            case "b":
                                return;
                            default:
                                System.out.println("vui lòng nhập lại!!");
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("ID không tồn tại vui lòng nhập lại!!");
                    deleteUser();
                    break;
                }
                break;
            case "b":
                break;
            default:
                System.out.println("Vui lòng nhập lại!!");
                deleteUser();
        }
    }

}
