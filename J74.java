package NOOB_MASTER;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Predicate;
//tạo hàm lọc danh sách theo điều kiện
public class J74 {
    // Hàm lọc danh sách theo điều kiện
    public static ArrayList<Integer> LocDanhSach(int[] Danhsach, Predicate<Integer> Dieukien){
        ArrayList<Integer> DanhsachLoc = new ArrayList<>();

        for(int GiaTri : Danhsach){ //duyệt qua từng phần tử trong mảng
            if(Dieukien.test(GiaTri)){ //kiểm tra xem phần tử có thỏa mãn điều kiện không
                DanhsachLoc.add(GiaTri); // thêm phần tử thỏa mãn vào ArrayList
            }
        }
        return DanhsachLoc; //trả về danh sáchc sau khi lọc
    }

    public static void main(String[] args) {
        //tạo damh sách mẫu
        int[] danhsach = {1,2,3,4,5,6,7,8,9,10};

        //định nghĩa điều kiện lọc(số chẵn)
        Predicate<Integer> LaSoChan = x -> x % 2 == 0;// sử dụng lambda expression để định nghĩa điều kiện

        //lọc danh sách theo điều kiện là số chẵn

        ArrayList<Integer> Danhsachloc = LocDanhSach(danhsach, LaSoChan);

        //in kết quả
        System.out.print("Danhsach các số chẵn là : ");
        for(int Giatri : Danhsachloc){
            System.out.print(Giatri + " ");
        }
        System.out.println();
    }
}
