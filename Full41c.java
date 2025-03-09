package NOOB_MASTER;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
//Mảng tĩnh
public class Full41c {
    public static void MangTinh() {
        Scanner scanner = new Scanner(System.in);
        //Mảng tĩnh
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //tạo mảng tĩnh để lưu các phần tử
        int[] danhsach = new int[100]; //Giả sử tối đa 100 phần tử
        int[] danhsachchan = new int[100]; //Mảng tối đa để lưu các phần tử chẵn
        int count_chan = 0; //Biến đếm số phần tử chẵn

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập các phần tử : ");
        for (int i = 0; i < n; i++) {
            danhsach[i] = scanner.nextInt();
        }
        //lọc các phần tử chẵn và thêm vào mảng danh sách chẵn
        for (int i = 0; i < n; i++) { //Lọc các phần tử chẵn và thêm vào mảng danh sách chẵn
            if (danhsach[i] % 2 == 0) { //Kiểm tra số chẵn và thêm vào mảng danh sách chẵn
                danhsachchan[count_chan++] = danhsach[i]; // kiểm tra số chẵn thêm vào mảng danh sách chẵn
            }
        }

        //in danh sách số chẵn
        System.out.print("Danh sách số chẵn là : ");
        for (int i = 0; i < count_chan; i++) {
            System.out.print(danhsachchan[i] + " ");
        }

        scanner.close();
    }
}