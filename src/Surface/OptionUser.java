package Surface;

import Tools.AllOrderManager;
import Tools.DayOrderManager;
import Tools.OrderItemManager;
import Tools.OrderManager;

import java.util.Scanner;

public class OptionUser {
    public static int choice = -1;

    public static void optionUser() {
        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Order Món Ăn" + "                 " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2.Xem lại đơn hàng" + "              " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3.Chỉnh sửa đơn hàng" + "            " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            choice = Integer.parseInt(scanner.nextLine());
            OrderManager orderManager = new OrderManager();
            OrderItemManager orderItemManager = new OrderItemManager();
            switch (choice) {
                case 1:
                    orderManager.addOrder();
                    orderItemManager.addOrderItem();
                    orderManager.renderOder();
                    orderItemManager.renderOrderItem();
                    System.out.println();
                    System.out.println("                                      Tổng Cộng : " + orderItemManager.totalPrice());
                    System.out.println();
                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
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
                            System.out.println("Nhấn 1 để in hóa đơn hoặc 0 để order tiếp ");
                            choice = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    orderManager.renderOder();
                    orderItemManager.renderOrderItem();
                    System.out.println("                                      Tổng Cộng : " + orderItemManager.totalPrice());
                    System.out.println();
                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
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
                            System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                            choice = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 3:
                    orderItemManager.editOrderItem();
                    System.out.println("Nhấn 1 để in hóa đơn hoặc 2 để về menu chính và 0 để thoát !! ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();
                            System.out.println("                                      Tổng Cộng : " + orderItemManager.totalPrice());
                            System.out.println();
                            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                            System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice){
                                case 1:
                                    choice = -1;
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 2:
                            choice = -1;
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            System.out.println("Nhấn 1 để in hóa đơn hoặc 0 để order tiếp ");
                            choice = Integer.parseInt(scanner.nextLine());
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
