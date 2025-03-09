package NOOB_MASTER;
import java.util.Scanner;
//chuyển đổi chuỗi thành chữ hoa
public class Full22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhập chuỗi từ bàn phím
        System.out.println("Nhập một chuỗi : ");
        String chuoi = scanner.nextLine();
        StringBuilder chuoiinhoa = new StringBuilder(chuoi);
        //chuyển đổi chuỗi thành chữ hoa
        for(int i = 0; i< chuoi.length(); i++){
            //duyệt qua từng ký tự trong chuỗi, length trả về độ dài của chuỗi
            char kytu = chuoi.charAt(i);
            //kiểm tra và chuyển ký tự thường thành chữ hoa
            if(kytu >= 'a' && kytu <= 'z'){ // nếu là chữ cái thường
                 chuoiinhoa.setCharAt(i, (char) (kytu - ('a' - 'A')));
                 //chuyển dổi thành chữ in hoa
            }
        }
        //in chuỗi đã chuyển dổi
        System.out.println("Chuỗi in hoa " + chuoiinhoa);
        scanner.close();
    }
}

//        StringBuilder chuoiInHoa = new StringBuilder(chuoi);
//        for (int i = 0; i < chuoi.length(); i++) { // Duyệt qua từng ký tự trong chuỗi
//            char kyTu = chuoi.charAt(i);
//            if (kyTu >= 'a' && kyTu <= 'z') { // Nếu ký tự là chữ cái thường
//                chuoiInHoa.setCharAt(i, (char) (kyTu - ('a' - 'A'))); // Chuyển thành chữ hoa
//