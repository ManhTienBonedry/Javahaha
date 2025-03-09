//package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan
//
//import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng
//
//// Lớp J60_J64_Main là lớp chính để chạy tất cả các bài toán từ J60 đến J64
//public class J60_J64_Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng
//
//        int choice; // Biến lưu lựa chọn của người dùng
//        while (true) {
//            // Hiển thị menu để người dùng chọn bài toán
//            System.out.println("|______________________________HII___________________HI________________________________|");
//            System.out.println("|           Chọn J mà bạn muốn sử dụng : (J60 -> J64)                                 |");
//            System.out.println("|           Nhập 1 : bạn chọn J60 (Tạo hàm kiểm tra số nguyên tố)                     |");
//            System.out.println("|           Nhập 2 : bạn chọn J61 (Tạo hàm tính giai thừa của số n)                   |");
//            System.out.println("|           Nhập 3 : bạn chọn J62 (Tạo hàm tính số Fibonacci thứ n)                   |");
//            System.out.println("|           Nhập 4 : bạn chọn J63 (Tạo hàm kiểm tra chuỗi đối xứng)                   |");
//            System.out.println("|           Nhập 5 : bạn chọn J64 (Tạo hàm đảo ngược chuỗi)                           |");
//            System.out.println("|           Nhập 6 : bạn thoát                                                       |");
//            System.out.println("|_________END_____________________________END__________________________________________|");
//            System.out.print("Mời bạn nhập số bạn muốn : ");
//
//            choice = sc.nextInt(); // Đọc lựa chọn của người dùng
//            sc.nextLine(); // Cắt dòng trống để tránh lỗi khi đọc chuỗi sau này
//
//            switch (choice) { // Sử dụng switch-case để xử lý lựa chọn của người dùng
//                case 1:
//                    System.out.println("Nhập hàm kiểm tra số nguyên tố");
//                    KiemTraNguyen_To dem1 = new KiemTraNguyen_To(); // Tạo đối tượng của lớp KiemTraNguyen_To
//                    KiemTraNguyen_To.J60 J60 = dem1.new J60(); // Tạo đối tượng của inner class J60
//                    J60.xuat(); // Gọi phương thức xuat để chạy chương trình kiểm tra số nguyên tố
//                    try { //Thêm thời gian trễ trước khi đóng
//                        Thread.sleep(2000); // Chờ 2 giây
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    sc.close(); // Đóng Scanner sau khi hoàn thành
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break;
//                case 2:
//                    System.out.println("Nhập hàm tính giai thừa của số n");
//                    Tinh_GiaiThua dem2 = new Tinh_GiaiThua(); // Tạo đối tượng của lớp Tinh_GiaiThua
//                    Tinh_GiaiThua.J61 J61 = dem2.new J61(); // Tạo đối tượng của inner class J61
//                    J61.xuat(); // Gọi phương thức xuat để chạy chương trình tính giai thừa
//                    try {
//                        Thread.sleep(2000); // Chờ 2 giây
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    sc.close(); // Đóng Scanner sau khi hoàn thành
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break;
//                case 3:
//                    System.out.println("Nhập hàm tính số Fibonacci thứ n");
//                    Fi_bonacci fi = new Fi_bonacci(); // Tạo đối tượng của lớp Fi_bonacci
//                    Fi_bonacci.J62 J62 = fi.new J62(); // Tạo đối tượng của inner class J62
//                    J62.xuat(); // Gọi phương thức xuat để chạy chương trình tính Fibonacci
//                    try {
//                        Thread.sleep(2000); // Chờ 2 giây
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    sc.close(); // Đóng Scanner sau khi hoàn thành
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break;
//                case 4:
//                    System.out.println("Nhập hàm kiểm tra chuỗi đối xứng");
//                    Chuoi_Doi_Xung chuoi = new Chuoi_Doi_Xung(); // Tạo đối tượng của lớp Chuoi_Doi_Xung
//                    Chuoi_Doi_Xung.J63 J63 = chuoi.new J63(); // Tạo đối tượng của inner class J63
//                    J63.xuat(); // Gọi phương thức xuat để chạy chương trình kiểm tra chuỗi đối xứng
//                    try {
//                        Thread.sleep(2000); // Chờ 2 giây
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    sc.close(); // Đóng Scanner sau khi hoàn thành
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break;
//                case 5:
//                    System.out.println("Nhập hàm đảo ngược chuỗi");
//                    Dao_Nguoc_Chuoi DaoNguoc = new Dao_Nguoc_Chuoi(); // Tạo đối tượng của lớp Dao_Nguoc_Chuoi
//                    Dao_Nguoc_Chuoi.J64 J64 = DaoNguoc.new J64(); // Tạo đối tượng của inner class J64
//                    J64.xuat(); // Gọi phương thức xuat để chạy chương trình đảo ngược chuỗi
//                    try {
//                        Thread.sleep(2000); // Chờ 2 giây
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    sc.close(); // Đóng Scanner sau khi hoàn thành
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break;
//                case 6:
//                    System.out.println("Cảm ơn bạn đã sử dụng."); // In thông báo khi thoát
//                    sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break; // Không cần thiết vì System.exit(0) đã dừng chương trình, nhưng để cú pháp hoàn chỉnh
//                default:
//                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại."); // Thông báo khi nhập sai lựa chọn
//            }
//        }
//    }
//}
package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp J60_J64_Main là lớp chính để chạy tất cả các bài toán từ J60 đến J64
public class J60_J64_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng

        int choice; // Biến lưu lựa chọn của người dùng
        while (true) {
            // Hiển thị menu để người dùng chọn bài toán
            System.out.println("|______________________________HII___________________HI________________________________|");
            System.out.println("|           Chọn J mà bạn muốn sử dụng : (J60 -> J64)                                 |");
            System.out.println("|           Nhập 1 : bạn chọn J60 (Tạo hàm kiểm tra số nguyên tố)                     |");
            System.out.println("|           Nhập 2 : bạn chọn J61 (Tạo hàm tính giai thừa của số n)                   |");
            System.out.println("|           Nhập 3 : bạn chọn J62 (Tạo hàm tính số Fibonacci thứ n)                   |");
            System.out.println("|           Nhập 4 : bạn chọn J63 (Tạo hàm kiểm tra chuỗi đối xứng)                   |");
            System.out.println("|           Nhập 5 : bạn chọn J64 (Tạo hàm đảo ngược chuỗi)                           |");
            System.out.println("|           Nhập 6 : bạn thoát                                                       |");
            System.out.println("|_________END_____________________________END__________________________________________|");
            System.out.print("Mời bạn nhập số bạn muốn : ");

            choice = sc.nextInt(); // Đọc lựa chọn của người dùng
            sc.nextLine(); // Cắt dòng trống để tránh lỗi khi đọc chuỗi sau này

            switch (choice) { // Sử dụng switch-case để xử lý lựa chọn của người dùng
                case 1:
                    System.out.println("Nhập hàm kiểm tra số nguyên tố");
                    KiemTraNguyen_To dem1 = new KiemTraNguyen_To(); // Tạo đối tượng của lớp KiemTraNguyen_To
                    KiemTraNguyen_To.J60 J60 = dem1.new J60(); // Tạo đối tượng của inner class J60
                    J60.xuat(); // Gọi phương thức xuat để chạy chương trình kiểm tra số nguyên tố
                    String confirm1 = "";
                    while (true) { // Vòng lặp kiểm tra đầu vào
                        System.out.print("\nNhấn 'y' để thoát, 'n' để tiếp tục (chỉ nhập y hoặc n): ");
                        confirm1 = sc.nextLine().trim(); // Đọc và loại bỏ khoảng trắng
                        if (confirm1.equalsIgnoreCase("y") || confirm1.equalsIgnoreCase("n")) {
                            break; // Thoát vòng lặp nếu nhập đúng 'y' hoặc 'n'
                        }
                        System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'!");
                    }
                    if (confirm1.equalsIgnoreCase("y")) { // Nếu người dùng nhập 'y'
                        sc.close(); // Đóng Scanner sau khi hoàn thành
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                    }
                    // Nếu nhập 'n', tự động quay lại menu
                    break;
                case 2:
                    System.out.println("Nhập hàm tính giai thừa của số n");
                    Tinh_GiaiThua dem2 = new Tinh_GiaiThua(); // Tạo đối tượng của lớp Tinh_GiaiThua
                    Tinh_GiaiThua.J61 J61 = dem2.new J61(); // Tạo đối tượng của inner class J61
                    J61.xuat(); // Gọi phương thức xuat để chạy chương trình tính giai thừa
                    String confirm2 = "";
                    while (true) { // Vòng lặp kiểm tra đầu vào
                        System.out.print("\nNhấn 'y' để thoát, 'n' để tiếp tục (chỉ nhập y hoặc n): ");
                        confirm2 = sc.nextLine().trim(); // Đọc và loại bỏ khoảng trắng
                        if (confirm2.equalsIgnoreCase("y") || confirm2.equalsIgnoreCase("n")) {
                            break; // Thoát vòng lặp nếu nhập đúng 'y' hoặc 'n'
                        }
                        System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'!");
                    }
                    if (confirm2.equalsIgnoreCase("y")) { // Nếu người dùng nhập 'y'
                        sc.close(); // Đóng Scanner sau khi hoàn thành
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                    }
                    // Nếu nhập 'n', tự động quay lại menu
                    break;
                case 3:
                    System.out.println("Nhập hàm tính số Fibonacci thứ n");
                    Fi_bonacci fi = new Fi_bonacci(); // Tạo đối tượng của lớp Fi_bonacci
                    Fi_bonacci.J62 J62 = fi.new J62(); // Tạo đối tượng của inner class J62
                    J62.xuat(); // Gọi phương thức xuat để chạy chương trình tính Fibonacci
                    String confirm3 = "";
                    while (true) { // Vòng lặp kiểm tra đầu vào
                        System.out.print("\nNhấn 'y' để thoát, 'n' để tiếp tục (chỉ nhập y hoặc n): ");
                        confirm3 = sc.nextLine().trim(); // Đọc và loại bỏ khoảng trắng
                        if (confirm3.equalsIgnoreCase("y") || confirm3.equalsIgnoreCase("n")) {
                            break; // Thoát vòng lặp nếu nhập đúng 'y' hoặc 'n'
                        }
                        System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'!");
                    }
                    if (confirm3.equalsIgnoreCase("y")) { // Nếu người dùng nhập 'y'
                        sc.close(); // Đóng Scanner sau khi hoàn thành
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                    }
                    // Nếu nhập 'n', tự động quay lại menu
                    break;
                case 4:
                    System.out.println("Nhập hàm kiểm tra chuỗi đối xứng");
                    Chuoi_Doi_Xung chuoi = new Chuoi_Doi_Xung(); // Tạo đối tượng của lớp Chuoi_Doi_Xung
                    Chuoi_Doi_Xung.J63 J63 = chuoi.new J63(); // Tạo đối tượng của inner class J63
                    J63.xuat(); // Gọi phương thức xuat để chạy chương trình kiểm tra chuỗi đối xứng
                    String confirm4 = "";
                    while (true) { // Vòng lặp kiểm tra đầu vào
                        System.out.print("\nNhấn 'y' để thoát, 'n' để tiếp tục (chỉ nhập y hoặc n): ");
                        confirm4 = sc.nextLine().trim(); // Đọc và loại bỏ khoảng trắng
                        if (confirm4.equalsIgnoreCase("y") || confirm4.equalsIgnoreCase("n")) {
                            break; // Thoát vòng lặp nếu nhập đúng 'y' hoặc 'n'
                        }
                        System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'!");
                    }
                    if (confirm4.equalsIgnoreCase("y")) { // Nếu người dùng nhập 'y'
                        sc.close(); // Đóng Scanner sau khi hoàn thành
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                    }
                    // Nếu nhập 'n', tự động quay lại menu
                    break;
                case 5:
                    System.out.println("Nhập hàm đảo ngược chuỗi");
                    Dao_Nguoc_Chuoi DaoNguoc = new Dao_Nguoc_Chuoi(); // Tạo đối tượng của lớp Dao_Nguoc_Chuoi
                    Dao_Nguoc_Chuoi.J64 J64 = DaoNguoc.new J64(); // Tạo đối tượng của inner class J64
                    J64.xuat(); // Gọi phương thức xuat để chạy chương trình đảo ngược chuỗi
                    String confirm5 = "";
                    while (true) { // Vòng lặp kiểm tra đầu vào
                        System.out.print("\nNhấn 'y' để thoát, 'n' để tiếp tục (chỉ nhập y hoặc n): ");
                        confirm5 = sc.nextLine().trim(); // Đọc và loại bỏ khoảng trắng
                        if (confirm5.equalsIgnoreCase("y") || confirm5.equalsIgnoreCase("n")) {
                            break; // Thoát vòng lặp nếu nhập đúng 'y' hoặc 'n'
                        }
                        System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'!");
                    }
                    if (confirm5.equalsIgnoreCase("y")) { // Nếu người dùng nhập 'y'
                        sc.close(); // Đóng Scanner sau khi hoàn thành
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                    }
                    // Nếu nhập 'n', tự động quay lại menu
                    break;
                case 6:
                    System.out.print("Bạn có chắc chắn muốn thoát? (y/n): ");
                    if (sc.nextLine().trim().equalsIgnoreCase("y")) {
                        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                        sc.close();
                        System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
                        return;
                    }
                    break;
//                    System.out.println("Cảm ơn bạn đã sử dụng."); // In thông báo khi thoát
//                    sc.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
//                    System.exit(0); // Kết thúc chương trình và đóng cửa sổ console
//                    break; // Không cần thiết vì System.exit(0) đã dừng chương trình, nhưng để cú pháp hoàn chỉnh
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại."); // Thông báo khi nhập sai lựa chọn
            }
        }
    }
}