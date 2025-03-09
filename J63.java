package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng
import java.util.StringTokenizer; // Nhập lớp StringTokenizer (dù không sử dụng trực tiếp trong mã này)

// Lớp Chuoi_Doi_Xung chứa logic kiểm tra chuỗi đối xứng
class Chuoi_Doi_Xung {
    // Hàm kiểm tra chuỗi đối xứng, nhận vào một chuỗi và trả về kiểu boolean
    public boolean KiemTraDoiXung(String chuoi) {
        int len = chuoi.length(); // Lấy độ dài của chuỗi để sử dụng trong vòng lặp
        // Duyệt chuỗi từ đầu và cuối để kiểm tra đối xứng
        for (int i = 0; i < len / 2; i++) { // Duyệt từ 0 đến độ dài chuỗi chia 2 (chỉ cần kiểm tra nửa chuỗi)
            // Nếu hai ký tự ở vị trí đối xứng không giống nhau
            if (chuoi.charAt(i) != chuoi.charAt(len - 1 - i)) { // So sánh ký tự đầu và cuối
                return false; // Trả về false nếu chuỗi không đối xứng
            }
        }
        return true; // Trả về true nếu chuỗi đối xứng
    }

    // Lớp J63 là inner class chứa phương thức xuat để hiển thị kết quả
    public class J63 {
        // Phương thức xuat để nhập và xuất kết quả kiểm tra chuỗi đối xứng
        public void xuat() {
            Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập chuỗi để kiểm tra : "); // Hiển thị thông báo yêu cầu nhập chuỗi
            String chuoi = sc.nextLine(); // Đọc toàn bộ dòng chuỗi từ người dùng, bao gồm khoảng trắng

            if (KiemTraDoiXung(chuoi)) { // Gọi hàm KiemTraDoiXung để kiểm tra chuỗi
                System.out.print("Chuỗi là đối xứng."); // In kết quả nếu chuỗi là đối xứng
            } else {
                System.out.print("Chuỗi không phải là đối xứng."); // In kết quả nếu chuỗi không đối xứng
            }
        }
    }
}
