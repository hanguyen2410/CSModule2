package Surface;

import Tools.*;
import models.AllOrder;
import models.OrderItem;
import utils.InstantUtils;

import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class OptionSadmin {
    private final static String PATCH_ALLORDER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\AllOrder.csv";

    public static void optionSadmin() {

        int choice = -1;
        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Quản lí Thực Đơn" + "              " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2. Quản lí người dùng" + "            " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3. Quản lí đơn đặt hàng" + "          " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            System.out.printf("︻┳═一 :");
            choice = Integer.parseInt(scanner.nextLine());
            RenderList renderList = new RenderList();
            switch (choice) {
                case 1:
                    renderList.renderMenuManager();
                    FoodManager foodManager = new FoodManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            foodManager.renderFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;

                        case 2:
                            foodManager.addFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 3:
                            foodManager.deleteFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 4:
                            foodManager.editFood();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    switch (choice) {
                                        case 1:
                                            OptionSadmin.optionSadmin();
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
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 6:
                            foodManager.sortAscending();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 7:
                            foodManager.sortDescending();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 8:
                            OptionSadmin.optionSadmin();
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
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            UserManager.addUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 2:
                            user.editUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 3:
                            UserManager.renderUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 4:
                            user.deleteUser();
                            System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để quay lại menu chính hoặc 0 để thoát ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 5:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 2;
                    }
                    break;
                case 3:
                    renderList.renderOrderManager();
                    OrderManager orderManager = new OrderManager();
                    OrderItemManager orderItemManager = new OrderItemManager();
                    AllOrderManager allOrderManager = new AllOrderManager();
                    DayOrderManager dayOrderManager = new DayOrderManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1: //hiển thị tổng oder
                            allOrderManager.renderAllOrder();
                            System.out.println();
                            System.out.println("                                                  Tổng Cộng : " + InstantUtils.doubleToVND(AllOrderManager.totalAllPrice()));
                            System.out.println();
                            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                            System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
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
                        case 2: // hiển thị order theo ngày
                            dayOrderManager.SortByDayOrder();
                            System.out.println();
                            System.out.println("                                                  Tổng Cộng : " + InstantUtils.doubleToVND(DayOrderManager.totalDayPrice()));
                            System.out.println();
                            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                            System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
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
                        case 3: //thêm đơn đặt hàng
                            orderManager.addOrder();
                            orderItemManager.addOrderItem();
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();
                            System.out.println();
                            System.out.println("                                      Tổng Cộng : " + InstantUtils.doubleToVND(orderItemManager.totalPrice()));
                            System.out.println();
                            System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                            System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
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
                        case 4:// sửa đơn đặt hàng
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
                                    System.out.println();
                                    System.out.println("                                      Tổng Cộng : " + InstantUtils.doubleToVND(orderItemManager.totalPrice()));
                                    System.out.println();
                                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                                    System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
                                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    switch (choice) {
                                        case 1:
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
                        case 5: //xóa đơn đặt hàng
                            orderItemManager.deleteOrderItem();
                            List<OrderItem> orderItemListDelete = OrderItemManager.findAll();
                            for (OrderItem orderitem : orderItemListDelete) {
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
                                    System.out.println();
                                    System.out.println("                                      Tổng Cộng : " + InstantUtils.doubleToVND(orderItemManager.totalPrice()));
                                    System.out.println();
                                    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
                                    System.out.println("           Bạn đã đặt hàng thành công, Shipper sẽ sớm giao đến địa chỉ của bạn !! Thank you very much!!");
                                    System.out.println("Nhấn 1 để về menu chính và 0 để thoát !! ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    switch (choice) {
                                        case 1:
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
                        case 6:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 3;
                    }
                    break;
                case 0:
                    System.out.println("Hẹn Gặp Lại!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Lại!");
                    OptionSadmin.optionSadmin();

            }
        }
    }
}

