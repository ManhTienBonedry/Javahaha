package NOOB_MASTER;
import java.util.Scanner;
//Kiểm tra một số nhập từ bàn phím là số chẵn hay số lẻ
public class Full10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số : ");
        int a = scanner.nextInt();

        //Kiểm tra chẵn hay lẻ
        if(a % 2 == 0){
            System.out.println("Số "+a+" là số chẵn.");
        }else{
            System.out.println("Số "+a+" là số lẻ.");
        }
    }
}
