package Tools;

import models.Order;
import models.OrderItem;
import utils.InstantUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderManager {
public List<Order> orders;
private final static String PATCH_ODER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\Order.csv";
public OrderManager(){
    List<Order> orderList = new ArrayList<>();
    this.orders = orderList;
}
public List<Order> findAll(){
    List<Order> orders = new ArrayList<>();
    List<String> lines = ReadFifeandWriteFile.read(PATCH_ODER);
    for(String line : lines) {
        orders.add(Order.parseOrder(line));
    }
    return orders;
}
public void renderOder(){
    System.out.printf("\n%-25s %-25s %-25s %-25s %-25s %-35s %-15s %-15s %s\n", "ID", "Tên người mua", "SĐT", "Địa chỉ", "Ngày Mua Hàng");
    BufferedReader br = null;
    try {
        String line;
        br = new BufferedReader(new FileReader(PATCH_ODER));
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

    public static void printMenu(List<String> Order) {
        System.out.printf("\n%-25s %-25s %-25s %-25s %s\n", Order.get(0), Order.get(1),Order.get(2), Order.get(3), InstantUtils.instantToString(Instant.parse(Order.get(4))));
    }


public void addOrder(){
    FoodManager render = new FoodManager();
    Scanner input = new Scanner(System.in);
    render.renderFood();
    System.out.println("Nhập tên người mua hàng: ");
    String fullName = input.nextLine();
    System.out.println("Nhập số điện thoại người mua hàng: ");
    String phone = input.nextLine();
    System.out.println("Nhập địa chỉ người mua hàng: ");

}
}
