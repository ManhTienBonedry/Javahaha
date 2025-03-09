package NOOB_MASTER;
import java.util.Scanner;
//Tạo chuỗi từ danh sách"NHập danh sách các từ và tạo ra chuỗi
public class Full25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập danh sách các từ từ bàn phím
        System.out.println("Nhập danh sách các từ (cách nhau ) : ");
        String input = scanner.nextLine();
        //sử dụng slit() để tách từ
        String[] words = input.split("\\s+");
        //ghép từ lại thành chuỗi
        StringBuilder chuoi = new StringBuilder();
        boolean first = true; // Để xử lý việc thêm dấu cách
        for (int i = 0; i < words.length; i++) { //trả về độ dài của chuỗi
            if (i > 0) {
                chuoi.append(" "); // Thêm dấu cách giữa các từ
            }
            chuoi.append(words[i]); // Thêm từ vào chuỗi kết quả
        }
        // In chuỗi đã tạo
        System.out.println("Chuỗi được tạo là: " + chuoi);
        scanner.close();
    }
}
