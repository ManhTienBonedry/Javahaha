package NOOB_MASTER;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
//Tạo từ điển chuỗi
public class J52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập chuỗi từ bàn phím
        System.out.println("Nhập chuỗi : ");
        String chuoi = scanner.nextLine();

        //Tách chuỗi thành các từ đưa vào từ điển
        Map<String, Integer> tudien = new HashMap<>();
        String[] cactu = chuoi.split("\\s+"); //Tách chuỗi thành các từ
        //sử dụng khoảng trắng làm dấu phân cách

        //Đưa vào danh sách các từ điển
        for(String tu : cactu){
            if(!tu.isEmpty()){ //Kiểm tra từ không rỗng
                tudien.put(tu, tudien.getOrDefault(tu, 0) + 1);
                //Tăng giá trị nếu tư đã tồn tại ngược lại thêm với giá trị 1
            }
        }

        //in từ điển
        System.out.println("Từ điển được tạo từ chuỗi : ");
        for(Map.Entry<String, Integer> pair : tudien.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        scanner.close();
    }
}
