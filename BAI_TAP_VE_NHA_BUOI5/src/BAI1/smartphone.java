package BAI1;

import java.sql.SQLOutput;

public class smartphone {
    private static int totalPhones = 0;
    private String id;
    private String name;
    private double price;
    private int stock;
    private static double vatTax = 0.10;

    public smartphone(double price, String name, int stock) {
        totalPhones++;
        this.id = "SP" + totalPhones;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public static void setTotalPhones(int totalPhones) {
        smartphone.totalPhones = totalPhones;
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
        if (price < 0){
            System.out.println("Gia khong am duoc!");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("So luong hang ton khong am duoc!");
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }
    public static void setVatTax(double tax) {
        vatTax = tax;
    }
    public double getFinalPrice() {
        return price + (price * vatTax);
    }
}