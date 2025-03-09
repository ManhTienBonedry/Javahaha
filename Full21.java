package NOOB_MASTER;
import java.util.Scanner;
//Tìm chữ cái đầu tiên và cuối cùng của chuỗi: Nhập một chuỗi và tìm chữ cái đầu tiên và cuối cùng

public class Full21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập một chuỗi từ bàn phím
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //Tìm chữ cái đầu tiên và cuối cùng
        if(!chuoi.isEmpty()){
            //Kiểm tra chuỗi có rỗng không
            //emty trả về true nếu chuỗi rỗng
            char chucaidau = chuoi.charAt(0);
            //chuoi.charAt[0] trả về kí tự đầu tiên của chuỗi
            char chucaicuoi = chuoi.charAt(chuoi.length() - 1);
            //lengh trả về độ dài của chuỗi
            System.out.println("chữ cái đầu tiên là : "+chucaidau);
            System.out.println("chữ cái cuối cùng là : "+chucaicuoi);
        }else{
            System.out.println("Chuỗi rỗng, không có kí tự để hiển thị.");
        }
    }
}
