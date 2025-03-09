package NOOB_MASTER;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Xóa phần từ khỏi từ điển
public class Full37 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //tạo HashMap để lưu trữ từ điển
        Map<String, String> tudien = new HashMap<>(); //khóa giá trị String

        //Nhập số lượng phần tử trong từ điển ban đầu
        System.out.println("Nhập số lượng phần tử trong từ điển : ");
        int n = scanner.nextInt();
        scanner.nextLine(); //đọc bỏ dòng trống sau khi nextInt()

        //Nhập từng khóa và giá trị
        for(int i = 0; i < n; i++){
            System.out.println("Nhập khóa : ");
            String khoa = scanner.nextLine();
            System.out.println("Nhập giá trị : ");
            String giatri =scanner.nextLine();
            tudien.put(khoa, giatri);
        }

        //Nhập khóa của các phần tử cần xóa
        System.out.println("Nhập khóa cần xóa : ");
        String khoacanxoa = scanner.nextLine();

        //xóa phần tử theo khóa
        if(tudien.containsKey(khoacanxoa)){
            tudien.remove(khoacanxoa);
            System.out.println("Đã xóa phần tử có khóa " + khoacanxoa);
        }else{
            System.out.println("Không tìm thấy khóa " + khoacanxoa);
        }

        //in từ điển ra màn hình
        System.out.println("Từ điển sau ki xóa là : ");
        for(Map.Entry<String, String> entry : tudien.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
