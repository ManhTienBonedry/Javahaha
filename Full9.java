package NOOB_MASTER;
import java.util.Scanner;
//Chuyển đổi nhiệt độ từ Celsius sang độ Fahrenheit
public class Full9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập nhiệt độ từ bàn phím
        System.out.print("Nhập nhiệt độ (°C) : ");
        float C = scanner.nextFloat();

        //công thức chuyển từ Celsisus sang Fahrenheit
        double F = (C * 9.0 / 5.0) + 32;

        //in ra kết
        System.out.println("Nhiệt độ "+C+"°C = "+F+"°F");
    }
}
