package NOOB_MASTER;
import java.util.ArrayList;
import java.util.Scanner;
//Tính tổng các số chẵn trong danh sách
public class Full46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.println("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        int tong = 0;
        int[] danhsach = new int[n];
        //Nhập các phần tử vào danh sách
        System.out.println("Nhập các phần tử : ");
        for(int i = 0; i < n; i++){
            danhsach[i] = scanner.nextInt();
            if(danhsach[i] % 2 == 0){
                tong += danhsach[i];
            }
        }
        System.out.println("Tổng các số chẵn trong danh sách là : " + tong);
        scanner.close();
    }
}
