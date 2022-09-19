package Check;

import Surface.OptionSadmin;
import Surface.OptionAdmin;
import Surface.OptionUser;
import Tools.ReadFifeandWriteFile;
import Tools.UserManager;
import models.Order;
import models.User;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checklogin {
    Scanner input = new Scanner(System.in);
    private final static String PATCH_SAVEUSER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\data\\SaveUser.csv";
    public void checkLogin() {

        List<User> userList = UserManager.findAll();
        int count = 0;
        do {
            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋Login㊋㊋㊋㊋㊋㊋㊋㊋");
            System.out.println("Nhập Username: ");
            System.out.printf("︻┳═一 :");
            String userName = input.nextLine();
            System.out.println("Nhập Password: ");
            System.out.printf("︻┳═一 :");
            String passWord = input.nextLine();
            for (User user : userList) {
                String checkUser = user.getUsername();
                String checkPassWord = user.getPassword();
                String checkRole = user.getRole();
                if (checkUser.equals(userName) && checkPassWord.equals(passWord)) {

                    count++;
                    if (checkRole.equals("SADMIN")) {
                        System.out.println("     "+"Chào SADMIN " + user.getFullName());
                        System.out.println("     "+"Đăng Nhập Thành Công!!");
                        OptionSadmin.optionSadmin();
                        break;
                    }
                    if (checkRole.equals("ADMIN")) {
                        System.out.println("     "+"Chào ADMIN " + user.getFullName());
                        System.out.println("     "+"Đăng Nhập Thành Công!!");
                        OptionAdmin.optionAdmin();
                        break;
                    }
                    if (checkRole.equals("USER")) {
                        List<Order> saveUser = new ArrayList<>();
                        Long id = user.getId();
                        String name = user.getFullName();
                        String phone = user.getPhone();
                        String address = user.getAddress();
                        Instant createAt = Instant.now();
                        Order newSaveUser = new Order(id,name,phone,address,createAt);
                        saveUser.add(newSaveUser);
                        ReadFifeandWriteFile.write(PATCH_SAVEUSER,saveUser);
                        System.out.println("     "+"Chào USER " + user.getFullName());
                        System.out.println("     "+"Đăng Nhập Thành Công!!");
                        OptionUser.optionUser();
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Đăng nhập thất bại! vui lòng đăng nhập lại!");
            }
        } while (count == 0);
    }
}
