package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan
import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng
import java.util.StringTokenizer; // Nhập lớp StringTokenizer để phân tách chuỗi thành các từ

// Lớp Dem_So_Luong_Tu chứa logic đếm số lượng từ
class Dem_So_Luong_Tu {
    public int dem_so_luong_tu(String chuoi) {
        StringTokenizer ss = new StringTokenizer(chuoi); // Sử dụng StringTokenizer để đọc từng từ trong chuỗi
        int count = 0; // Biến đếm số lượng từ, khởi tạo bằng 0

        while (ss.hasMoreElements()) { // Kiểm tra xem còn từ nào để đọc không
            ss.nextToken(); // Đọc từ trong chuỗi (không cần lưu vào biến riêng)
            count++; // Tăng biến đếm lên 1 sau mỗi từ được đọc
        }
        return count; // Trả về số lượng từ đã đếm được
    }

    // Lớp public J65 chứa phương thức xuat để chạy chương trình
    public class J65 {
        public void xuat() {
            Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập chuỗi : "); // Hiển thị thông báo yêu cầu người dùng nhập chuỗi
            String chuoi = scanner.nextLine(); // Sử dụng nextLine để đọc cả dòng, bao gồm khoảng trắng

            // Đếm số lượng từ và in ra kết quả
            int soluongtu = dem_so_luong_tu(chuoi); // Gọi hàm đếm số lượng từ (lưu ý: cần truy cập từ đối tượng Dem_So_Luong_Tu)
            System.out.println("Số lượng từ trong chuỗi : " + soluongtu); // In ra kết quả
        }
    }
}
