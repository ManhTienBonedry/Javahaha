package NOOB_MASTER;
import java.util.Scanner;
import java.util.Vector;
public class Full49b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Nhập các phần tử trong danh sách
        Vector<String> danhsach = new Vector<>();
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + ( i + 1 ) + " : ");
            String phantu = scanner.nextLine();
            danhsach.add(phantu);
        }

        //Tạo chuỗi từ danh sách
        StringBuilder chuoi = new StringBuilder();
        for(String s :  danhsach){
            chuoi.append(s).append(" ");
        }

        //In chuỗi
        System.out.println("Chuỗi được tạo là : " + chuoi);
    }
}
