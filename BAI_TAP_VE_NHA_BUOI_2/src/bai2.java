import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap a :");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b :");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap c :");
        int c = Integer.parseInt(sc.nextLine());
        if(a+b>c && a+c > b && b+c> a){
            if(a == b && b== c&& a==c ){
                System.out.println(" la tam giac deu");
            }
            else if(a==b || b==c || a==c){
                System.out.println("la tam giac can");
            }else {
                System.out.println("la tam giac thuong");
            }
            System.out.println("Chu vi tam giac: " + (a+b+c));
            double p =(double) (a+b + c) /2 ;
            double S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Dien rich tam giac: " + S);

        }else{
            System.out.println("ba canh da nhap khong tao thanh tam giac vua nhap");
        }
    }
}
