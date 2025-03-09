package NOOB_MASTER;
//TẠo hàm kiểm tra số nguyên tố trong danh sách
import java.util.ArrayList;
public class J76 {
    //hàm kiểm tra số nguyên tố
    public static boolean La_SoNguyenTo(int n ) {
        if(n <= 1) return false; //1 không là số nguyên tố
        for(int i = 2; i <= Math.sqrt(n); i++){// duyệt từ 2 đến căn bậc 2 của n
            if(n % i == 0)
                return false; //nếu tồn tại số chia hết cho n thì không phải số nguyên tố
        }
        return true; // là số nguyên tố
    }

    public static ArrayList<Integer> Loc_SoNguyenTo(int[] danhsach){
        ArrayList<Integer> Danh_SachNguyenTo = new ArrayList<>(); //tạo ArrayList để lưu số nguyên tố
        for(int giatri : danhsach){
            if(La_SoNguyenTo(giatri)){
                Danh_SachNguyenTo.add(giatri);
            }
        }
        return Danh_SachNguyenTo; //trả về danh sách nguyên tố
    }

    public static void main(String[] args) {
        int[] danh_sach = {0,1,2,3,4,5,6,7,8,9,10};
        //Gọi hàm lọc số nguyên tố
        ArrayList<Integer> DanhsachNguyenTo = Loc_SoNguyenTo(danh_sach);

        //in kết quả
        System.out.print("Danh sách các số nguyên tố là : ");
        for(int giatri : DanhsachNguyenTo){
            System.out.print(giatri + " ");
        }
        System.out.println();
    }
}
