package NOOB_MASTER;
import java.util.Scanner;
//Tính diện tích hình chữ nhật :Nhập chiều dài và chiều rộng
public class Full4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập chiều rộng b: ");
        float b = scanner.nextFloat();

        //kiểm tra điều kiện từ chiều dài và chiều rộng phải lớn hơn 0
        if (a > 0 && b > 0){
            //Tính chu vi hcn
            float C =(a + b) * 2;
            //Tính diện tích hcn
            float S = a * b;
            //In ra kết quả
            System.out.println("Chu vi hình chữ nhật là : "+C);
            System.out.println("Diện tích hình chữ nhật là : "+S);
        }else{
            System.out.println("Chiều dài và chiều rộng phải lớn hơn 0.");
        }
    }
}
