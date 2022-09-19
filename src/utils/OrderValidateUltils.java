package utils;

import tools.FoodManager;

import java.util.Scanner;

public class OrderValidateUltils {
    static Scanner input = new Scanner(System.in);

    public static double inputPrice() {
        double price = 0;
        do {
            System.out.println("Nhập giá vật phẩm (Giá phải lớn hơn 5000 VNĐ, Ví dụ : 6000) : ");
            price = Double.parseDouble(input.nextLine());
            if (price < 5000) {
                System.out.println("Số tiền quá thấp vui lòng nhập lại!!");
            }
        } while (price < 5000);
        return price;
    }

    public static String inputFoodName() {
        String foodName = "";
        do {
            System.out.println("Nhập tên Món Ăn (Ví dụ Bún Bò Huế) : ");
            foodName = input.nextLine();
            if (!ValidateUltils.isNameValid(foodName)) {
                System.out.println("Tên chưa đúng định dạng vui lòng nhập lại!!");
            }
            if (FoodManager.checkNameInTheList(foodName)) {
                System.out.println("Tên món ăn đã có, vui lòng nhập lại !!");
                FoodManager.addFood();
                break;
            }
        } while (!ValidateUltils.isNameValid(foodName));
        return foodName;
    }

    public static Integer inputQuantity() {
        int quantity = 0;
        do {
            System.out.println("Nhập số lượng vật phẩm (không được < 1):");
            quantity = Integer.parseInt(input.nextLine());
            if (quantity < 1) {
                System.out.println("Số lượng không đúng quy định, vui lòng nhập lại!!");
            }
        } while (quantity < 1);
        return quantity;
    }
}
