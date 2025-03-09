package NOOB_MASTER;
import java.util.Scanner;
//Đếm số lần xuất hiện của số trong danh sách : Nhập một danh sách và một số, đếm số lần...

public class Full32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //NHập số lg phần tử trong danh sách
        System.out.println("NHập số lượng phần tử : ");
        int n = scanner.nextInt();

        //In mảng
        int[] ds = new int[n]; // mảng có n phần tử

        //Nhập các phần tử
        System.out.println("Nhập các số : ");
        for(int i = 0; i < n; i++){
            ds[i] = scanner.nextInt();
        }

        //NHập số cần tìm
        System.out.println("NHập số cần đếm : ");
        int so_can_tim = scanner.nextInt();

        //đếm số lần xuất hiện của số cầ tìm
        int dem = 0; //biến đếm số lần xuất hiện
        for(int i = 0; i < n; i++){
            if(ds[i] == so_can_tim){ //nếu phần tử hiện tại bằng số cần tìm
                dem++;
            }
        }
        System.out.println("Số " + so_can_tim +" xuất hiện " + dem + " lần trong danh sách.");
    }
}
