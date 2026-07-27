import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        for(int i = 0 ; i < 3 ; i ++) {
            arr[i] =  sc.nextInt();
        }
        //sapxep
        for(int i = 0 ;i < 3 ; i++){
            for(int j = i ; j < 3 ; j++){
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
