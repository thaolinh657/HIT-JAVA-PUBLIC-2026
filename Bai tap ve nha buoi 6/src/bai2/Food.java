package bai2;

public class Food extends Product{
    private String expiryDate;
    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    public double getDiscountedPrice() {
        return price;
    }
    @Override
    public void showInfo() {
        System.out.println("Food: ");
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Hạn sử dụng: " + expiryDate);
        System.out.println("Giá gốc: " + price);
        System.out.println("Giá sau discount: " + getDiscountedPrice());
    }
    @Override
    public String toString() {
        return "Food{" + "id='" + id  + ", name='" + name  + ", price=" + price + ", expiryDate='" + expiryDate + '}';
    }
}
