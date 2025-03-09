package NOOB_MASTER;
import java.util.Scanner;
import java.util.Arrays;
//Tính tổng các số trong danh sách
public class Full28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử : ");
        int n = scanner.nextInt();

        //Tạo mảng để lưu danh sách cac số
        int[] danhsach = new int[n];
        int tong = 0;

        //Nhập các phần tử từ bàn phím
        System.out.print("Nhập các số: ");
        for(int i = 0; i < n; i++){
            danhsach[i] = scanner.nextInt();
            tong += danhsach[i]; //cộng dồn các giá trị
        }
        System.out.print("Tổng các số trong danh sách là : " + tong);
    }
}
