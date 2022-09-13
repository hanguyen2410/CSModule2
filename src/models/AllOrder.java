package models;

import java.time.Instant;
import java.time.LocalTime;

public class AllOrder {
    private Long id;
    private String nameFood;
    private double price;
    private int quantity;
    private Double total;
    private Instant createAt;

    public AllOrder() {
    }

    public AllOrder(Long id, String nameFood, double price, int quantity, Double total, Instant createAt) {
        this.id = id;
        this.nameFood = nameFood;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.createAt = createAt;
    }
    public static AllOrder ParseAllOrder(String raw){
        AllOrder allOrder = new AllOrder();
        String[] fields = raw.split(",");
        allOrder.id = Long.parseLong(fields[0]);
        allOrder.nameFood = fields[1];
        allOrder.price = Double.parseDouble(fields[2]);
        allOrder.quantity = Integer.parseInt(fields[3]);
        allOrder.total = Double.parseDouble(fields[4]);
        allOrder.createAt = Instant.parse(fields[5]);
        return allOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%s",id,nameFood,price,quantity,total,createAt);
    }
}
