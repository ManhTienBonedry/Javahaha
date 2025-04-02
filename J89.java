package NOOB_MASTER;

import java.util.Scanner;

//tạo hàm đảo ngược danh sách
public class J89 {
    public static void dao_nguoc_danh_sach(int[] arr, int n){
        int left = 0, right = n - 1; //left là vị trí đầu và right là vị trí cuối
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
        dao_nguoc_danh_sach(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
