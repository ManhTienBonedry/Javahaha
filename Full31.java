package NOOB_MASTER;
import java.util.Scanner;
//Tính trung bình của danh sách : Nhập một danh sách các số và tính tb bằng của danh sách

public class Full31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử : ");
        int n = scanner.nextInt();

        //Tạo mảng để lưu danh sách các số
        int[] ds = new int[n];

        //Nhập các phần tử từ người dùng
        System.out.print("Nhập các số : ");
        for(int i = 0; i < n; i++){ // duyệt qua từng phần tử trong danh sách
            ds[i] = scanner.nextInt(); //Nhập từng phần tử
        }

        //Tính tổng của các phần tử trong danh sách
        int tong = 0;
        for(int i = 0; i < n; i++){ //Duyệt qua từng phần tử trong danh sách
            tong += ds[i]; //cộng từng phần tử vào tổng
        }

        //Tính trung bình
        double trungbinh = (double)tong / n; //ép kiểu tổng về kiểu double

        //In kết quả
        System.out.print("Trung bình của danh sách là : " + trungbinh);
    }
}
