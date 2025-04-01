package NOOB_MASTER;

import java.util.Scanner;

//hàm tính tổng các số trong ma trận 3 x 3
public class J79 {
    public static int tinh_tong_ma_tran(int[][] ma_tran){
        int tong = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tong += ma_tran[i][j];
            }
        }
        return tong;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] ma_tran = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //int[][] ma_tran = new int[3][3];
//        System.out.println("Nhập các giá trị cho ma trận 3 x 3 : ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
//                ma_tran[i][j] = in.nextInt();
          //  }
        //}
        int tong = tinh_tong_ma_tran(ma_tran);
        System.out.println("Tổng ma trận 3 x 3 là : ");
        System.out.println(tong);
        in.close();
    }
}
