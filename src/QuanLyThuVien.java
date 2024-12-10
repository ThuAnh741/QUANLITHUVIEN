import java.util.Scanner;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien thuVien = new ThuVien(1, "Thư viện Đại học");
        boolean run = true;
        while (run) {
            System.out.println("\n--- Quản lý thư viện ---");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Xóa sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Hiển thị danh sách sách");
            System.out.println("5. Hiển thị thông tin thư viện");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Nhập ID sách: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String theLoai = sc.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXuatBan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập trạng thái (1: Sẵn sàng/2: Đang mượn): ");
                    int a = sc.nextInt();
                    String trangThai = "Sẵn sàng";
                    if(a == 2) {
                        trangThai = "Đang mượn";
                    }
                    Sach sach = new Sach(id, tieuDe, tacGia, theLoai, namXuatBan, trangThai);
                    thuVien.themSachMoi(sach);
                    break;
                case 2:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int idXoa = sc.nextInt();
                    thuVien.xoaSach(idXoa);
                    break;
                case 3:
                    System.out.print("Nhập tiêu đề hoặc tác giả cần tìm: ");
                    String keyword = sc.nextLine();
                    thuVien.timKiemSach(keyword);
                    break;
                case 4:
                    thuVien.hienThiDanhSachSach();
                    break;
                case 5:
                    System.out.println(thuVien);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    run = false;
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
