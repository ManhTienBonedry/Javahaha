package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp J62 chứa logic tính số Fibonacci thứ n
//public class J62 {
class Fi_bonacci {
    // Hàm tính số Fibonacci thứ n, nhận vào một số nguyên n và trả về kiểu int
    public int fibonacci(int n) {
        if (n <= 0) { // Kiểm tra nếu n không hợp lệ (nhỏ hơn hoặc bằng 0)
            return -1; // Báo lỗi nếu n không hợp lệ
        } else if (n == 1) { // Kiểm tra nếu n là 1
            return 0; // Nếu n là 1 thì trả về 0 vì số Fibonacci thứ 1 là 0
        } else if (n == 2) { // Kiểm tra nếu n là 2
            return 1; // Nếu n là 2 thì trả về 1 vì số Fibonacci thứ 2 là 1
        } else { // Nếu n > 2 thì tính số Fibonacci theo công thức
            int a = 0; // Khởi tạo biến a với giá trị 0 (Fibonacci thứ 1)
            int b = 1; // Khởi tạo biến b với giá trị 1 (Fibonacci thứ 2)
            int fib = 0; // Biến tạm để lưu giá trị Fibonacci hiện tại

            for (int i = 2; i < n; i++) { // Vòng lặp từ 2 đến n-1 để tính Fibonacci
                fib = a + b; // Tính số Fibonacci tiếp theo bằng tổng của hai số trước
                a = b; // Gán giá trị b cho a để chuẩn bị cho bước tiếp theo
                b = fib; // Gán giá trị fib cho b để chuẩn bị cho bước tiếp theo
            }
            return b; // Trả về giá trị Fibonacci thứ n
        }
    }

    // Hàm main để chạy chương trình
    public class J62 {
        public void xuat() {
            //public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

            System.out.print("Nhập số n để tính số fib thứ n : "); // Hiển thị thông báo yêu cầu nhập số n
            int n = scanner.nextInt(); // Đọc số n từ người dùng

            int result = fibonacci(n); // Gọi hàm fibonacci và lưu kết quả vào biến result
            if (result == -1) { // Kiểm tra nếu result là -1 (báo lỗi)
                System.out.print("Số phải lớn hơn 0"); // In thông báo lỗi
            } else { // Nếu không phải lỗi
                System.out.print("Số fib thứ " + n + " là : " + result); // In kết quả số Fibonacci
            }
        }
    }
}
