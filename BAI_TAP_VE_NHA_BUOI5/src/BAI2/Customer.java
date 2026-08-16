package BAI2;

import BAI1.smartphone;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCart(ArrayList<smartphone> cart) {
        this.cart = cart;
    }

    public void addPhone(smartphone phone) {
        cart.add(phone);
    }
    public void removePhone(String id){
        for (int i = 0; i < cart.size(); i++){
            if (cart.get(i).getId().equals(id)){
                cart.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay phone co id: " + id);
    }
    public void removePhone(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
        } else {
            System.out.println("Index không hợp lệ!");
        }
    }
    public ArrayList<smartphone> getCart() {
        return new ArrayList<>(cart);
    }
    public double cacluateInventoryValue(){
        double total = 0;
        for (smartphone phone : cart){
            total += phone.getPrice();
        }
        return total;
    }
    public double calculateTotalBill() {
        double total = 0;
        for (smartphone phone : cart){
            total += phone.getFinalPrice();
        }
        return total;
    }
}
