package NOOB_MASTER;
import java.util.Arrays;
import java.util.Scanner;
//Tìm số lớn nhất tring danh sách
public class Full29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số lượng phần tử trong danh sách
        System.out.println("Nhập số lượng phần tử : ");
        int n  = scanner.nextInt();

        //Tạo mảng để lưu danh sách các số
        int[] danhsach = new int[n];
        //nhập các phân tử tư người dùng
        System.out.println("Nhập các số : ");
        for(int i = 0; i < n; i++){
            danhsach[i] = scanner.nextInt();
        }
        //tìm số lớn nhất
        int max_num = danhsach[0]; // giả sử số đầu tiên là lớn nhất
        for(int i =1; i < n; i++) {
            if (danhsach[i] > max_num) {// nếu tìm thấy số lớn hơn
                max_num = danhsach[i]; // cập  nhật số lớn nhất
            }
           // System.out.println("Số lớn nhất trong danh sách là : " + max_num);
        }
        System.out.println("Số lớn nhất trong danh sách là : " + max_num);
        scanner.close();
    }
}
