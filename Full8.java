import java.util.Scanner;
//Tìm số nhỏ nhất trong ba số
public class Full8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //cách thứ 1

//        System.out.print("Nhập số thứ 1 : ");
//        float a = scanner.nextFloat();
//        System.out.print("Nhập số thứ 2 : ");
//        float b = scanner.nextFloat();
//        System.out.print("Nhập số thứ 3 : ");
//        float c = scanner.nextFloat();
//
//        //Tìm số nhỏ nhất
//        float so_nho_nhat;
//        if(a <= b && a <= c){
//            so_nho_nhat = a;
//        }else if(b <= a && b <= c){
//            so_nho_nhat = b;
//        }else{
//            so_nho_nhat = c;
//        }
//        //in kết quả
//        System.out.println("Số nhỏ nhất là : " +so_nho_nhat);

        //cách thứ 2
        //Khai báo một mảng
        float[] list = new float[3];

        //nhập ba số từ bàn phím
        for(int i = 0; i < 3; i++){
            System.out.print("Nhập số thứ "+(i + 1)+" : ");
            list[i] = scanner.nextFloat();
        }

        //tìm số nhỏ nhất
        float so_nho_nhat = list[0];
        for(int i = 1; i < 3; i++){
            if (list[i] < so_nho_nhat){
                so_nho_nhat = list[i];
            }
        }
        //in kết quả
        System.out.println("Số nhỏ nhất là : "+so_nho_nhat);
    }
}
