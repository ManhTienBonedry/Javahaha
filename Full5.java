package NOOB_MASTER;
import java.util.Scanner;
//Tính chu vi,diện tích hình tròn :Nhập bán kính và in ra màn hình
public class Full5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khai báo biến
        System.out.print("Nhập bán kính của hình tròn : ");
        float r = scanner.nextFloat();

        //kiểm tra điều kiện bán kính > 0
        if(r > 0){
            //Tính chu vi hình tròn
            double C = 2 * Math.PI * r;
            //Tính diện tích hình tròn
            double S = Math.PI * r * r;
            //In ra kết quả
            System.out.println("Chu vi của hình tròn là : "+C);
            System.out.println("Diện tích của hình tròn là : "+S);
        }else{
            System.out.println("Bán kính phải lớn hơn 0.");
        }
    }
}
