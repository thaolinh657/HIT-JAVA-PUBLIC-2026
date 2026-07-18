import java.util.Scanner;

public class bai4 {

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    public static int countFailedStudents(double[] arr) {
        int cnt = 0;
        for (double x : arr) {
            if (x < 5)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong hoc sinh: ");
        int N = Integer.parseInt(sc.nextLine());

        if (N <= 0) {
            System.out.println("So luong hoc sinh phai lon hon 0!");
            return;
        }

        double[] diemSo = new double[N];

        for (int i = 0; i < N; i++) {
            do {
                System.out.print("Nhap diem hoc sinh thu " + (i + 1) + ": ");
                diemSo[i] = Double.parseDouble(sc.nextLine());
            } while (diemSo[i] < 0 || diemSo[i] > 10);
        }

        System.out.println("Diem cao nhat: " + findMax(diemSo));
        System.out.println("Diem trung binh: " + calculateAverage(diemSo));
        System.out.println("So hoc sinh duoi trung binh: " + countFailedStudents(diemSo));

        sc.close();
    }
}