package NOOB_MASTER;
import java.util.Scanner;
// tạo hàm tính diện tích hình vuông
public class J57 {
    public static double TinhDienTichHV(double canh){
        return canh*canh;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh của hình v : ");
        double canh = scanner.nextDouble();

        //Tính và in kết quả
        double S = TinhDienTichHV(canh);
        System.out.println("Diện tích hình vuông là : " + S);
    }
}
