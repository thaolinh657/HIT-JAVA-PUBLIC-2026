import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh:");
        double r = Double.parseDouble(sc.nextLine());
        System.out.print( r * 2  * 3.14 + " ");
        System.out.print(3.14 * r * r);
    }
}
