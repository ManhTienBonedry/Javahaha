package NOOB_MASTER;
import java.util.Scanner;
//kiểm tra chuỗi đối xứng
public class Full20 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //Nhập chuỗi từ bàn phím
        System.out.print("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //kiểm tra chuỗi đối xứng
        boolean doixung = true; //giả sử chuỗi đối xứng
        int n = chuoi.length(); //độ dài của chuỗi
        for(int i = 0; i < n / 2; i++){
            //duyệt từ đầu chuỗi đến giữa
            if(chuoi.charAt(i) != chuoi.charAt(n - 1- i)){
                //so sánh ký tự đầu với ký tự cuối, ký tự thứ 1 với ký tự thứ n-1
                doixung = false; //nếu khác nhau thì không phải chuỗi đối xứng
                break;
            }
        }
        if(doixung){
            System.out.println("Chuỗi này là chuỗi đối xứng.");
        }else{
            System.out.println("Chuỗi này không phải chuỗi đối xứng.");
        }
    }
}
