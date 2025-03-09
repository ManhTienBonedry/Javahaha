package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp Tinh_TB chứa logic tính trung bình của danh sách
class Tinh_TB {
    // Hàm tính trung bình của danh sách, nhận vào mảng số nguyên và số lượng phần tử, trả về kiểu double
    public double tinh_tb(int danhsach[], int n) {
        int tong = 0; // Khởi tạo tổng bằng 0 để tích lũy giá trị các phần tử

        // Tính tổng của các phần tử trong danh sách
        for (int i = 0; i < n; i++) { // Vòng lặp từ 0 đến n-1 để duyệt qua các phần tử
            tong += danhsach[i]; // Cộng dồn từng phần tử vào tổng
        }

        // Tính trung bình
        return (double) tong / n; // Ép kiểu tổng thành double để tránh kết quả nguyên, sau đó chia cho số lượng
    }

    // Lớp J70 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J70 {
        // Phương thức xuat để nhập và xuất kết quả tính trung bình
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập số lượng phần tử trong danh sách : "); // Hiển thị thông báo yêu cầu nhập số lượng (lưu ý lỗi đánh máy "Nhấpj" nên sửa thành "Nhập")
            int n = sc.nextInt(); // Đọc số lượng phần tử từ người dùng

            int[] danhsach = new int[100]; // Khởi tạo mảng số nguyên với kích thước 100 (có thể thay đổi tùy nhu cầu)

            // Nhập phần tử vào danh sách
            System.out.print("Nhập các phần tử : "); // Hiển thị thông báo yêu cầu nhập các phần tử
            for (int i = 0; i < n; i++) { // Vòng lặp để nhập từng phần tử
                danhsach[i] = sc.nextInt(); // Nhập phần tử thứ i và lưu vào mảng
            }

            // Tính trung bình và in kết quả
            double trung_binh = tinh_tb(danhsach, n); // Gọi hàm tính trung bình từ lớp cha (Tinh_TB)
            System.out.println("Giá trị trung bình của danh sách là : " + trung_binh); // In ra kết quả

            //sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
        }
    }
}
