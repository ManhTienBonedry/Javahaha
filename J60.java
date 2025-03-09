package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp KiemTraNguyen_To chứa logic kiểm tra số nguyên tố
class KiemTraNguyen_To {
    // Hàm kiểm tra số nguyên tố, nhận vào một số nguyên n và trả về kiểu boolean
    public boolean KiemTraNguyenTo(int n) {
        if (n <= 1) { // Kiểm tra nếu n nhỏ hơn hoặc bằng 1
            return false; // Số nguyên tố phải lớn hơn 1, trả về false
        }
        for (int i = 2; i * i <= n; i++) { // Vòng lặp từ 2 đến căn bậc hai của n (tối ưu hóa)
            if (n % i == 0) { // Nếu n chia hết cho i (tức là i là ước của n)
                return false; // n không phải là số nguyên tố, trả về false
            }
        }
        return true; // Nếu không tìm thấy ước nào khác ngoài 1 và chính nó, n là số nguyên tố
    }

    // Lớp J60 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J60 {
        // Phương thức xuat để nhập và xuất kết quả kiểm tra số nguyên tố
        public void xuat() {
            Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập một số : "); // Hiển thị thông báo yêu cầu nhập số
            int num = scanner.nextInt(); // Đọc số từ người dùng

            if (KiemTraNguyenTo(num)) { // Gọi hàm KiemTraNguyenTo để kiểm tra số num
                System.out.print(num + " là số nguyên tố."); // In kết quả nếu num là số nguyên tố
            } else {
                System.out.print(num + " không là số nguyên tố."); // In kết quả nếu num không phải số nguyên tố
            }
        }
    }
}
