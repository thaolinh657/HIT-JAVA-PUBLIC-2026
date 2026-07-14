import java.util.Scanner;

public class bt5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in bang cuu chuong
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + "= " + i * j);
            }
        }
        //tam giac dau sao
        int n = Integer.parseInt(sc.nextLine()); // chieu caoo tam giac
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                System.out.println(" ");
            }
            for(int k = 1 ; k <= 2* i -1 ; k++){
                System.out.print("*" + " ");
            }
        }
    }
}