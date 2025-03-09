package NOOB_MASTER;
import java.util.Scanner;

public class Full42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        while (true) {

            System.out.println("Chọn kiểu mảng:");
            System.out.println("Chon 1 : Mảng Động.");
            System.out.println("Chọn 2 : Mảng Tĩnh.");
            System.out.println("Chọn 3 : Thoát.");
            System.out.print("Mời bạn chọn số: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhập mảng động");
                    Full42MangDong a = new Full42MangDong();
                    a.MangDong();
                    break;
                case 2:
                    System.out.println("Nhập mảng tĩnh");
                    Full42MangTinh b = new Full42MangTinh();
                    b.MangTinh();
                    break;
                case 3:
                    System.out.println("Thanks bro");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng thử lại.");
            }
        }
    }
}
