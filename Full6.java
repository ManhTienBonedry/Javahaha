package NOOB_MASTER;
import java.util.Scanner;
//Tính diện tích hình tam giác
public class Full6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của hình tam giác : ");
        float h = scanner.nextFloat();
        System.out.print("Nhập độ dài đáy của hình tam giác : ");
        float d = scanner.nextFloat();

        //Kiểm tra điều kiện chiều cao và đáy > 0
        if (h > 0 && d > 0) {
            //Tính diện tích hình tam giác
            double S = 0.5 * d * h;
            //in ra kết quả
            System.out.println("Diện tích của hình tam giác là : "+S);
        }else{
            System.out.println("Chiều cao và đáy phải lớn hơn 0.");
        }
    }
}
