package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Thêm phần tử vào từ điển : Nhập một phần từ điển và thêm một phần tử mới vào từ điển

public class Full36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Dùng Hashmap để lưu trữ từ điển
        Map<String, String> tudien = new HashMap<>();

        //Nhập số lượng phần tử trong từ điển ban đầu
        System.out.print("Nhập số lượng phần tử trong từ điển : ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau nextInt()

        //Nhập từng khóa và giá trị mới
        System.out.print("Nhập khóa mới : ");
        String khoamoi = scanner.nextLine();
        System.out.print("Nhập giá trị mới : ");
        String giatrimoi = scanner.nextLine();

        //thêm phần tử mới vào từ điển
        tudien.put(khoamoi, giatrimoi); //Thêm vào từ điển

        //in từ điển khi thêm phần tử mới
        System.out.println("Từ điển sau khi thêm phần tử mới là : ");
        for(Map.Entry<String, String> entry : tudien.entrySet()){ //duyệt qua từng phần tử trong map
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
