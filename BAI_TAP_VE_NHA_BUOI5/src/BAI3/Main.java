package BAI3;

import BAI1.smartphone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        smartphone smartphone1 = new smartphone(12000000, "Ip 13", 4);
        smartphone smartphone2 = new smartphone(8000000, "Ip 11 promax", 3);
        smartphone smartphone3 = new smartphone(22000000, "Ip 14", 6);
        smartphone smartphone4 = new smartphone(10000000, "Ip 12pro", 10);
        smartphone smartphone5 = new smartphone(9000000, "Ip 12", 7);
        store.addPhoneToStore(smartphone1);
        store.addPhoneToStore(smartphone2);
        store.addPhoneToStore(smartphone3);
        store.addPhoneToStore(smartphone4);
        store.addPhoneToStore(smartphone5);
        System.out.println("Tim theo id");
        smartphone result1 = store.search("SP1");
        if (result1 != null){
            System.out.println("Tim thay: " + result1.getName() + " - " + result1.getPrice());
        } else {
            System.out.println("khong tim thay!");
        }
        System.out.println("Tim theo gia:");
        ArrayList<smartphone> result2 = store.search(10000000, 15000000);
        for (smartphone phone : result2){
            System.out.println(phone.getId() + " - " + phone.getName() + " - " + phone.getPrice());
        }
        System.out.println("Tim theo ten: ");
        ArrayList<smartphone> result3 = store.search("Ip", true);
        for (smartphone phone : result3) {
            System.out.println(phone.getId() + " - " + phone.getName() + " - " + phone.getPrice());
        }
    }
    }
