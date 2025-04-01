package NOOB_MASTER;

import java.util.Scanner;

//tạo hàm tìm bội chung nhỏ nhất của hai chữ số
public class J81 {
    //hàm tính ucln
    public static int ucln(int a, int b){
        while(b != 0){
             int temp = b;
             b = a % b;
             a = temp;
         }
         return a;
    }

    //tính bội chung nn
    public static int bcnn(int a, int b){
        return Math.abs(a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(bcnn(a, b));
    }
}
