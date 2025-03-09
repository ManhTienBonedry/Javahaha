package NOOB_MASTER;
import java.util.Scanner;
//Tìm số lớn nhất trong ba số
public class Full7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ 1 : ");
        float a = scanner.nextFloat();
        System.out.print("Nhập số thứ 2 : ");
        float b = scanner.nextFloat();
        System.out.print("Nhập số thứ 3 : ");
        float c = scanner.nextFloat();

        //tìm số lớn nhất
        float so_lon_nhat;
        if(a >= b && a >= c){
            so_lon_nhat = a;
        }else if(b >= a && b >= c){
            so_lon_nhat = b;
        }else{
            so_lon_nhat = c;
        }
        //In kết quả
        System.out.println("Số lớn nhất là : "+so_lon_nhat);
    }
}
