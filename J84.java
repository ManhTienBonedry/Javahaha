package NOOB_MASTER;

import java.util.Scanner;

//Tạo hàm kiểm tra chuỗi có chứa toàn chữ số hay không
public class J84 {
    public static boolean kiem_tra_toan_chu_so(String chuoi){
        for(int i = 0; i < chuoi.length(); i++){
            if(!Character.isDigit(chuoi.charAt(i))){ //Nếu có bất kỳ ký tự nào không phải là chữ số
                return false;// Trả về false luôn và kết thúc hàm
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String chuoi = in.nextLine();

        if(kiem_tra_toan_chu_so(chuoi)){
            System.out.println("Chuỗi toàn chữ số.");
        }else{
            System.out.println("Chuỗi không chứa toàn chữ số.");
        }
    }
}
