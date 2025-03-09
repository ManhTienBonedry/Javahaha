package NOOB_MASTER;
import java.util.Scanner;
//Tìm số nhỏ nhất trong danh sách
public class Full30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng để in danh sách các số
        int[] danhsach = new int[n];

        //NHập các phần tử từ người dùng
        System.out.print("Nhập các số : ");
        for(int i = 0; i< n; i++){
            danhsach[i] = scanner.nextInt(); //Nhập từng phần tử
        }

        //Tìm số nhỏ nhất
        int min_num = danhsach[0];
        for(int i = 0; i < n; i++){
            if(danhsach[i] < min_num){
                min_num = danhsach[i];
            }
        }
        //in ra số nhỏ nhất
        System.out.println("Số nhỏ nhất trong danh sách là : " + min_num);
        scanner.close();
    }
}
