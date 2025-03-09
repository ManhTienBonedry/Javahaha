//package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan
//
//import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng
//
//public class J65_J70_Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng
//
//        int choice;
//        do {
//            System.out.println("|______________________________HII___________________HI________________________________|");
//            System.out.println("|           Chọn J mà bạn muốn sử dụng : (J65 -> J70)                                 |");
//            System.out.println("|           Nhập 1 : bạn chọn J65 (Tạo hàm đếm số lượng từ trong chuỗi)                |");
//            System.out.println("|           Nhập 2 : bạn chọn J66 (Tạo hàm đếm số lượng ký tự a trong chuỗi)           |");
//            System.out.println("|           Nhập 3 : bạn chọn J67 (Tạo hàm tính tổng các số trong danh sách)            |");
//            System.out.println("|           Nhập 4 : bạn chọn J68 (Tạo hàm tìm số lớn nhất trong danh sách)            |");
//            System.out.println("|           Nhập 5 : bạn chọn J69 (Tạo hàm tìm số nhỏ nhất trong danh sách)            |");
//            System.out.println("|           Nhập 6 : bạn chọn J70 (Tạo hàm tính trung bình của danh sách)              |");
//            System.out.println("|           Nhập 7 : bạn thoát                                                        |");
//            System.out.println("|_________END_____________________________END__________________________________________|");
//            System.out.print("Mời bạn nhập số bạn muốn : ");
//
//            choice = scanner.nextInt(); // Đọc lựa chọn của người dùng
//            scanner.nextLine(); // Cắt dòng trống để tránh lỗi khi đọc tiếp
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhập hàm đếm số lượng từ trong chuỗi");
//                    Dem_So_Luong_Tu dem1 = new Dem_So_Luong_Tu(); // Tạo đối tượng của lớp Dem_So_Luong_Tu
//                    Dem_So_Luong_Tu.J65 j65 = dem1.new J65(); // Tạo đối tượng của inner class J65
//                    j65.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 2:
//                    System.out.println("Nhập hàm đếm số lượng ký tự a trong chuỗi");
//                    Dem_So_Luong_Kytu dem2 = new Dem_So_Luong_Kytu(); // Tạo đối tượng của lớp Dem_So_Luong_Kytu
//                    Dem_So_Luong_Kytu.J66 j66 = dem2.new J66(); // Tạo đối tượng của inner class J66
//                    j66.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 3:
//                    System.out.println("Nhập hàm tính tổng các số trong danh sách");
//                    Tinh_tong_cac_so_trongds tinhTong = new Tinh_tong_cac_so_trongds(); // Tạo đối tượng của lớp Tinh_tong_cac_so_trongds
//                    Tinh_tong_cac_so_trongds.J67 j67 = tinhTong.new J67(); // Tạo đối tượng của inner class J67
//                    j67.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 4:
//                    System.out.println("Nhập hàm tìm số lớn nhất trong danh sách");
//                    Tim_So_Lon_Nhat tim1 = new Tim_So_Lon_Nhat(); // Tạo đối tượng của lớp Tim_So_Lon_Nhat
//                    Tim_So_Lon_Nhat.J68 j68 = tim1.new J68(); // Tạo đối tượng của inner class J68
//                    j68.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 5:
//                    System.out.println("Nhập hàm tìm số nhỏ nhất trong danh sách");
//                    Tim_so_nho_nhat tim2 = new Tim_so_nho_nhat(); // Tạo đối tượng của lớp Tim_so_nho_nhat
//                    Tim_so_nho_nhat.J69 j69 = tim2.new J69(); // Tạo đối tượng của inner class J69
//                    j69.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 6:
//                    System.out.println("Nhập hàm tính trung bình của danh sách");
//                    Tinh_TB tinhTB = new Tinh_TB(); // Tạo đối tượng của lớp Tinh_TB
//                    Tinh_TB.J70 j70 = tinhTB.new J70(); // Tạo đối tượng của inner class J70
//                    j70.xuat(); // Gọi phương thức xuat để chạy chương trình
//                    break;
//                case 7:
//                    System.out.println("Cảm ơn bạn đã sử dụng."); // In thông báo khi thoát
//                    scanner.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại."); // Thông báo khi nhập sai
//            }
//        } while (choice != 7); // Tiếp tục vòng lặp nếu choice không phải là 7
//    }
//} // BẢN NÀY DÙNG THÊM DO NÊN PHÍA CÁC LỚP CON CẦN MỞ SCANNER.CLOSE();

package NOOB_MASTER; // Khai báo package NOOB_MASTER để nhóm các lớp liên quan

import java.util.Scanner; // Nhập lớp Scanner để đọc dữ liệu từ người dùng

// Lớp J65_J70_Main là lớp chính để quản lý và chạy các bài toán từ J65 đến J70
public class J65_J70_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc đầu vào từ người dùng

        int choice; // Biến lưu lựa chọn của người dùng
        while (true) {
            // Hiển thị menu để người dùng chọn bài toán
            System.out.println("|______________________________HII___________________HI________________________________|");
            System.out.println("|           Chọn J mà bạn muốn sử dụng : (J65 -> J70)                                 |");
            System.out.println("|           Nhập 1 : bạn chọn J65 (Đếm số lượng từ trong chuỗi)                       |");
            System.out.println("|           Nhập 2 : bạn chọn J66 (Đếm số lượng ký tự 'a' trong chuỗi)                |");
            System.out.println("|           Nhập 3 : bạn chọn J67 (Tính tổng các số trong danh sách)                  |");
            System.out.println("|           Nhập 4 : bạn chọn J68 (Tìm số lớn nhất trong danh sách)                   |");
            System.out.println("|           Nhập 5 : bạn chọn J69 (Tìm số nhỏ nhất trong danh sách)                   |");
            System.out.println("|           Nhập 6 : bạn chọn J70 (Tính trung bình của danh sách)                     |");
            System.out.println("|           Nhập 7 : bạn thoát                                                       |");
            System.out.println("|_________END_____________________________END__________________________________________|");
            System.out.print("Mời bạn nhập số bạn muốn : ");

            choice = scanner.nextInt(); // Đọc lựa chọn từ người dùng
            scanner.nextLine(); // Xóa bộ đệm để tránh lỗi khi đọc chuỗi sau này

            // Xử lý lựa chọn của người dùng bằng switch-case
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn J65: Đếm số lượng từ trong chuỗi");
                    Dem_So_Luong_Tu dem1 = new Dem_So_Luong_Tu(); // Tạo đối tượng của lớp Dem_So_Luong_Tu
                    Dem_So_Luong_Tu.J65 j65 = dem1.new J65(); // Tạo đối tượng của inner class J65
                    j65.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 2:
                    System.out.println("Bạn đã chọn J66: Đếm số lượng ký tự 'a' trong chuỗi");
                    Dem_So_Luong_Kytu dem2 = new Dem_So_Luong_Kytu(); // Tạo đối tượng của lớp Dem_So_Luong_Kytu
                    Dem_So_Luong_Kytu.J66 j66 = dem2.new J66(); // Tạo đối tượng của inner class J66
                    j66.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 3:
                    System.out.println("Bạn đã chọn J67: Tính tổng các số trong danh sách");
                    Tinh_tong_cac_so_trongds tinhTong = new Tinh_tong_cac_so_trongds(); // Tạo đối tượng của lớp Tinh_tong_cac_so_trongds
                    Tinh_tong_cac_so_trongds.J67 j67 = tinhTong.new J67(); // Tạo đối tượng của inner class J67
                    j67.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 4:
                    System.out.println("Bạn đã chọn J68: Tìm số lớn nhất trong danh sách");
                    Tim_So_Lon_Nhat tim1 = new Tim_So_Lon_Nhat(); // Tạo đối tượng của lớp Tim_So_Lon_Nhat
                    Tim_So_Lon_Nhat.J68 j68 = tim1.new J68(); // Tạo đối tượng của inner class J68
                    j68.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 5:
                    System.out.println("Bạn đã chọn J69: Tìm số nhỏ nhất trong danh sách");
                    Tim_so_nho_nhat tim2 = new Tim_so_nho_nhat(); // Tạo đối tượng của lớp Tim_so_nho_nhat
                    Tim_so_nho_nhat.J69 j69 = tim2.new J69(); // Tạo đối tượng của inner class J69
                    j69.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 6:
                    System.out.println("Bạn đã chọn J70: Tính trung bình của danh sách");
                    Tinh_TB tinhTB = new Tinh_TB(); // Tạo đối tượng của lớp Tinh_TB
                    Tinh_TB.J70 j70 = tinhTB.new J70(); // Tạo đối tượng của inner class J70
                    j70.xuat(); // Chạy phương thức xuat để thực hiện chức năng
                    System.out.println(); // Thêm dòng trống để cách biệt với menu tiếp theo
                    break; // Kết thúc case này và quay lại menu

                case 7:
                    System.out.print("Bạn có chắc chắn muốn thoát? (y/n): ");
                    if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
                        System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                        scanner.close();
                        return;
                    }
                    break;

                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại từ 1 đến 7."); // Thông báo khi nhập sai
            }
        }
    }
}