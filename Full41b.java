package NOOB_MASTER;
import java.util.ArrayList;
import java.util.Scanner;
//tạo danh sach các số chẵn từ danh sách :Nhập một danh sách các số và tạo danh sách các số chẵn

public class Full41b {
    //public static void main(String[] args) {
    public static void MangDong() {
        Scanner scanner = new Scanner(System.in);
        //Viết theo mmảng động
        //Nhập Số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng dộng để lưu danh sách các phần tử
        ArrayList<Integer> danhsach = new ArrayList<>(n); //Mảng để lưu các số nguyên
        ArrayList<Integer> danhsachchan = new ArrayList<>(n); //Mảng để lưu các số chẵn
        int count_chan = 0; //Biến đếm số phần tử chẵn

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập các phần tử : ");
        for (int i = 0; i < n; i++) {//Nhập các phần tử vào danh sách
            int phantu = scanner.nextInt();
            danhsach.add(phantu);

            //Lọc các phần tử và thêm vào danh sách chẵn
            if (phantu % 2 == 0) {
                danhsachchan.add(phantu);
            }
        }
        //Lọc các phần tử và thêm vào danh sách chẵn
//        for(int phantu : danhsach){
//            if(phantu %2 == 0){
//                danhsachchan.add(phantu);
//            }
//        }

        //in danh sách các số chẵn
        System.out.print("Danh sách các số chẵn là : ");
        for (int phantu : danhsachchan) {
            System.out.print(phantu + " ");
        }

        scanner.close();
    }
}

    //Mảng tĩnh
//    public static void MangTinh() {
//        Scanner scanner = new Scanner(System.in);
//        //Mảng tĩnh
//        System.out.print("Nhập số lượng phần tử trong danh sách : ");
//        int n = scanner.nextInt();
//
//        //tạo mảng tĩnh để lưu các phần tử
//        int[] danhsach = new int[100]; //Giả sử tối đa 100 phần tử
//        int[] danhsachchan = new int[100]; //Mảng tối đa để lưu các phần tử chẵn
//        int count_chan = 0; //Biến đếm số phần tử chẵn
//
//        //Nhập các phần tử vào danh sách
//        System.out.print("Nhập các phần tử : ");
//        for (int i = 0; i < n; i++) {
//            danhsach[i] = scanner.nextInt();
//        }
//        //lọc các phần tử chẵn và thêm vào mảng danh sách chẵn
//        for (int i = 0; i < n; i++) { //Lọc các phần tử chẵn và thêm vào mảng danh sách chẵn
//            if (danhsach[i] % 2 == 0) { //Kiểm tra số chẵn và thêm vào mảng danh sách chẵn
//                danhsachchan[count_chan++] = danhsach[i]; // kiểm tra số chẵn thêm vào mảng danh sách chẵn
//            }
//        }
//
//        //in danh sách số chẵn
//        System.out.print("Danh sách số chẵn là : ");
//        for (int i = 0; i < count_chan; i++) {
//            System.out.println(danhsachchan[i] + " ");
//        }
//
//        scanner.close();
//    }
//}
