import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String thongTin = scanner.nextLine();

        // 1. Loại bỏ khoảng trắng 2 đầu và tách mảng theo dấu "-"
        String[] parts = thongTin.trim().split("-");

        if (parts.length < 4) {
            System.out.println("Thông tin nhập vào không đúng định dạng!");
            return;
        }

        // 2. Trích xuất và trim() các trường thông tin
        String maNhanVien = parts[0].trim();// phan 1 cua chuoi
        String tenNhanVien = parts[1].trim();//2
        String namSinh = parts[2].trim();//3
        String phongBan = parts[3].trim();//4

        // 3. Chuẩn hóa họ tên
        String formattedName = capitalizeName(tenNhanVien);

        if (phongBan.toLowerCase().contains("kỹ thuật") || phongBan.toLowerCase().contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }
        int birthYear = Integer.parseInt(namSinh);
        int age = 2026 - birthYear;

        System.out.println("Mã nhân viên: " + maNhanVien + " | Họ và tên: " + formattedName + " | Tuổi: " + age + " | Bộ phận: " + phongBan);
    }

    public static String capitalizeName(String name) {
        String[] words = name.split("\\s+");
        String result = "";
     for (int i = 0; i < words.length; i++) {
        String word = words[i];
        if (word.length() > 0) {
            // Viết hoa chữ đầu, viết thường các chữ sau
            String firstChar = word.substring(0, 1).toUpperCase();
            String remaining = word.substring(1).toLowerCase();

            result += firstChar + remaining;
            if (i < words.length - 1) {
                result += " "; // Thêm khoảng trắng giữa các từ
            }
        }
    }
        return result.trim();
}
}