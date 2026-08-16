package bai2;

public class Book extends Product {
    private String author;
    private  int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }
    @Override
    public double getDiscountedPrice(){
        return price * 0.09;
    }
    @Override
    public void showInfo() {
        System.out.println("Book:");
        System.out.println("Id: " + id);
        System.out.println("name: " + name);
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + pages);
        System.out.println("Giá gốc: " + price);
        System.out.println("Giá sau discount: " + getDiscountedPrice());
    }
    @Override
    public String toString() {
        return "Book{" + "id='" + id  + ", name='" + name  + ", price=" + price + ", author='" + author  + ", pages=" + pages + '}';
    }
}
