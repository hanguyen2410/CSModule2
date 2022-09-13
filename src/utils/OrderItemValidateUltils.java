package utils;

import Tools.FoodManager;
import models.Food;
import models.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderItemValidateUltils {
    List<OrderItem> orderItems = new ArrayList<>();
    List<Food> foods = FoodManager.findAll();
    FoodManager render = new FoodManager();
    Scanner input = new Scanner(System.in);
}
