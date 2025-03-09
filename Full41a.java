package NOOB_MASTER;
import java.util.Scanner;
//tạo danh sach các số chẵn từ danh sách :Nhập một danh sách các số và tạo danh sách các số chẵn
public class Full41a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chọn kiểu mảng  (1 : Mảng động, 2: Mảng tĩnh) : ");
        int choice = scanner.nextInt();

        if(choice == 1){
            Full41b b = new Full41b();
            b.MangDong();
        }else if(choice == 2){
            Full41c c = new Full41c();
            c.MangTinh();
        }else{
            System.out.println("Lựa chọn không hợp lệ.");
        }
        scanner.close();
    }
}
