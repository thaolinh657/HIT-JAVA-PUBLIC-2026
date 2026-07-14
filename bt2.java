import java.sql.SQLOutput;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nam = Integer.parseInt(sc.nextLine());
        if(Nam %4==0){
            System.out.println("La nam nhuan");
        }else{
            System.out.println("Khong phai la nam nhuan");
        }
    }
}
