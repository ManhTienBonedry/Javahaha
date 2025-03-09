package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Tạo từ điển danh sách :Nhập một danh sách các từ và tạo từ điển từ danh sách đó

public class Full34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập chuỗi
        System.out.print("Nhập các từ cách nhau bởi dấu cách : ");
        String chuoi = scanner.nextLine();

        //Tạo một HashMap để lưu trữ từ điển<từ, số lần xuất hiện >
        Map<String , Integer> tudien = new HashMap<>();

        //Tách các từ trong chuỗi
        String[] tuArray = chuoi.split("\\s+"); //Tách theo khong trắng

        //duyệt qua từng từ và đếm số lần xuất hiện
        for(String tu : tuArray){
            tudien.put(tu, tudien.getOrDefault(tu, 0) + 1);
        }

        //in từ điển
        System.out.println("Từ điển từ danh sách là : ");
        for(Map.Entry<String, Integer> entry : tudien.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        scanner.close();
    }
}
