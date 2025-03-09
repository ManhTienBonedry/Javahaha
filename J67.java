package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp Tinh_tong_cac_so_trongds chứa logic tính tổng các số trong danh sách
class Tinh_tong_cac_so_trongds {
    // Hàm tính tổng các số trong danh sách, nhận vào mảng số nguyên và số lượng phần tử, trả về kiểu int
    public int tinh_tong_danh_sach(int danhsach[], int n) {
        int tong = 0; // Biến lưu tổng, khởi tạo bằng 0

        // Duyệt qua mảng và tính tổng
        for (int i = 0; i < n; i++) { // Vòng lặp từ 0 đến n-1 để duyệt qua các phần tử
            tong += danhsach[i]; // Cộng giá trị phần tử thứ i vào tổng
        }
        return tong; // Trả về tổng các số trong danh sách
    }

    // Lớp J67 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J67 {
        // Phương thức xuat để nhập và xuất kết quả tính tổng
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            // Nhập số lượng phần tử trong danh sách
            System.out.print("Nhập số lượng từ trong danh sách : "); // Hiển thị thông báo yêu cầu nhập số lượng
            int n = sc.nextInt(); // Đọc số lượng phần tử từ người dùng

            int[] danhsach = new int[100]; // Khởi tạo mảng số nguyên với kích thước 100 (có thể thay đổi tùy nhu cầu)
            // Nhập các phần tử vào danh sách
            System.out.print("Nhập các phần tử : "); // Hiển thị thông báo yêu cầu nhập các phần tử
            for (int i = 0; i < n; i++) { // Vòng lặp để nhập từng phần tử
                danhsach[i] = sc.nextInt(); // Nhập phần tử thứ i và lưu vào mảng
            }

            // Tính tổng và in kết quả
            int tong = tinh_tong_danh_sach(danhsach, n); // Gọi hàm tính tổng từ lớp cha (Tinh_tong_cac_so_trongds)
            System.out.println("Tổng của các số trong danh sách là : " + tong); // In ra kết quả tổng

            //sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
        }
    }
}
