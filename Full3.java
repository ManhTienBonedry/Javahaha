package NOOB_MASTER;

import java.util.Scanner;
//Tinhs bình phương của một số : NHâpj một số từ bàn phím và in ra màn hình
public class Full3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NHẬP A : ");
        float a = scanner.nextFloat();

        //Tính bình phương của số
        float squared_a = a * a;
        //in ra kết quả
        System.out.println("Bình phương của số là : "+squared_a);
    }
}
