import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x1 :");
        int x1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap y1 :");
        int y1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap x2 :");
        int x2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap y2 :");
        int y2 = Integer.parseInt(sc.nextLine());
        double khoangCach =(double) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.print("Khoang Cach giua hai diem la:" + khoangCach);
    }
}