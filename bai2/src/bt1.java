import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  chieuDai = Integer.parseInt(sc.nextLine());
        int chieuRong = Integer.parseInt(sc.nextLine());
        System.out.println("Chu vi HCN: " + 2*(chieuDai+chieuRong));
        System.out.println("Dien tich HCN: " + chieuDai*chieuRong);
    }
}
