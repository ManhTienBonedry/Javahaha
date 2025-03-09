package NOOB_MASTER;
import java.util.Scanner;
//Tạo danh sách từ chuỗi
public class Full26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập một chuỗi từ người dùng
        System.out.print("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //Giới hạn số lượng từ (giả sử tối đa 100 từ)
        final int Maxtu = 100; //dùng final thay cho const trong C++
        String[] danhsachtu = chuoi.split("\\s+"); //tăng các từ dựa trên khoảng trắng
        int sotu = Math.min(danhsachtu.length, Maxtu);

        System.out.println("Danh sách các từ là : ");
        for(int i = 0; i< sotu; i++){
            System.out.print(danhsachtu[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
