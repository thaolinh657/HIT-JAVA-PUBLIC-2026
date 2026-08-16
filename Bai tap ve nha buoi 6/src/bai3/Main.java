package bai3;

public class Main {
    public static void main(String[] args) {
        double orderAmount = 2000000;
        Address address1 = new Address("123 Le Loi", "Tp HCM", "70000");
        Address address2 = new Address("25 Nguyễn Huệ", "TPHCM", "700000");
        Address address3 = new Address("50 Trần Hưng Đạo", "Hà Nội", "100000");
        NomalsAccount normal = new NomalsAccount("normal01", "normal@gmail.com", address1);
        VipAccount vip1 = new VipAccount("vip01", "vip1@gmail.com", address2, 500);
        VipAccount vip2 = new VipAccount("vip02", "vip2@gmail.com", address3, 1500);
        System.out.println(normal);
        double normalTotal = orderAmount * (1 - normal.getDiscount());
        System.out.println("Tong tien phai tra: " + normalTotal + "VND");
        System.out.println(" ");
        System.out.println(vip1);
        double vip1Total = orderAmount * (1 - vip1.getDiscount());
        System.out.println("Tong tien phai tra: " + vip1Total + "VND");
        System.out.println(" ");
        System.out.println(vip2);
        double vip2Total = orderAmount * (1 - vip2.getDiscount());
        System.out.println("Tong tien phai tra: " + vip2Total + "VND");
        System.out.println(" ");
        System.out.println("Kiem tra nang hang: ");
        vip1.addPoints(600);

    }
}
