package Tools;

import models.Food;
import models.Order;
import models.OrderItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        System.out.println("Nhập ID của món ăn muốn mua");
        Long id = Long.parseLong(input.nextLine());
        Double price = Double.valueOf(0);
        Double total = Double.valueOf(0);
        String nameFood = "";
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                price = dish.getPrice();
                nameFood = dish.getFoodName();
            }
        }
        System.out.println("Nhập số lượng muốn mua: ");
        int quantity = Integer.parseInt(input.nextLine());
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                total = dish.getPrice() * quantity;
            }
        }
        OrderItem newOrder = new OrderItem(id, nameFood, price, quantity, total);
        orderItems.add(newOrder);
        ReadFifeandWriteFile.write(PATCH_ORDERITEM, orderItems);
        System.out.println("Order thành công!");
        System.out.println("Nhập y nếu muốn order tiếp hoặc p để in hóa đơn ");
        String choice = input.nextLine();
        switch (choice) {
            case "y":
                updateOrderItem();
                System.out.println("Nhập y nếu muốn order tiếp hoặc p để in hóa đơn ");
                choice = input.nextLine();
                break;
            case "b":
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
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                price = dish.getPrice();
                nameFood = dish.getFoodName();

            }
        }
        System.out.println("Nhập số lượng muốn mua: ");
        int quantity = Integer.parseInt(input.nextLine());
        for (Food dish : foods) {
            Long tamp = dish.getId();
            if (tamp.equals(id)) {
                total = dish.getPrice() * quantity;
            }
        }
        OrderItem newOrder = new OrderItem(id, nameFood, price, quantity, total);
        orderItems.add(newOrder);
        ReadFifeandWriteFile.write(PATCH_ORDERITEM, orderItems);
        System.out.println("Order thành công!");
    }
    public void renderOrderItem(){
        System.out.printf("\n%-25s %-25s %-25s %-25s %s\n", "ID Order", "Tên Vật Phẩm", "Giá Tiền", "Số lượng", "Thành Tiền");
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
}