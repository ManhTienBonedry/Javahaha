package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp Tim_so_nho_nhat chứa logic tìm số nhỏ nhất trong danh sách
class Tim_so_nho_nhat {
    // Hàm tìm số nhỏ nhất trong danh sách, nhận vào mảng số nguyên và số lượng phần tử, trả về kiểu int
    public static int Tim_sonho_nhat(int danhsach[], int n) {
        int min_value = danhsach[0]; // Khởi tạo giá trị nhỏ nhất là phần tử đầu tiên của mảng

        // Duyệt qua mảng để tìm số nhỏ nhất
        for (int i = 0; i < n; i++) { // Vòng lặp từ 0 đến n-1 để duyệt qua các phần tử
            if (danhsach[i] < min_value) { // So sánh từng phần tử với giá trị nhỏ nhất hiện tại
                min_value = danhsach[i]; // Cập nhật min_value nếu tìm thấy số nhỏ hơn
            }
        }
        return min_value; // Trả về giá trị nhỏ nhất
    }

    // Lớp J69 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J69 {
        // Phương thức xuat để nhập và xuất kết quả tìm số nhỏ nhất
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập số lượng phần tử trong danh sách : "); // Hiển thị thông báo yêu cầu nhập số lượng
            int n = sc.nextInt(); // Đọc số lượng phần tử từ người dùng

            int[] danhsach = new int[100]; // Khởi tạo mảng số nguyên với kích thước 100 (có thể thay đổi tùy nhu cầu)

            System.out.print("Nhập các phần tử : "); // Hiển thị thông báo yêu cầu nhập các phần tử
            for (int i = 0; i < n; i++) { // Vòng lặp để nhập từng phần tử
                danhsach[i] = sc.nextInt(); // Nhập phần tử thứ i và lưu vào mảng
            }

            // Tìm số nhỏ nhất và in kết quả
            int so_nho_nhat = Tim_sonho_nhat(danhsach, n); // Gọi hàm tìm số nhỏ nhất từ lớp cha (Tim_so_nho_nhat)
            System.out.print("Số nhỏ nhất trong danh sách : " + so_nho_nhat); // In ra kết quả

            //sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
        }
    }
}
