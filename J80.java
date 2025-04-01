package NOOB_MASTER;
//kiểm tra số Amstrong
import java.util.Scanner;

public class J80 {
    public static boolean kiem_tra_so_amstrong(int n) {
        int so_goc = n, tong = 0, so_chu_so = 0;

        int temp = n;
        while (temp > 0) {
            temp /= 10;
            so_chu_so++;
        }

        //Tính tổng các chữ số lũy thừa
        temp = n;
        while (temp > 0) {
            int chu_so = temp % 10;
            tong += Math.pow(chu_so, so_chu_so);
            temp /= 10;
        }
        return tong == so_goc;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra : ");
        int n = in.nextInt();

        if(kiem_tra_so_amstrong(n)){
            System.out.println(n + " là số Amstrong.");
        }else{
            System.out.println(n + " Không phải là số Amstrong.");
        }
        in.close();
    }
}
