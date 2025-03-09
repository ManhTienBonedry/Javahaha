package NOOB_MASTER;
import java.util.Scanner;
//Tính tổng các số từ 1 đến n
public class Full13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập một số từ bàn phím
        System.out.print("Nhập một số n : ");
        int n = scanner.nextInt();
        //Tính tổng từ 1 đến n
        int tong = 0;
        for(int i = 1; i <= n; i++){
            tong += i;
        }
        //in kết quả
        System.out.println("tổng các số từ 1 đến "+n+" là : "+tong);
    }
}
