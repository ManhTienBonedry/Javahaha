package NOOB_MASTER;
import java.util.Scanner;
//Kiểm tra chuỗi có kí tự đặc biệt không
public class J51 {
    public static boolean KiemTraKiTudacBiet(String chuoi){
        for(char c : chuoi.toCharArray()){  //duyệt từng phần tử trong chuỗi
            if(!Character.isLetterOrDigit(c)){ //kiểm tra kí tự có phải chữ hoặc số không
                return true; //chuỗi cớ kí tự đặc biệt
            }
        }
        return false; // Không có kí tự đặc biệt
    }

    public static void main(String[] args) {
        //Nhập chuỗi từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi = scanner.nextLine();

        //Kiểm tra và in kết quả
        if(KiemTraKiTudacBiet(chuoi)){
            System.out.println("Chuỗi có kí tự đặc biệt.");
        }else{
            System.out.println("Chuỗi không có kí tự đặc biệt.");
        }
        scanner.close();
    }
}
