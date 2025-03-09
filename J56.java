package NOOB_MASTER;
import java.util.Scanner;
// hàm kiểm tra số hoàn hảo

public class J56 {
    // Hàm kiểm tra số hoàn hảo
    public static boolean kiemTraSoHoanHao(int n) {
        int tongUoc = 0; // Khởi tạo biến tổng các ước của n
        for (int i = 1; i < n; i++) { // Duyệt từ 1 đến n-1
            if (n % i == 0) { // Kiểm tra nếu i là ước của n
                tongUoc += i; // Cộng i vào tổng các ước
            }
        }
        return tongUoc == n; // Kiểm tra tổng các ước có bằng n không
    }

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ bàn phím
        System.out.print("Nhập một số: "); // Xuất thông báo nhập số
        int so = scanner.nextInt(); // Nhập số từ bàn phím

        // Kiểm tra và in kết quả
        if (kiemTraSoHoanHao(so)) { // Nếu số so là số hoàn hảo
            System.out.println(so + " là số hoàn hảo."); // Xuất kết quả
        } else { // Ngược lại nếu số so không phải là số hoàn hảo
            System.out.println(so + " không phải là số hoàn hảo."); // Xuất kết quả
        }

        // Đóng Scanner
        scanner.close();
    }
}
