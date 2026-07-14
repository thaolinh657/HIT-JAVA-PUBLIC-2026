import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a=n;
        int m = 0;
        while(n > 0 ){
            int k =n % 10; // k la so du cua n khi chia 10
            n /= 10 ;
            m =m* 10 + k;

        }
        if(a == m) {
            System.out.println("La so doi xung");
        }else{
            System.out.println("Khong la so doi xung");
        }
    }
}
