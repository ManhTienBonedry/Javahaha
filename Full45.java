package NOOB_MASTER;
import java.util.Scanner;
//Tạo ma trận 3 x 3 và tính tích các phần tử

public class Full45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matran = new int[3][3]; //Ma trận 3 x 3
        long tich = 1; //biến để lưu tích các phần tử

        //NHập các phần tử của ma trận 3x3
        System.out.println("Nhập các phần tử của ma trận 3x3 : ");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("Phần tử [ "+i+" ][ "+j+" ] : ");
                matran[i][j] = scanner.nextInt();
                tich *= matran[i][j];
            }
        }
        //in ra tích các phần tử
        System.out.println("Tích các phần tử trong ma trận là : "+tich);
        scanner.close();
    }
}
