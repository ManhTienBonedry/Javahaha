package NOOB_MASTER;
//hàm tính tổng các giá trị trong từ điển
import java.util.Scanner;
import java.util.HashMap;
public class J73 {
    public static int Tinh_tong_gia_tri(HashMap<String, Integer> tudien){
        int tong = 0;
        for(Integer giatri : tudien.values()){
            tong += giatri;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo một từ điển HashMap
        HashMap<String, Integer> tudien = new HashMap<>();
        tudien.put("apple", 3);  // Thêm phần tử "apple": 3
        tudien.put("banana", 2); // Thêm phần tử "banana": 2
        tudien.put("orange", 5); // Thêm phần tử "orange": 5

        // Tính tổng và in kết quả
        int tong = Tinh_tong_gia_tri(tudien); // Gọi hàm tính tổng giá trị
        System.out.println("Tổng các giá trị trong từ điển là: " + tong);
    }
}
