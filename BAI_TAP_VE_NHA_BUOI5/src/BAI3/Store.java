package BAI3;

import BAI1.smartphone;
import BAI2.Customer;

import java.util.ArrayList;

public class Store {
    private ArrayList<smartphone> inventory;
    public Store() {
        this.inventory = new ArrayList<>();
    }
    public void addPhoneToStore(smartphone phone){
        inventory.add(phone);
    }
    public smartphone search(String id){
        for (smartphone phone : inventory){
            if (phone.getId().equals(id)){
                return phone;
            }
        }
        return null;
    }
    public ArrayList<smartphone> search(double minPrice, double maxPrice){
        ArrayList<smartphone> result = new ArrayList<>();
        for (smartphone phone : inventory) {
            if (phone.getPrice() >= minPrice
                    && phone.getPrice() <= maxPrice) {
                result.add(phone);
            }
        }
        return result;
    }
    public ArrayList<smartphone> search(String keyword, boolean isName) {
        ArrayList<smartphone> result = new ArrayList<>();
        if (isName) {
            for (smartphone phone : inventory) {
                if (phone.getName().toLowerCase()
                        .contains(keyword.toLowerCase())) {
                    result.add(phone);
                }
            }
        }
        return result;
    }
    public ArrayList<smartphone> getInventory() {
        return new ArrayList<>(inventory);
    }
    public void sellPhone(Customer customer, String phoneId){
        smartphone phone = search(phoneId);
        if (phone == null){
            System.out.println("Khong tim thay phone!");
            return;
        } if (phone.getStock() <= 0){
            System.out.println("dien thoai da het hang.");
            return;
        }
        phone.setStock(phone.getStock() - 1);
        customer.addPhone(phone);
        System.out.println("Ban thanh cong: " + phone.getName());
    }
    public double calculateInventoryValue(){
        double total = 0;
        for (smartphone phone : inventory){
            total += phone.getFinalPrice() * phone.getStock();
        }
        return total;
    }
}
