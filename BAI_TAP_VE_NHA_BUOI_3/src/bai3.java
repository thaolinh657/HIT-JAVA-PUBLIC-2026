import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Tạo các số ngẫu nhiên
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        int c = rand.nextInt(201);

        // Hiển thị phép toán
        System.out.println(a + " + " + b + " = " + c);

        boolean check = (a + b == c);
        String expected = check ? "phep tinh dung" : "phep tinh sai";

        System.out.print("Nhap cau tra loi cua nguoi dung: ");
        String nguoiDung = sc.nextLine().trim().toLowerCase();


        if (nguoiDung.equals(expected)) {
            System.out.println("Bạn đã trả lời đúng");
        } else {
            System.out.println("Bạn đã trả lời sai");
        }
    }
}
