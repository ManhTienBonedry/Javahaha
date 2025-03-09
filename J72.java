package NOOB_MASTER;
import java.util.HashMap; // Thư viện HashMap trong Java
import java.util.Scanner; // Thư viện Scanner để nhập dữ liệu từ người dùng

public class J72 {
    // Hàm xóa phần tử khỏi từ điển (HashMap)
    public static void xoaPhanTu(HashMap<String, Integer> tuDien, String khoa) {
        if (tuDien.containsKey(khoa)) { // Kiểm tra xem khóa có tồn tại trong HashMap không
            tuDien.remove(khoa); // Xóa phần tử với khóa tương ứng
            System.out.println("Đã xóa khóa '" + khoa + "' khỏi từ điển.");
        } else { // Nếu khóa không tồn tại
            System.out.println("Khóa '" + khoa + "' không tồn tại trong từ điển.");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> tuDien = new HashMap<>(); // Tạo một HashMap trống
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        // Nhập số lượng cặp khóa-giá trị từ người dùng
        System.out.print("Nhập số lượng cặp khóa-giá trị: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm sau khi nhập số

        // Nhập các cặp khóa-giá trị từ bàn phím
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập khóa " + (i + 1) + ": ");
            String khoa = scanner.nextLine();
            System.out.print("Nhập giá trị cho khóa " + khoa + ": ");
            int giaTri = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm sau khi nhập số
            tuDien.put(khoa, giaTri); // Thêm cặp khóa-giá trị vào HashMap
        }

        // In từ điển sau khi nhập
        System.out.println("Từ điển sau khi nhập: ");
        for (HashMap.Entry<String, Integer> entry : tuDien.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Nhập khóa cần xóa từ người dùng
        System.out.print("Nhập khóa cần xóa: ");
        String khoaXoa = scanner.nextLine();

        // Xóa phần tử và in kết quả
        xoaPhanTu(tuDien, khoaXoa);

        // In từ điển sau khi xóa phần tử
        System.out.println("Từ điển sau khi xóa: ");
        for (HashMap.Entry<String, Integer> entry : tuDien.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Đóng scanner
        scanner.close();
    }
}
