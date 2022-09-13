package Tools;

import models.AllOrder;
import utils.InstantUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AllOrderManager {
public List<AllOrder> allOrders;
private final static String PATCH_ALLORDER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\AllOrder.csv";
public static List<AllOrder> findAll(){
    List<AllOrder> allOders = new ArrayList<>();
    List<String> lines = ReadFifeandWriteFile.read(PATCH_ALLORDER);
    for (String line: lines) {
        allOders.add(AllOrder.ParseAllOrder(line));
    }
    return allOders;
}
public void renderAllOrder(){
    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋ALL-ORDER㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
    System.out.printf("\n\t%-16s %-36s %-26s %-15s %-26s %-16s %s\n\n", "ID", "Tên Món Ăn", "Giá Tiền", "Số Lượng","Thành Tiền","Ngày Xuất Đơn","㊋");
    BufferedReader br = null;
    try {
        String line;
        br = new BufferedReader(new FileReader(PATCH_ALLORDER));
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
    System.out.println("㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋㊋");
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

    public static void printMenu(List<String> AllOder) {
        System.out.printf("\n\t%-16s %-36s %-26s %-16s %-26s %-15s %s\n\n", AllOder.get(0), AllOder.get(1), AllOder.get(2), AllOder.get(3),AllOder.get(4), InstantUtils.instantToString(Instant.parse(AllOder.get(5))),"㊋");
    }

}
