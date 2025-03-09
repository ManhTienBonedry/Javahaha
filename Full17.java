package NOOB_MASTER;
import java.util.Scanner;
//đảo ngược chuỗi : nhập một chuỗi và in ra chuỗi đảo ngược
public class Full17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập chuỗi từ bàn phím
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //đảo ngược chuỗi
        String chuoidaonguoc = new StringBuilder(chuoi).reverse().toString();// Hàm reverse để đảo ngược chuỗi
        //in chuỗi đảo ngược
        System.out.println("Chuỗi đảo ngược là : "+chuoidaonguoc);
    }
}
