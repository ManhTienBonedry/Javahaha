package NOOB_MASTER;
import java.util.Scanner;

public class Full42MangTinh {
    public static void MangTinh() {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tưt trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng tĩnh
        int[] danhsach = new int[100]; //Giả sử tối đa là 100 phần tử
        int[] dsle = new int[100]; //Mảng để lưu các phần tử lẻ
        int count_le = 0; //Biến đếm số phần tử lẻ

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập phần tử : ");
        for (int i = 0; i < n; i++) {
            danhsach[i] = scanner.nextInt();
        }

        //lọc các phần tử lẻ và thêm vào mảng danh sách lẻ
        for (int i = 0; i < n; i++) {
            if(danhsach[i] %2 != 0){
                dsle[count_le++] = danhsach[i];
            }
        }

        //in danh sách các số lẻ
        System.out.print("Danh sách các số lẻ là : ");
        for (int i = 0; i < count_le; i++) {
            System.out.print(dsle[i] + " ");
        }
        scanner.close();
    }
}
