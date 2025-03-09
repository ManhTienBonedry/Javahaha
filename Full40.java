package NOOB_MASTER;
import java.util.Scanner;
//lọc danh sách theo điều kiện :Nhập một danh sách và một điều kiện, lọc các phần tử thỏa mãn điều kiện

public class Full40 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //Nhập số lượng phần tử trong danh sách
        System.out.print("Nhập số lượng phần tử trong danh sách : ");
        int n = scanner.nextInt();

        //Tạo mảng tĩnh để lưu danh sách các phần tử
        int[] danhsach = new int[100]; //Giả sử tối đa 100 phần tử
        int[] dsloc = new int[100]; //Mảng để lưu các phần tử lọc
        int count_loc = 0; //Biến đếm số phần tử thỏa mãn điều kiện

        //Nhập các phần tử vào danh sách
        System.out.print("Nhập các phần tử : ");
        for(int i = 0; i < n; i++){
            danhsach[i] = scanner.nextInt(); //Nhập phần tử
        }

        //lọc các điều kiện thỏa mãn điều kiện số chẵn
        for(int i = 0; i < n; i++){ //vòng lặp để duyệt tùng phần tử
            if(danhsach[i] % 2 == 0){
                dsloc[count_loc++] = danhsach[i]; // lưu phần tử vào danh sách lọc
            }
        }

        //in danh sách đã lọc
        System.out.print("Danh sách các số chẵn là : ");
        for(int i = 0; i< count_loc; i++){
            System.out.println(dsloc[i] + " ");// in phần tử
        }
        System.out.println();
    }
}
