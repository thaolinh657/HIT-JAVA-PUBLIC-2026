import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau: ");
        String matKhau = sc.nextLine();
        String cleanMK = matKhau.trim();// làm sạch mat khau = cách bỏ khoảng trắng giua 2 đầu
        int length = cleanMK.length();
        boolean demSo = false;
        boolean demChuHoa = false;
        for (int i = 0; i < length; i++) {
            char c = cleanMK.charAt(i);
            if (c >= '0' && c <= '9') demSo = true;
            if (c >= 'A' && c <= 'Z') demChuHoa = true;
        }
        if (length < 8) {
            System.out.println("Mat khau khong hop le");
            System.out.println("Mat khau can phai co du 8 ki tu(mat khau hien tai sang co do dai " + length + ")");
        }
        if (!demSo) {
            System.out.println("Mat khau khong hop le");
            System.out.println("Mat khau can phai co it nhat 1 chu so");
        }
        if (!demChuHoa) {
            System.out.println("Mat khau khong hop le");
            System.out.println("Mat khau can phai co it nhat 1 chu in hoa");
        }
        if(length >= 8 && demSo && demChuHoa){
            System.out.println("Mat khau da nhap hop le");
        }
    }
}
