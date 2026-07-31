package model;

public class Toy {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Toy(String name, String id, double price, int quantity) {
        this.name = name;
        this.id = id;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("GIA BAN KHONG HOP LE");
            return;
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.out.println("So luong khong hop le");
            return;
        }
        this.quantity = quantity;
    }
    public double calculateDiscount(){
        return 0;
    }
    public void printInfo(){
        System.out.println("Ma:"+id);
        System.out.println("Ten: " + name);
        System.out.println("Gia: " + price);
        System.out.println("So luong: " + quantity);
    }

}
