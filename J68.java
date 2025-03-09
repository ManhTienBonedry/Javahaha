package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp Tim_So_Lon_Nhat chứa logic tìm số lớn nhất trong danh sách
class Tim_So_Lon_Nhat {
    // Hàm tìm số lớn nhất trong danh sách, nhận vào mảng số nguyên và số lượng phần tử, trả về kiểu int
    public int Tim_so_lon_nhat(int danhsach[], int n) {
        int max_value = danhsach[0]; // Khởi tạo giá trị lớn nhất ban đầu bằng phần tử đầu tiên của mảng

        // Duyệt qua mảng để tìm số lớn nhất
        for (int i = 0; i < n; i++) { // Vòng lặp từ 0 đến n-1 để duyệt qua các phần tử
            if (danhsach[i] > max_value) { // So sánh từng phần tử với giá trị lớn nhất hiện tại
                max_value = danhsach[i]; // Cập nhật max_value nếu tìm thấy số lớn hơn
            }
        }
        return max_value; // Trả về giá trị lớn nhất
    }

    // Lớp J68 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J68 {
        // Phương thức xuat để nhập và xuất kết quả tìm số lớn nhất
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập số lượng phần tử trong danh sách : "); // Hiển thị thông báo yêu cầu nhập số lượng
            int n = sc.nextInt(); // Đọc số lượng phần tử từ người dùng

            int[] danhsach = new int[100]; // Khởi tạo mảng số nguyên với kích thước 100 (có thể thay đổi tùy nhu cầu)

            // Nhập các phần tử vào danh sách
            System.out.print("Nhập các phần tử : "); // Hiển thị thông báo yêu cầu nhập các phần tử
            for (int i = 0; i < n; i++) { // Vòng lặp để nhập từng phần tử
                danhsach[i] = sc.nextInt(); // Nhập phần tử thứ i và lưu vào mảng
            }

            // Tìm số lớn nhất và in kết quả
            int so_lonnhat = Tim_so_lon_nhat(danhsach, n); // Gọi hàm tìm số lớn nhất từ lớp cha (Tim_So_Lon_Nhat)
            System.out.print("Số lớn nhất trong danh sách là : " + so_lonnhat); // In ra kết quả

            //sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
        }
    }
}
