package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp Tinh_GiaiThua chứa logic tính giai thừa của số n
class Tinh_GiaiThua {
    // Hàm tính giai thừa của số n, nhận vào một số nguyên n và trả về kiểu long
    public long TinhGiaiThua(int n) {
        if (n == 0 || n == 1) { // Kiểm tra nếu n là 0 hoặc 1
            return 1; // Giai thừa của 0 và 1 là 1
        } else { // Nếu n > 1
            return n * TinhGiaiThua(n - 1); // Tính giai thừa bằng cách nhân n với giai thừa của (n-1) (đệ quy)
        }
    }

    // Lớp J61 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J61 {
        // Phương thức xuat để nhập và xuất kết quả tính giai thừa
        public void xuat() {
            Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập một số : "); // Hiển thị thông báo yêu cầu nhập số
            int num = scanner.nextInt(); // Đọc số từ người dùng

            System.out.print("Giai thừa của " + num + " là " + TinhGiaiThua(num)); // Gọi hàm TinhGiaiThua và in kết quả

        }
    }
}

