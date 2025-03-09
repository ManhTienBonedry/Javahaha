package NOOB_MASTER;
import java.util.Scanner;
//tạo hàm kiểm tra phần tử có trong danh sách
public class J77 {
    public static boolean kiem_tra_phan_tu(int danhsach[], int n, int phantu) {
        for (int i = 0; i < n; i++) {
            if (danhsach[i] == phantu) { // nếu phần tử cần kiểm tra tồn tại trong danh sách
                return true; //phần tử tồn tại trong danh sách
            }
        }
        return false; // phần tử không tồn tại trong danh sách
    }

    public static void main(String[] args) {
        int[] danhsach = {1,2,3,4,5,6,7,8,9,10};
        int n = danhsach.length; //số phần tử của mảng

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập phần tử cần kiểm tra : ");
        int phantu = in.nextInt();
//        int phantu = 5; //phần tử cần kiểm tra

        //gọi hàm kiểm tra phần tử
        if(kiem_tra_phan_tu(danhsach, n, phantu)){
            System.out.println(phantu + " có trong danh sách.");
        }else{
            System.out.println(phantu + " không có trong danh sách.");
        }
    }
}
