package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Tính tổng các giá trị trong từ điển : Nhập một từ điển với các giá trị số và tính tổng của chúng

public class Full38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tạo một HashMap đểu lưu từ điển với các giá trị là số
        Map<String, Integer> tudien = new HashMap<>(); //khóa là String, giá trị là số

        //Nhập số lượng phần tử trong từ điển ban đầu
        System.out.print("Nhập số lượng phần tử trong từ điển : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Nhập từng khóa và giá trị
        for(int i = 0; i < n; i++) { //duyệt qua từng phần tử trong map
            System.out.print("Nhập Khóa : "); //khóa của từng phần tử
            String khoa = scanner.nextLine();
            System.out.print("Nhập giá trị số : "); //Giá trị của từng phần tử
            int giatri =scanner.nextInt();
            scanner.nextLine();
            tudien.put(khoa, giatri); //thêm phần tử vào map
        }

        //Tính tổng các giá trị trong từ điển
        int tong = 0;
        for(Map.Entry<String, Integer> entry : tudien.entrySet()){
            tong += entry.getValue(); //cộng giá trị vào tổng
        }

        //in tổng các giá trị
        System.out.println("Tổng các giá trị trong từ điển là : " + tong);
    }
}
