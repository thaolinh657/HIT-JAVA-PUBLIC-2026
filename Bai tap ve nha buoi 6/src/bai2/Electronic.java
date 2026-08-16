package bai2;

public class Electronic extends Product{
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public double getDiscountedPrice() {
        return price * 1.05;
    }
    @Override
    public void showInfo() {
        System.out.println("Electronic");
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Bảo hành: " + warrantyMonths + " tháng");
        System.out.println("Giá gốc: " + price);
        System.out.println("Giá sau discount: " + getDiscountedPrice());
    }
    @Override
    public String toString() {
        return "Electronic{" + "id='" + id  + ", name='" + name + ", price=" + price + ", warrantyMonths=" + warrantyMonths + '}';
    }
}
