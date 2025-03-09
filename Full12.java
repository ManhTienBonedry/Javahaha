package NOOB_MASTER;
import java.util.Scanner;
//in bảng cửu chương từ 1 đến 9
public class Full12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 9; i++){
            System.out.println("Bảng cửu chương "+i+" : ");
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+i * j);
            }
        }
    }
}
