package NOOB_MASTER;
import java.util.Scanner;
//tính giai thừa của một số : Nhập một số và tính giai thừa của nó
public class Full11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số : ");
        int n = scanner.nextInt();

        long giai_thua = 1;
        //Tính giai thừa
        if(n < 0){
            System.out.println("Không có giai thừa cho số âm.");
        }else if(n == 0 || n == 1){
            System.out.println("Giai thừa của "+n+" Là 1.");
        }else{
            for(int i = 1; i<= n; i++){
                giai_thua *= i;
            }
            System.out.println("Giai thừa của "+n+" là "+giai_thua);
        }
    }
}
