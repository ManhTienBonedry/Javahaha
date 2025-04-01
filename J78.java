package NOOB_MASTER;

import java.util.Scanner;

public class J78 {
    // Hàm tính tổng ma trận 2x2
    public static int tinhTongMaTran(int[][] maTran) {
        int tong = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tong += maTran[i][j];
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Khởi tạo ma trận 2x2
        int[][] maTran = new int[2][2];

        // Nhập giá trị cho ma trận
        System.out.println("Nhập các giá trị cho ma trận 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                maTran[i][j] = in.nextInt();
            }
        }

        // Tính và in tổng
        int tong = tinhTongMaTran(maTran);
        System.out.println("Tổng các phần tử của ma trận là: " + tong);

        // Đóng Scanner
        in.close();
    }
}
