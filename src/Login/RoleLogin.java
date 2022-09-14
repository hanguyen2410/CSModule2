package Login;

import CheckLogin.Checklogin;
import Tools.CreateUserManager;

import java.util.Scanner;

public class RoleLogin {
    public static String choice = "-2";

    public static void login() {
        Scanner input = new Scanner(System.in);
        while (!choice.equals("0")  && !choice.equals("1") && !choice.equals("2")  && !choice.equals("3") && choice.equals("-2") ) {
            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋Login-CreateAccount㊋㊋㊋㊋㊋㊋㊋㊋");
            System.out.println("                                             ㊋");
            System.out.println("㊋ CHÀO MỪNG BẠN ĐẾN VỚI NHÀ HÀNG VỮNG HUẾ   ㊋");
            System.out.println("                                             ㊋");
            System.out.println("                  " + "1. Login" + "                   ㊋");
            System.out.println("             " + "2. Create Account" + "               ㊋");
            System.out.println("                                             ㊋");
            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
            System.out.println("Nhập lựa chọn của bạn: ");
            System.out.printf("︻┳═一 :");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    Checklogin checklogin = new Checklogin();
                    checklogin.checkLogin();
                    break;
                case "2":
                    CreateUserManager createUserManager = new CreateUserManager();
                    createUserManager.createAddUser();
                    System.out.println("Nhấn 1 để về menu Login hoặc 0 để thoát!");
                    System.out.printf("︻┳═一 :");
                    choice = input.nextLine();
                    switch (choice) {
                        case "1":
                            choice = "-2";
                            break;
                        case "2":
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!!");
                            System.out.println("Nhấn 1 để về menu Login hoặc 0 để thoát!");
                            System.out.printf("︻┳═一 : ");
                            choice = input.nextLine();
                    }
                    break;
                case "0":
                    System.out.println("Hẹn Gặp Lại!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không đúng định dạng, Vui Lòng Nhập Lại!!");
                   login();
            }
        }
    }
}

