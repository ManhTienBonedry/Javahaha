package NOOB_MASTER;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
//in các ký tự riêng biệt của chuỗi :Nhập một chuỗi và in ra các ký tự riêng biệt
public class Full19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //Nhập chuỗi từ bàn phim
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();

        //Tạo một tập hợp để lưu các ký tự riêng biệt
        Set<Character> kyturiengbiet = new HashSet<>();
        // lớp set giúp lưu trữ các phần tử không trùng lặp

        //thêm các ký tự vào tập hợp
        for(Character kytu : chuoi.toCharArray()) {//duyệt qua tưng ký tự trong chuỗi
             kyturiengbiet.add(kytu);
        }

        //in các ký tự riêng biệt
        System.out.print("Các ký tự riêng biệt trong chuỗi là : ");
        for(Character kytu : kyturiengbiet){
            System.out.print(kytu +" ");
        }
        System.out.println();
        scanner.close();
    }
}
