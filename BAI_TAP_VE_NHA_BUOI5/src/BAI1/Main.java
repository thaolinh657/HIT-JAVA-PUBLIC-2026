package BAI1;

public class Main {
    public static void main(String[] args) {
        smartphone smartphone1 = new smartphone(12000000, "Ip 13", 4);
        smartphone smartphone2 = new smartphone(8000000, "Ip 11 promax", 3);
        smartphone smartphone3 = new smartphone(22000000, "Ip 14", 6);
        System.out.println("Id smartphone1 : " + smartphone1.getId());
        System.out.println("Id smartphone2 : " + smartphone2.getId());
        System.out.println("Id smartphone3 : " + smartphone3.getId());
        System.out.println("Tong so dien thoai: "+ smartphone.getTotalPhones());
    }
}