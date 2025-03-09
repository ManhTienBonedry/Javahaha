package NOOB_MASTER;
import java.util.Scanner;
//Tính số Fibonacci thứ n : nhập n và in ra số Fibonacci
public class Full14 {
    public static int Fibonacci(int n) { //(1)
        if(n <= 0){
            return -1; // giá trị không hợp lệ
        }else if(n == 1 || n == 2){
            return 1;
        }else{
            int a = 1, b =1, fib = 1;
            for(int i = 3; i <= n; i++){
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Nhập n từ bàn phím
        System.out.print("Nhập số n : ");
        int n = scanner.nextInt();

        //Tính và in ra số Fibonacci thứ n
        int result = Fibonacci(n); // gán result = (1)
        if(result == -1){
            System.out.println("Số nhập vào phải lớn hơn 0.");
        }else{
            System.out.println("Số Fibonacci thứ "+n+" là : "+result);
        }
    }
}
