package NOOB_MASTER;

import java.util.Scanner;

//Tìm ước chung lớn nhất
public class J82 {
   public static int ucln(int a, int b){
       while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(">" + ucln(a,b) + "<");
    }
}
