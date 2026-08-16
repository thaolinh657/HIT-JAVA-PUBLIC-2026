package Bai1;

public class order {
    private String orderId;
    private Customer customer;
    private Product[] items;
    private int count;

    public order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new Product[10];
        this.count = 0;
    }
    public void addProduct(Product p){
        if (count >= items.length){
            System.out.println("Don hang da full");
            return;
        }
        items[count] = p;
        count++;
        System.out.println("Da them san pham: " + p.getName());
    }
    public double getTotal(){
        double total = 0;
        for (int i = 0; i < count; i++){
            total += items[i].getSubtotal();
        }
        return total;
    }
    public void printInvoice(){
        System.out.println("Hoa don cua ban: ");
        System.out.println("ma don hang: " + orderId);
        System.out.println("Thong tin khach hang: ");
        System.out.println("ten " + customer.getName());
        System.out.println("phone: " + customer.getPhone());
        System.out.println("address: " + customer.getAddress());
        System.out.println("chi tiet don hang: ");
        for (int i = 0; i < count; i++){
            Product p = items[i];
            System.out.println((i + 1) + ". " + p.getName() + " Don gia: " + p.getPrice() + " sl: " + p.getQuantity() + " Thanh tien: " + p.getSubtotal());
        }
        System.out.println("Tong tien: " + getTotal());
    }
}
