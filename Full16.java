package NOOB_MASTER;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//có thể dùng Buff để thay thế cho scanner
import java.util.Scanner;
//Tính số lượng chữ cái trong chuổi : Nhập một chuổi và đếm số lượng chữ cái trong chuỗi
public class Full16 {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Nhập chuỗi có chứa khoảng trắng: ");
//        String chuoi = reader.readLine();

        Scanner scanner = new Scanner(System.in);
        // Nhập chuổi từ bàn phím
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //đếm số lượng chữ cái trong chuỗi
        int soluongchucai = 0;
        for(char kytu : chuoi.toCharArray()){
            if(Character.isLetter(kytu)){ // kiểm tra nếu ký tự là chũ cái
                soluongchucai++; //tăng biến đếm lên 1
            }
        }
        //in kết quả
        //đảo ngược chuỗi( nếu muốn đảo ngược chuỗi )
        //String chuoidaonguoc = new StringBuilder(chuoi).reverse().toString();
        System.out.println("Số lượng chũ cái trong chuỗi là : "+soluongchucai);
    }
}
