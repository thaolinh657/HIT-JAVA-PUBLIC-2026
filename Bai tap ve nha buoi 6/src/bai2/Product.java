package bai2;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public double getDiscountedPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gia: " + price);
    }
    @Override
    public String toString(){
        return "Product{" + "id = " + id + ", name: " + name + ", price: " + price + " }";
    }
}
