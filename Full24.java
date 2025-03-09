package NOOB_MASTER;
import java.util.Scanner;
//in ra hình vuông sao
public class Full24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số dòng và số cột từ bàn phím
        System.out.print("Nhập số dòng : ");
        int sodong = scanner.nextInt();
        System.out.print("Nhập vào số cột : ");
        int socot = scanner.nextInt();

        //in hình vuông sao
        for(int i = 0; i<= sodong; i++){
            for(int j = 0; j <= socot; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
