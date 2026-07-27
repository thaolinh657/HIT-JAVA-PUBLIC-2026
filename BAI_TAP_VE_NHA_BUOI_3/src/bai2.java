import java.util.Scanner;

public class bai2 {
    public static boolean ktra(String s){
        int trai = 0 ;
        int phai = s.length() -1 ;
        boolean check = false;
        while(trai < phai){
            if(s.charAt(trai) !=s.charAt(phai)) return false;
                trai++;
                phai--;

        }return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(ktra(s))
        System.out.println(s + " chuoi nay doi xung");
        else System.out.println("chuoi nay khong doi ung");
    }

}
