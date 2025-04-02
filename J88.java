package NOOB_MASTER;

import java.util.Scanner;

//Tạo hàm kiểm tra hai danh sách có giống nhau hay không
public class J88 {
    public static boolean kiem_tra_danh_sach_giốngnhau(int[] arr1, int[] arr2, int n1, int n2){
        // arr1 và 2 là hai mảng cần so sánh. n là số phần tử của hai mảng
        if(n1 != n2){
            return false;
        }
        for (int i = 0; i < n1; i++) { //so sánh từng phần tử của hai danh sách
            if(arr1[i] != arr2[i]){
                return false; //nếu có phần tử không trùng khớp, trả về
            }
        }
        return true; //tất cả các phần tử đều giống nhau
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách thứ nhất : ");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Nhập các phần tử của danh sách thứ nhất : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        in.nextLine();
        System.out.print("Nhập số lượng phần tử của danh sách thứ hai : ");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Nhập các phần tử của danh sách thứ hai : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }
        if(kiem_tra_danh_sach_giốngnhau(arr1, arr2, n1, n2)){
            System.out.println("Hai danh sách giống nhau.");
        }else{
            System.out.println("Hai danh sách không giống nhau.");
        }
    }
}
