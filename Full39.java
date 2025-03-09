package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
// Kiểm tra phần tử có trong danh sách : NHập một danh sách và một phần tử, kiểm tra xem phần tử đó có trong damh sách không

public class Full39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng tĩnh để lưu danh sách các phần tử
        int[] danhsach = new int[100];//Giả sử kích thước tối đa của phần tử là 100

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập các phần tử : ");
        for(int i = 0; i < n; i++){
            danhsach[i] = scanner.nextInt(); //Nhập phần tử thứ i
        }

        //nhập phần tử cần kiểm tra
        System.out.print("Nhập phần tử cần kiểm tra : ");
        int phantukt = scanner.nextInt();

        //Kiểm tra xem phần tử có trong danh sách không
        boolean found = false; //Biến kiểm tra phần tử có trong danh sách hay không
        for(int i = 0; i < n; i++){
            if(danhsach[i] == phantukt) {
                found = true;
                break;
            }
        }
        if(found) { //nếu phần tử tìm thấy
            System.out.println("Phần tử " + phantukt + " có trong danh sách.");
        }else{ //nếu phần tử không tìm thấy
            System.out.println("Phần tử " + phantukt + " không có trong danh sách.");
        }

    }
}
