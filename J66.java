package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan
import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng
import java.util.StringTokenizer; // Nhập lớp StringTokenizer (dù không sử dụng trực tiếp trong mã này)

// Lớp Dem_So_Luong_Kytu chứa logic đếm số lượng ký tự 'a'
class Dem_So_Luong_Kytu {
    // Hàm đếm số lượng ký tự 'a', nhận vào một chuỗi và trả về kiểu int
    public int dem_ky_tu(String chuoi) {
        int count = 0; // Biến đếm số lượng ký tự 'a', khởi tạo bằng 0
        for (char kytu : chuoi.toCharArray()) { // Duyệt qua từng ký tự trong chuỗi bằng cách chuyển chuỗi thành mảng ký tự
            if (kytu == 'a') { // Nếu ký tự là 'a' (chỉ kiểm tra chữ thường)
                count++; // Tăng biến đếm lên 1
            }
        }
        return count; // Trả về số lượng ký tự 'a' đã đếm được
    }

    // Lớp J66 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J66 {
        // Phương thức xuat để nhập và xuất kết quả đếm số lượng ký tự 'a'
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập chuỗi : "); // Hiển thị thông báo yêu cầu người dùng nhập chuỗi
            String chuoi = sc.nextLine(); // Sử dụng nextLine để đọc cả dòng, bao gồm khoảng trắng

            // Đếm số lượng ký tự 'a' và in ra kết quả
            int soluonga = dem_ky_tu(chuoi); // Gọi hàm đếm số lượng ký tự 'a' từ lớp cha (Dem_So_Luong_Kytu)
            System.out.println("Số lượng ký tự 'a' trong chuỗi : " + soluonga); // In ra kết quả

        }
    }
}
