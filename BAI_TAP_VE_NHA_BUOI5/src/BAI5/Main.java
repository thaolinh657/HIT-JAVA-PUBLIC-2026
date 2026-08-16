package BAI5;

import BAI1.smartphone;
import BAI2.Customer;
import BAI3.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        smartphone smartphone1 = new smartphone(12000, "Ip 13", 4);
        smartphone smartphone2 = new smartphone(8000, "Ip 11 promax", 3);
        smartphone smartphone3 = new smartphone(22000, "Ip 14", 6);
        store.addPhoneToStore(smartphone1);
        store.addPhoneToStore(smartphone2);
        store.addPhoneToStore(smartphone3);
        Customer customer = new Customer("Nguyen Thi Ha Chi");
        store.sellPhone(customer, smartphone1.getId());
        store.sellPhone(customer, smartphone2.getId());
        System.out.println("VAT 10%: ");
        System.out.println("Tong tien khach phai tra: " + customer.calculateTotalBill());
        System.out.println("Gia tri kho hang: " + store.calculateInventoryValue());
        smartphone.setVatTax(0.08);
        System.out.println("VAT 8%:");
        System.out.println("Tong tien khach phai tra: " + customer.calculateTotalBill());
        System.out.println("Gia tri kho hang: " + store.calculateInventoryValue());
    }
    }

