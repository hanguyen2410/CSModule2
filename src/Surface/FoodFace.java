package Surface;

import Tools.FoodManager;
import Tools.OrderItemManager;
import Tools.OrderManager;
import Tools.UserManager;
import models.OrderItem;
import models.User;

import java.util.Scanner;

public class FoodFace {
    public static int choice = -1;


    public void option() {

        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Quản lí Thực Đơn" + "             " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2. Quản lí người dùng" + "           " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3. Quản lí đơn đặt hàng" + "         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "4. Order món ăn" + "                 " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            choice = Integer.parseInt(scanner.nextLine());
            RenderList renderList = new RenderList();
            switch (choice) {
                case 1:
                    renderList.renderMenuManager();
                    FoodManager foodManager = new FoodManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            foodManager.renderFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                             choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;

                        case 2:
                            foodManager.addFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 3:
                            foodManager.deleteFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 4:
                            foodManager.editFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    switch (choice) {
                                        case 1:
                                            choice = -1;
                                            break;
                                        case 0:
                                            System.out.println("Hẹn Gặp Lại!!!");
                                            System.exit(0);
                                            break;
                                    }
                            }
                            break;
                        case 5:
                            foodManager.findFoodName();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 6:
                            foodManager.sortAscending();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 7:
                            foodManager.sortDescending();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 8:
                            choice = -1;
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 1;
                    }
                    break;
                case 2:
                    renderList.renderUserManager();
                    UserManager user = new UserManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            user.addUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 2:
                            user.editUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 3:
                            user.renderUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 4:
                            user.deleteUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                    }
                    break;
                case 3:
                    renderList.renderOrderManager();
                    OrderManager orderManager = new OrderManager();
                    OrderItemManager orderItemManager = new OrderItemManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1: //hiển thị tổng oder
                            break;
                        case 2: // hiển thị order theo ngày
                            break;
                        case 3: //thêm đơn đặt hàng
                            orderManager.addOrder();
                            orderItemManager.addOrderItem();
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();
                            break;
                        case 4:// sửa đơn đặt hàng
                            break;
                        case 5: //xóa đơn đặt hàng
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Hẹn Gặp Lại!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Lại!");
                    choice = -1;

            }
        }
    }
}

