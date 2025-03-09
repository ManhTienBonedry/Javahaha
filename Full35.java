package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//in từ điển : nhập một từ điển và in ra các khóa của từ điển

public class Full35 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Dùng HashMap để lưu trữ từ điển <KHóa , giá trị>
        Map<String, String> tudien = new HashMap<>();

        //Nhập số lượng phần tử trong từ điển
        System.out.print("Nhập số lượng phần tử trong từ điển : ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau nextInt()

        //Nhập từng khóa và giá trị
        for(int i = 0; i < n; i++){
            System.out.print("NHập khóa : ");
            String khoa = scanner.nextLine();
            System.out.print("Nhập giá trị : ");
            String giaTri = scanner.nextLine();
            tudien.put(khoa, giaTri); //thêm vào từ điển
        }

        //in các khóa và các giá trị trong từ điển
        System.out.println("Các khóa và giá trị trong từ điển là : ");
        for(Map.Entry<String, String> entry : tudien.entrySet()){
            //với C++ ta dùng auto const &pair với & sẽ giảm phần tử lặp hạn chế tốn bộ nhớ
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        scanner.close();
    }
}
