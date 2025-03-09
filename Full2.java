package NOOB_MASTER;
import java.util.Scanner;
//Tính thương hai số : nhập hai số và in ra thương của chúng
public class Full2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào a : ");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào b : ");
        float b = scanner.nextFloat();

        //kiểm tra nếu b khác 0
        if (b != 0){
            //Tính thương của hai số
            float T = a / b;
            //In kết quả
            System.out.println("Thương của hai số "+T);
        }else{
            System.out.println("Không thể chia cho 0.");
        }
    }
}
