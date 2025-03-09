package NOOB_MASTER;
import java.util.*;
//xắp sếp từ điển theo giá trị

public class Full50 {
    public static void sortByValue(Map.Entry<String, Integer>[] entries){
        Arrays.sort(entries, Comparator.comparingInt(Map.Entry::getValue));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo một map để lưu trữ từ điển
        Map<String, Integer> tudien = new HashMap<>();
        //Nhập số lượng phần tử trong từ điển
        System.out.print("NHập số luọng phần tử trong từ diển : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập khóa thứ " + (i + 1) + " : ");
            String khoa = scanner.next();
            System.out.print("Nhập giá trị cho khóa " + khoa + " : ");
            int giaTri = scanner.nextInt();
            tudien.put(khoa, giaTri); //Gán giá trị khóa cho từ điển
        }

        //chuyển map thành mảng động để sắp xếp
            Map.Entry<String, Integer>[] arr = tudien.entrySet().toArray(new Map.Entry[0]);
            sortByValue(arr);

        System.out.print("Từ điển sau khi sắp xếp theo giá trị : ");
        for(Map.Entry<String, Integer> entry : arr){
            System.out.println(">" + entry.getKey() + " : " + entry.getValue() + "<");
        }
    }
}
