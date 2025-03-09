package NOOB_MASTER;
import java.util.Scanner;
//in ra tam giác sao : Nhập số dòng và in ra tam giác sao.
public class Full23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng : ");
        int sodong = scanner.nextInt();

        //in ra tam giác sao
        for(int i = 1; i <= sodong; i++){ //duyệt qua từng dòng
            for(int j = 1; j <= i; j++){
                System.out.print("*");// in ra số dao tương ứng
            }
            System.out.println();
        }
    }
}
