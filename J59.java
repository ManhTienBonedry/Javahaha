package NOOB_MASTER;
//tạo hàm tính diện tích hình tròn
import java.util.Scanner;
public class J59 {
    //hàm tính diện tích hình tròn
    public static double S_HinhTron(double bankinh){
        if(bankinh < 0){
            System.err.println("Bán kính không thể âm!");
            return -1; //trả về âm 1 để chỉ ra lỗi
        }
        return Math.PI * bankinh*bankinh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bankinh;

        System.out.print("Nhập bán kính hình tròn : ");
        bankinh = sc.nextDouble();

        double S = S_HinhTron(bankinh);

        //gọi hàm tính diện tích hình tròn
        if(S != -1) {
            System.out.println("Diện tích hình tròn là : " + S);
        }
        sc.close();
    }
}
