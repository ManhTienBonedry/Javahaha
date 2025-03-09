package NOOB_MASTER;
import java.util.Scanner;
import java.util.Arrays;
//Sắp xếp danh sách : Nhập một danh sách các số và sắp xếp chúng theo thứ tự tăng dần
public class Full27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử : ");
        int n = scanner.nextInt();

        //Tạo mảng để lưu danh sách các số
        int[] danhsach = new int[n];

        //Nhập các phần tử từ người dùng
        System.out.print("Nhập các số : ");
        for(int i = 0; i< n; i++){//duyệt qua từng phần tử trong danh sách
            danhsach[i] = scanner.nextInt();
        }
        //sắp xếp theo thứ tự tăng dần
        Arrays.sort(danhsach); //hàm sort sẽ sắp xếp danh sách
        //in danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp : ");
        for(int num : danhsach) { //duyệt qua từng phần tử trong danh sách
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
