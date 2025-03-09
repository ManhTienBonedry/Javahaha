//import java.util.ArrayList;
//import java.util.Scanner;
//import java.lang.Math;
////Tạo danh sách các  số nguyên tố từ danh sách : Nhập một danh sách các số và tạo ra danh sách các số nguyên tố
//
//public class Full43 {
//    //Hàm kiểm tra số nguyên tố
//    public class SoNguyenTo {
//        public static boolean LaSoNguyenTo(int so) { //Trả về true nếu là số nguyên tố, và ngược lại
//            if (so < 2) //số nguyên tố phải lớn hơn 1
//                return false;
//            for (int i = 2; i <= Math.sqrt(so); i++) { //Duyêt từ 2 đến căn bậc 2 của số
//                if (so % i == 0)
//                    return false; //nếu số chia hết cho một số nào đó thì không phải là số nguyên tố
//            }
//            return true; //Nếu không chia hết cho số nào thì là số nguyên tố
//        }
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            //Nhập phần tử
//            System.out.print("Nhập số luọng phần tưt trong danh sách : ");
//            int n = scanner.nextInt();
//
//            ArrayList<Integer> danhsach = new ArrayList<>(n); //khai báo mảng động chứa các phần tử
//            ArrayList<Integer> ds_nguyento = new ArrayList<>(n); //Khai báo mảng động chứa các số nguyên tố
//            int count_Nguyento = 0;
//
//            //Nhập các phần tử
//            System.out.print("Nhập các phần tử : ");
//            for (int i = 0; i < n; i++) {
//                danhsach.add(scanner.nextInt()); //Nhập phần tử thứ i
//                //nếu mảng tĩnh : danhsach[i] = scanner.nextInt()
//            }
//
//            //Lọc số nguyên tố
//            for (int i = 0; i < n; i++) { //Duyệt qua từng phần tử để kiểm tra
//                if (LaSoNguyenTo(danhsach.get(i))) { //nếu là số nguyên tố thì thêm vào danh sách số nguyên tố
//                    ds_nguyento.add(danhsach.get(i)); //thêm số nguyên tố
//                }
//            }
//
//            //in danh sách số nguyên tố
//            System.out.print("Danh sách các số nguyên tố : ");
//            for (int SoNguyenTo : ds_nguyento) {
//                System.out.println(SoNguyenTo + " ");
//            }
//            System.out.println();
//            scanner.close();
//        }
//    }
//}
package NOOB_MASTER;
import java.util.Scanner;
import java.lang.Math;

public class Full43 {
    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int so) {
        if (so < 2) return false; // Số nguyên tố phải lớn hơn 1
        for (int i = 2; i <= Math.sqrt(so); i++) { // Duyệt từ 2 đến căn bậc 2 của số
            if (so % i == 0) return false; // Nếu số chia hết cho một số nào đó thì không phải số nguyên tố
        }
        return true; // Nếu không chia hết cho số nào thì là số nguyên tố
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = scanner.nextInt();

        int[] danhSach = new int[n]; // Khai báo mảng chứa các phần tử
        int[] danhSachNguyenTo = new int[n]; // Khai báo mảng chứa các số nguyên tố
        int countNguyenTo = 0; // Biến đếm số lượng số nguyên tố

        // Nhập các phần tử
        System.out.println("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) { // Duyệt qua từng phần tử để nhập
            danhSach[i] = scanner.nextInt(); // Nhập phần tử thứ i
        }

        // Lọc số nguyên tố
        for (int i = 0; i < n; i++) { // Duyệt qua từng phần tử để kiểm tra
            if (laSoNguyenTo(danhSach[i])) { // Nếu là số nguyên tố thì thêm vào danh sách số nguyên tố
                danhSachNguyenTo[countNguyenTo++] = danhSach[i]; // Thêm số nguyên tố vào danh sách
            }
        }

        // In danh sách số nguyên tố
        System.out.print("Danh sách các số nguyên tố: ");
        for (int i = 0; i < countNguyenTo; i++) { // Duyệt qua danh sách số nguyên tố để in
            System.out.print(danhSachNguyenTo[i] + " "); // In số nguyên tố thứ i
        }
        System.out.println();

        scanner.close();
    }
}
