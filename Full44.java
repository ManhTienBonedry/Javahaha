package NOOB_MASTER;
import java.util.Scanner;
//Tạo ma trận 2 x 2 và tính tổng các phần tử
public class Full44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khai báo ma trận 2x2
        int[][] matran = new int[2][2];
        //Nhập các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận 2x2 : ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Phần tử [ " + i + " ][ " + j + " ] : ");
                matran[i][j] = scanner.nextInt();
            }
        }

        //Tính tổng các phần tử
        int tong = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                tong += matran[i][j];
            }
        }

        //in ra tổng các phần tử
        System.out.println("Tổng các phần tử trong ma trận là : " + tong);
    }
}
