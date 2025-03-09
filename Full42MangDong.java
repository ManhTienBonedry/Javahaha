package NOOB_MASTER;
import java.util.ArrayList;
import java.util.Scanner;
//Tạo danh sách các số lẻ từ danh sách : Nhập một các số vè in ra số lẻ


public class Full42MangDong {
    //public static void main(String[] args) {
    public static void MangDong(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng động để lưu trữ các phần tử
        ArrayList<Integer> danhsach = new ArrayList<>(n); //Mảng để lưu các số nguyên
        ArrayList<Integer> danhsachle = new ArrayList<>(n); //Mảng để lưu các số lẻ
        int count_le = 0;

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập các phần tử : ");
        for (int i = 0; i < n; i++) {
            int phantu  = scanner.nextInt();
            danhsach.add(phantu);


        //lọc các phần tử lẻ và thêm vào mảng danhsachle
        if(phantu %2 != 0){
            danhsachle.add(phantu);
            }
        }

        //In các danh sách số lẻ
        System.out.print("Danh sách các số lẻ là : ");
        for(int phantu : danhsachle){
            System.out.print(phantu + " ");
        }
        scanner.close();
    }
}
