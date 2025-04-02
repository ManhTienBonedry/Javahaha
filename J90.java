package NOOB_MASTER;

import java.util.Scanner;

//tạo hàm kiểm tra danh sách có phải là danh sách tăng dần không
public class J90 {
    public static boolean kiem_tra_tang_dan(int[] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của danh sách: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if(kiem_tra_tang_dan(arr, n)){
            System.out.println("Danh sách là tăng dần.");
        }else{
            System.out.println("Danh sách không phải là tăng dần.");
        }
    }
}
