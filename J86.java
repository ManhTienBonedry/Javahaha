package NOOB_MASTER;
//Tạo hàm tìm phần tử lớn thứ hai trong danh sách

import java.util.Scanner;

public class J86 {
    public static int tim_phan_tu_lon_thu_hai(int[] arr, int n) {
        if (n <= 2) {
            //nếu mảng có ít hơn hai phần tử, không có phần tử thứ hai
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }
        //Kiểm tra nếu không tìm thấy phần tử lớn thứ hai
        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }
        return max2;
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
        int lon_thu_hai = tim_phan_tu_lon_thu_hai(arr, n);
        if(lon_thu_hai != -1){
            System.out.println("Phần tử lớn thứ hai trong danh sách là : " + lon_thu_hai);
        }
        else{
            System.out.println("Không tìm được phần tử lớn thứ hai.");
        }
    }
}
