package NOOB_MASTER;
import java.util.Scanner;
//Kiểm tra số nguyên tố : nhập một số và kiểm tra xem số đó có phải số nguyên tố hay không
public class Full15 {
    //Hàm kiểm tra số nguyên tố
    public static boolean kiemtranguyento(int n){
        if (n <= 1){
            return false;
        }for(int i = 2; i <= Math.sqrt(n); i++){ // để có thể dùng các công thức cần thêm Math. đằng trước
            if(n % i == 0){
                return false;
            }
        }return true;
    }

    //hàm ktra và đưa ra kết quả
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số : ");
        int n = scanner.nextInt();

        //Kiểm tra và in kết quả
        if(kiemtranguyento(n)){
            System.out.println(n+" là số nguyên tố.");
        }else{
            System.out.println(n+" Không là số nguyên tố.");
        }
    }
}
