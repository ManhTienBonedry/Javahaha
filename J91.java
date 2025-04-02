package NOOB_MASTER;

import java.util.Scanner;

//Tạo hàm tìm số lần xuất hiện của một phần tử trong danh sách
public class J91 {
    public static int dem_so_lan_xuat_hien(int[] arr, int n, int x){
        int dem = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của danh sách : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của danh sách : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Nhập phần tử cần tìm : ");
        int x = in.nextInt();

        //tìm và in số lần xuất hiện của phần tử x
        int so_lan_xuat_hien = dem_so_lan_xuat_hien(arr, n , x);
        System.out.println("Phần tử " + x + " xuất hiện "+ so_lan_xuat_hien + " lần.");
    }
}
