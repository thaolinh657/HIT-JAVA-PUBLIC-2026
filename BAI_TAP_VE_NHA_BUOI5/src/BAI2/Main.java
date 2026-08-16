package BAI2;

import BAI1.smartphone;

public class Main {
    public static void main(String[] args) {
        smartphone smartphone1 = new smartphone(12000000, "Ip 13", 4);
        smartphone smartphone2 = new smartphone(8000000, "Ip 11 promax", 3);
        Customer customer = new Customer("Nguyen Thi Ha Chi");
        customer.addPhone(smartphone1);
        customer.addPhone(smartphone2);
        System.out.println("so phone ban dau: " + customer.getCart().size());
        customer.getCart().clear();
        System.out.println("So phone sau khi xoa: " + customer.getCart().size());

    }

}
