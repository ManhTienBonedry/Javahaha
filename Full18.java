package NOOB_MASTER;
import java.util.Scanner;
//Tính số lượng ký tự 'a' trong chuỗi : Nhập một chuỗi và đếm ký tự 'a'
public class Full18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập chuỗi từ bàn phím
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //đếm số lượng ký tự 'a' trong chuỗi
        int soluonga = 0; //biến đếm ký tự a
        for(char kytu : chuoi.toCharArray()){ // duyệt từng ký tự a trong chuỗi
            if(kytu == 'a') {//nếu ký tự là a
                soluonga++;
            }
        }
        System.out.println("Số lượng ký tự a trong chuỗi là : "+soluonga);
    }
}
