package Tools;

import models.AllOrder;
import models.Food;
import models.OrderItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderItemManager {
    List<OrderItem> orderItems;
    private final static String PATCH_ORDERITEM = "D:\\vscode\\module2\\CSModule2\\CSModule2\\OrderItem.csv";

    public OrderItemManager() {
        List<OrderItem> orderItemList = new ArrayList<>();
        this.orderItems = orderItemList;
    }

    public List<OrderItem> findAll() {
        List<OrderItem> orderItems = new ArrayList<>();
        List<String> lines = ReadFifeandWriteFile.read(PATCH_ORDERITEM);
        for (String line : lines) {
            orderItems.add(OrderItem.parseOrderItem(line));
        }
        return orderItems;
    }

    public void addOrderItem() {
        List<OrderItem> orderItems = new ArrayList<>();
        List<Food> foods = FoodManager.findAll();
        FoodManager render = new FoodManager();
        Scanner input = new Scanner(System.in);
        render.renderFood();
        System.out.println("Nhập ID của món ăn muốn mua: ");
        Long id = Long.parseLong(input.nextLine());
        Double price = Double.valueOf(0);
        Double total = Double.valueOf(0);
        String nameFood = "";
        int count = 0;
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                price = dish.getPrice();
                nameFood = dish.getFoodName();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("ID Không tồn tại vui lòng nhập lại!!");
            addOrderItem();
            return;
        }
        System.out.println("Nhập số lượng muốn mua: ");
        int quantity = Integer.parseInt(input.nextLine());
        int countQuantity = 0;
        for (Food dish : foods) {
            int tampQuantity = dish.getQuantity();
            Long tamp = dish.getId();
            if (tamp.equals(id) && tampQuantity >= quantity) {
                total = dish.getPrice() * quantity;
                dish.setQuantity(dish.getQuantity() - quantity);
                ReadFifeandWriteFile.write("D:\\vscode\\module2\\CSModule2\\CSModule2\\src\\FoodMenu.csv", foods);
                countQuantity++;
            }
        }
        if(countQuantity == 0){
            System.out.println("Số lượng không đủ vui lòng nhập lại!!");
            addOrderItem();
            return;
        }
        OrderItem newOrder = new OrderItem(id, nameFood, price, quantity, total);
        orderItems.add(newOrder);
        Instant createAt = Instant.now();
        List<AllOrder> allOrders = AllOrderManager.findAll();
        AllOrder allOrder = new AllOrder(id, nameFood, price, quantity, total, createAt);
        allOrders.add(allOrder);
        ReadFifeandWriteFile.write("D:\\vscode\\module2\\CSModule2\\CSModule2\\AllOrder.csv",allOrders);
        ReadFifeandWriteFile.write(PATCH_ORDERITEM, orderItems);
        System.out.println("Order thành công!");
        renderOrderItem();
        System.out.println("Nhập y nếu muốn order tiếp hoặc p để in hóa đơn ");
        String choice = input.nextLine();
        switch (choice) {
            case "y":
                boolean tamp = true;
                while (tamp) {
                    updateOrderItem();
                    System.out.println("Nhập y nếu muốn order tiếp hoặc p để in hóa đơn ");
                    choice = input.nextLine();
                    switch (choice) {
                        case "y":
                            tamp = true;
                            break;
                        case "p":
                            tamp = false;
                            break;
                        default:
                            System.out.println("Vui lòng nhập lại!!");
                            updateOrderItem();
                    }
                }
                break;
            case "p":
                break;
        }

    }

    public void updateOrderItem() {
        List<OrderItem> orderItems = findAll();
        List<Food> foods = FoodManager.findAll();
        FoodManager render = new FoodManager();
        Scanner input = new Scanner(System.in);
        render.renderFood();
        System.out.println("Nhập ID của món ăn muốn mua");
        Long id = Long.parseLong(input.nextLine());
        Double price = Double.valueOf(0);
        Double total = Double.valueOf(0);
        String nameFood = "";
        int count = 0;
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                price = dish.getPrice();
                nameFood = dish.getFoodName();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("ID không tồn tại vui lòng nhập lại!!");
            updateOrderItem();
            return;
        }
        System.out.println("Nhập số lượng muốn mua: ");
        int quantity = Integer.parseInt(input.nextLine());
        int countQuantity = 0;
        for (Food dish : foods) {
            int tampQuantity = dish.getQuantity();
            Long tampid = dish.getId();
            if (tampid.equals(id) && tampQuantity >= quantity) {
                total = dish.getPrice() * quantity;
                dish.setQuantity(dish.getQuantity() - quantity);
                ReadFifeandWriteFile.write("D:\\vscode\\module2\\CSModule2\\CSModule2\\src\\FoodMenu.csv", foods);
                countQuantity++;
            }

        }
        if(countQuantity == 0) {
            System.out.println("Số lượng không đủ vui lòng nhập lại!!");
            updateOrderItem();
            return;
        }
        OrderItem newOrder = new OrderItem(id, nameFood, price, quantity, total);
        orderItems.add(newOrder);
        Instant createAt = Instant.now();
        List<AllOrder> allOrders = AllOrderManager.findAll();
        AllOrder allOrder = new AllOrder(id,nameFood,price,quantity,total,createAt);
        allOrders.add(allOrder);
        ReadFifeandWriteFile.write("D:\\vscode\\module2\\CSModule2\\CSModule2\\AllOrder.csv",allOrders);
        ReadFifeandWriteFile.write(PATCH_ORDERITEM, orderItems);
        System.out.println("Order thành công!");
    }

    public void renderOrderItem() {
        System.out.printf("\n%-25s %-25s %-25s %-25s %s\n", "ID Product", "Tên Vật Phẩm", "Giá Tiền", "Số lượng", "Thành Tiền");
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\vscode\\module2\\CSModule2\\CSModule2\\OrderItem.csv"));
            while ((line = br.readLine()) != null) {
                printMenuOrderItem(parseCsvLine(line));
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

    public static void printMenuOrderItem(List<String> OrderItem) {
        System.out.printf("\n%-25s %-25s %-25s %-25s %s\n", OrderItem.get(0), OrderItem.get(1), OrderItem.get(2), OrderItem.get(3), OrderItem.get(4));
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

    public void editOrderItem() {
        Scanner input = new Scanner(System.in);
        List<OrderItem> orderItemList = findAll();
        List<Food> foods = FoodManager.findAll();
        renderOrderItem();
        System.out.println("Nhập ID của vật phẩm muốn đổi: ");
        Long id = Long.parseLong(input.nextLine());
        int count = 0;
        for (OrderItem orderItem : orderItemList) {
            Long tamp = orderItem.getId();
            String name = "";
            Double price = Double.valueOf(0);
            Double total = Double.valueOf(0);
            long idEdit = 0;
            int quantity = 0;
            if (tamp.equals(id)) {
                FoodManager render = new FoodManager();
                render.renderFood();
                System.out.println("Nhập ID của vật phẩm mới: ");
                idEdit = Long.parseLong(input.nextLine());
                for (Food dish : foods) {
                    Long tampFood = dish.getId();
                    if (tampFood.equals(idEdit)) {
                        price = dish.getPrice();
                        name = dish.getFoodName();
                    }
                }
                System.out.println("Nhập số lượng muốn mua: ");
                quantity = Integer.parseInt(input.nextLine());

                for (Food dish : foods) {
                    Long tamp1 = dish.getId();
                    if (tamp1.equals(idEdit)) {
                        total = dish.getPrice() * quantity;
                    }
                }
            }
            orderItem.setId(idEdit);
            orderItem.setNameFood(name);
            orderItem.setPrice(price);
            orderItem.setQuantity(quantity);
            orderItem.setTotal(total);
            count++;
            ReadFifeandWriteFile.write(PATCH_ORDERITEM, orderItems);
            renderOrderItem();
            break;
        }
        if (count == 0) {
            System.out.println("ID không tồn tại vui lòng nhập lại!");
            editOrderItem();
        }
    }
    public Double totalPrice(){
        List<OrderItem> orderItemList = findAll();
        Double  totalPirce = Double.valueOf(0);
        for (OrderItem orderItem: orderItemList) {
            totalPirce += orderItem.getTotal();
        }
        return totalPirce;
    }
}