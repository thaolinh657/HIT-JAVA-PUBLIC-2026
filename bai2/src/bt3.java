import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int giaiThua = 1;
        int tongChan = 0 ;
        for(int i = 1; i <= n ; i++){
            giaiThua *= i;
            if(i%2 ==0){
                tongChan+=i;
            }
        }
        System.out.println(giaiThua);
        System.out.println(tongChan);

    }
}
