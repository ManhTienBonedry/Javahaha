package NOOB_MASTER;
import java.util.Scanner;
//Tạo danh sách các số Fi từ 0 đến n
public class Full48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số Fi từ bàn phím
        System.out.print("Nhập một số n : ");
        int n = scanner.nextInt();

        //tạo mảng để lưu danh sách các số Fi
        int[] fibonacci = new int[100];
        int count = 0; //Biến đếm sô lượng số Fi đã lưu

        int a = 0;
        int b = 1;

        while(a <= n){
            fibonacci[count] = a;
            count++; //Tăng biến đếm
            int next = a + b; //Tính số Fi tiếp theo
            a = b; //cập nhật số Fi thứ 2
            b = next; //cập nhật số Fi tiếp theo
        }

        //in danh sách các số Fi
        System.out.println("Danh sách các số Fi từ 0 đến "+ n + " là : ");
        for(int i = 0;i < count; i++){
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
