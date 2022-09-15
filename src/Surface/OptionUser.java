package Surface;

import Tools.*;
import models.AllOrder;
import models.OrderItem;

import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class OptionUser {
    public static int choice = -1;
    private final static String PATCH_ALLORDER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\AllOrder.csv";
    public static void optionUser() {
        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Order Món Ăn" + "                 " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2.Xem lại đơn hàng" + "              " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3.Chỉnh sửa đơn hàng" + "            " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "4.Xóa đơn hàng" + "                  " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            System.out.printf("︻┳═一 :");
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
                    System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                    List<OrderItem> orderItemList = OrderItemManager.findAll();
                    for (OrderItem orderitem : orderItemList) {
                        Instant createAt = Instant.now();
                        List<AllOrder> allOrders = AllOrderManager.findAll();
                        AllOrder allOrder = new AllOrder(orderitem.getId(), orderitem.getNameFood(), orderitem.getPrice(), orderitem.getQuantity(), orderitem.getTotal(), createAt);
                        allOrders.add(allOrder);
                        ReadFifeandWriteFile.write(PATCH_ALLORDER, allOrders);
                    }
                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                    System.out.printf("︻┳═一 :");
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
                            System.out.printf("︻┳═一 :");
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
                    System.out.printf("︻┳═一 :");
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
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 3:
                    orderItemManager.editOrderItem();
                    List<OrderItem> orderItemListEdit = OrderItemManager.findAll();
                    for (OrderItem orderitem : orderItemListEdit) {
                        Instant createAt = Instant.now();
                        List<AllOrder> allOrders = AllOrderManager.findAll();
                        AllOrder allOrder = new AllOrder(orderitem.getId(), orderitem.getNameFood(), orderitem.getPrice(), orderitem.getQuantity(), orderitem.getTotal(), createAt);
                        allOrders.add(allOrder);
                        ReadFifeandWriteFile.write(PATCH_ALLORDER, allOrders);
                    }
                    System.out.println("Nhấn 1 để in hóa đơn hoặc 2 để về menu chính và 0 để thoát !! ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();
                            System.out.println("                                      Tổng Cộng : " + orderItemManager.totalPrice());
                            System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
                            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                            System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                            System.out.printf("︻┳═一 :");
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
                                    System.out.printf("︻┳═一 :");
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
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 4:
                    orderItemManager.deleteOrderItem();
                    List<OrderItem> orderItemListDelete = OrderItemManager.findAll();
                    for (OrderItem orderitem : orderItemListDelete) {
                        Instant createAt = Instant.now();
                        List<AllOrder> allOrders = AllOrderManager.findAll();
                        AllOrder allOrder = new AllOrder(orderitem.getId(), orderitem.getNameFood(), orderitem.getPrice(), orderitem.getQuantity(), orderitem.getTotal(), createAt);
                        allOrders.add(allOrder);
                        ReadFifeandWriteFile.write(PATCH_ALLORDER, allOrders);
                    }
                    System.out.println("                                      Tổng Cộng : " + orderItemManager.totalPrice());
                    System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                    System.out.println("Nhấn 1 để in hóa đơn hoặc 2 để về menu chính và 0 để thoát !! ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();

                            break;
                        case 2:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            System.out.println("Nhấn 1 để in hóa đơn hoặc 0 để order tiếp ");
                            System.out.printf("︻┳═一 :");
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
