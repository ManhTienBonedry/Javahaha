package NOOB_MASTER;
import java.util.Scanner;
//Tạo chuỗi từ các phần tử trong danh sách
public class Full49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Tạo mảng tĩnh để lưu danh sách phần tử
        String[] danhsach = new String[100]; //Giả sử duyệt tối đa 100 phần tử
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            danhsach[i] = scanner.nextLine();
        }
        //Tạo chuỗi từ danh sách
        StringBuilder chuoi = new StringBuilder();
        for(int i = 0; i < n; i++){
            chuoi.append(danhsach[i]).append(" ");
        }

        //in chuỗi
        System.out.println("Chuỗi được tạo ra từ danh sách là : " + chuoi.toString());
    }
}
