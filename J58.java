package NOOB_MASTER;
import java.util.Scanner;
//tạo hàm tính diện tích hình chữ nhật
public class J58 {
    //hàm tính diện tích hình chữ nhật
    public static double Tinh_S_HCN(double chieudai, double chieurong){
        return chieudai * chieurong; // diện tích bằng dài nhân rộng
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp chiều dài của HCN : ");
        double chieudai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của HCN : ");
        double chieurong = scanner.nextDouble();

        //Tính kết quả và in ra màn hình
        double S = Tinh_S_HCN(chieudai, chieurong);
        //gọi hàm tính diện tích hcn và lưu kết quả vào biến diện tích
        System.out.println("Diện tích của HCN là : " + S);
    }
}
