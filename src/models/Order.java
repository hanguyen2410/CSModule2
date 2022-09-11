package models;

import java.time.Instant;

public class Order {
    private Long id;
    private String fullName;
    private String phone;
    private String address;
    private String nameFood;
    private String quatity;
    private String price;
    private String total;
    private Instant createAt;
    public Order(){}

    public Order(Long id, String fullName, String phone, String address, String nameFood, String quatity, String price, String total, Instant createAt) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.nameFood = nameFood;
        this.quatity = quatity;
        this.price = price;
        this.total = total;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getQuatity() {
        return quatity;
    }

    public void setQuatity(String quatity) {
        this.quatity = quatity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }
    public static Order parseOrder(String raw){
        Order order = new Order();
        String[] fields = raw.split(",");
        order.id = Long.parseLong(fields[0]);
        order.fullName = fields[1];
        order.phone = fields[2];
        order.address = fields[3];
        order.nameFood = fields[4];
        order.quatity = fields[5];
        order.price = fields[6];
        order.total = fields[7];
        order.createAt = Instant.parse(fields[8]);
        return order;
    }
    public String toString(){
        return String.format("%d,%s,%s,%s,%s,%s,%s,%s,%s",id,fullName,phone,address,nameFood,quatity,price,total,createAt);
    }
}
