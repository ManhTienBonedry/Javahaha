package NOOB_MASTER;
//Tạo hàm sắp xếp danh sách theo thứ tự giảm dần với danh sách thứ tự được nhập từ bàn phím

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J83 {
    public static void sap_xep_giam_dan(Integer[] arr, int n){
        Arrays.sort(arr, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ  " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }

        sap_xep_giam_dan(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(" " +arr[i]);
        }
        in.close();
    }
}
