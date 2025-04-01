package NOOB_MASTER;

import java.util.Scanner;

//tạo hàm kiểm tra danh sách có chứa số âm không
public class J85 {
    public static boolean kiem_tra_so_am(int[] arr, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lương phần tử của danh sách : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của danh sách : ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        if(kiem_tra_so_am(arr, n)){
            System.out.println("Có chứa số âm.");
        }else{
            System.out.println("Không chứa số âm.");
        }
        in.close();
    }
}
