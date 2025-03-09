package NOOB_MASTER;
import java.util.Scanner;
//in bảng cửu chương cho một số
public class Full47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số : ");
        int so = scanner.nextInt();

        //In bảng cửu chương của số đó
        System.out.println("bảng cửu chương của "+ so );
        for(int i = 1; i <= 10; i++){
            System.out.println(so + " x " + i +" = " + so*i);
        }
        scanner.close();
    }
}
