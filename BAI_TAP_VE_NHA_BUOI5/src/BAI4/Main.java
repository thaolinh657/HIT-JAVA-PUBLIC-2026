package BAI4;

import BAI1.smartphone;
import BAI2.Customer;
import BAI3.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("Nguyen Thi Ha Chi");
        smartphone iphone15 = new smartphone(23000, "Iphone15", 10);
        store.addPhoneToStore(iphone15);
        System.out.println("Truoc khi ban: ");
        System.out.println("Gia: " + store.search(iphone15.getId()).getPrice() + " trieu");
        System.out.println("Stock: " + store.search(iphone15.getId()).getStock());
        store.sellPhone(customer, iphone15.getId());
        System.out.println("Sau khi ban: ");
        System.out.println("Stock trong kho: " + store.search(iphone15.getId()).getStock());
        System.out.println("so phone co trong gio: " + customer.getCart().size());
        store.search(iphone15.getId()).setPrice(25000);
        System.out.println("Sau tang gia: ");
        System.out.println("Gia ip trong kho: " + store.search(iphone15.getId()).getPrice() + " trieu");
        System.out.println("Gia ip trong gi khach: " + customer.getCart().get(0).getPrice() + " trieu" );
    }
}
