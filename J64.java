package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan
import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Tạo lớp public J64 để chứa chương trình
//public class J64 {
class Dao_Nguoc_Chuoi {
    // Hàm đảo ngược chuỗi, nhận tham số chuỗi kiểu String và trả về chuỗi kiểu String
    public String DaoNguocChuoi(String chuoi) {
        int n = chuoi.length(); // Lấy độ dài của chuỗi và lưu vào biến n
        char[] mangKyTu = chuoi.toCharArray(); // Chuyển chuỗi thành mảng ký tự để dễ dàng thao tác

        // Đảo ngược chuỗi bằng cách hoán đổi các ký tự đầu và cuối
        for (int i = 0; i < n / 2; i++) { // Duyệt từ 0 đến n/2 (chỉ cần duyệt nửa chuỗi vì hoán đổi đối xứng)
            // Hoán đổi 2 ký tự tại vị trí i và n-1-i
            char temp = mangKyTu[i]; // Lưu tạm ký tự tại vị trí i
            mangKyTu[i] = mangKyTu[n - 1 - i]; // Gán ký tự cuối vào vị trí đầu
            mangKyTu[n - 1 - i] = temp; // Gán ký tự đầu vào vị trí cuối
        }
        return new String(mangKyTu); // Trả về chuỗi mới được tạo từ mảng ký tự sau khi đảo ngược
    }

    public class J64 {
        public void xuat() {
            //public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập chuỗi cần đảo ngược: "); // Hiển thị thông báo yêu cầu người dùng nhập chuỗi
            String chuoi = scanner.nextLine(); // Đọc chuỗi từ người dùng, cho phép nhập chuỗi có khoảng trắng

            // Đảo ngược chuỗi và in ra kết quả
            String chuoiDaoNguoc = DaoNguocChuoi(chuoi); // Gọi hàm DaoNguocChuoi để đảo ngược chuỗi
            System.out.println("Chuỗi sau khi đảo ngược: " + chuoiDaoNguoc); // In chuỗi đã đảo ngược

        }
    }
}