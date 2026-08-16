package bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("6235", "Ngưng sống như thể mộng du",119000, "ROB WALKER", 237));
        products.add(new Book("5346", "Cái tên khắc sâu trong tim người",147300, "DiFer", 276));
        products.add(new Electronic("6374", "iPhone 17 Pro Max 256GB", 35690000, 12));
        products.add(new Electronic("6753","Smart Tivi Samsung UHD 4K 43 inch 43DU7000 ", 5730000, 12 ));
        products.add(new Food("5436", "jollibee", 66000, "12 hours"));
        System.out.println("Danh sach san pham: ");
        for (Product product : products){
            product.showInfo();
            System.out.println("toString(): ");
            System.out.println(product);
            System.out.println(' ');
        }
        double totalOriginalPrice = 0;
        for (Product product : products){
            totalOriginalPrice += product.price;
        }
        double totalSellingPrice = 0;
        for (Product product : products) {
            totalSellingPrice += product.getDiscountedPrice();
        }
        System.out.println("Tong gia tri: ");
        System.out.println("Tong gia tri kho hang (gia goc): " + totalOriginalPrice);
        System.out.println("Tong gia tri neu ban het: " + totalSellingPrice);
    }
}
