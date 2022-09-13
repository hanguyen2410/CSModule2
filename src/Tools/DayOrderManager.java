package Tools;

import models.AllOrder;
import models.DayOrder;
import utils.InstantUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOrderManager {
    public List<AllOrder> allOrders;
    private final static String PATCH_ALLORDER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\DayOrder";
    public static List<DayOrder> findAll(){
        List<DayOrder> dayOrders = new ArrayList<>();
        List<String> lines = ReadFifeandWriteFile.read(PATCH_ALLORDER);
        for (String line: lines) {
            dayOrders.add(DayOrder.ParseDayOrder(line));
        }
        return dayOrders;
    }
    public void renderAllOrder(){
        System.out.printf("\n\t%-16s %-36s %-26s %-15s %-26s %s\n\n", "ID", "Tên Món Ăn", "Giá Tiền", "Số Lượng","Thành Tiền","Ngày Xuất Đơn");
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

    public static void printMenu(List<String> dayOrder) {
        System.out.printf("\n\t%-16s %-36s %-26s %-16s %-26s %s\n\n", dayOrder.get(0), dayOrder.get(1), dayOrder.get(2), dayOrder.get(3),dayOrder.get(4), InstantUtils.instantToString(Instant.parse(dayOrder.get(5))));
    }
public void SortByDayOrder(){
        List<AllOrder> allorders = AllOrderManager.findAll();
        List<DayOrder> dayOrders = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ngày muốn tìm kiếm (Ví dụ: 16-12-2022)");
        Instant day = Instant.parse(input.nextLine());
        for (AllOrder allOrder: allorders){
            if(allOrder.getCreateAt().equals(day)){
            
            }
        }
}
}

