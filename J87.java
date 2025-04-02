package NOOB_MASTER;

import java.util.Scanner;

//Tạo hàm đếm số phần tử dương trong danh sách
public class J87 {
    public static int dem_so_duong(int[] arr, int n){
        int dem = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của danh sách : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int so_phan_tu_duong = dem_so_duong(arr, n);
        System.out.println("SỐ lượng phần tử dương trong danh sách là : " + so_phan_tu_duong + " : " + n);
    }
}
