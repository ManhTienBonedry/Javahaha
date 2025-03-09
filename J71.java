package NOOB_MASTER;
//Tạo hàm thêm phần tử vào từ điển
import java.util.Scanner;
import java.util.HashMap;
public class J71 {
    public static void Them_vao_tu_dien(HashMap<String, String> tuDien, String khoa, String gia_tri){
        // map<string, string> tu_dien = map<string, string> tu_dien
        tuDien.put(khoa, gia_tri); //thêm vào phần tử HashMap với khóa và giá trị tương ứng
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       HashMap<String, String> tudien = new HashMap<>();

       String khoa, giatri;

       //Nhập khóa và giá trị từ người dùng
        System.out.print("Nhập khóa : ");
        khoa = sc.nextLine();
        System.out.print("Nhập giá trị : ");
        giatri = sc.nextLine();

        //Thêm giá trị vào từ điển
        Them_vao_tu_dien(tudien, khoa, giatri);
        //in từ điển khi thêm vào phần tử
        System.out.println("Từ điển sau khi thêm : ");
        for(HashMap.Entry<String, String> entry : tudien.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
