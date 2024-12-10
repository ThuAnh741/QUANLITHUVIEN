import java.util.ArrayList;
import java.util.List;

public class ThuVien implements QuanLySach {
        private int id;
        private String tenThuVien;
        private List<Sach> danhSachSach;

        public ThuVien(int id, String tenThuVien) {
            this.id = id;
            this.tenThuVien = tenThuVien;
            this.danhSachSach = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTenThuVien() {
            return tenThuVien;
        }

        public void setTenThuVien(String tenThuVien) {
            this.tenThuVien = tenThuVien;
        }

        public List<Sach> getDanhSachSach() {
            return danhSachSach;
        }

        public void setDanhSachSach(List<Sach> danhSachSach) {
            this.danhSachSach = danhSachSach;
        }

        @Override
        public void themSachMoi(Sach sach) {
            danhSachSach.add(sach);
        }

        @Override
        public void xoaSach(int id) {
            for(Sach i : danhSachSach) {
                if(i.getId() == id) {
                    danhSachSach.remove(i);
                    System.out.println("Sách có Id: " + String.valueOf(id) + "đã xoá");
                    break;
                } else {
                    System.out.println("Không tìm thấy sách có Id: " + String.valueOf(id));
                }
            }

        }
        @Override
        public void timKiemSach(String keyword) {
            boolean timThay = false;
            for (Sach sach : danhSachSach) {
                if (sach.getTieuDe().equals(keyword) || sach.getTacGia().equals(keyword)) {
                    System.out.println("Đã tìm thấy sách: ");
                    System.out.println(sach.toString());
                    timThay = true;
                }
            }
            if (!timThay) {
                System.out.println("Không tìm thấy sách");
            }
        }

        @Override
        public void hienThiDanhSachSach() {
            for (Sach sach : danhSachSach) {
                System.out.println(sach);
            }
        }

        @Override
        public String toString() {
            return "ThuVien{" +
                    "id=" + id +
                    ", tenThuVien='" + tenThuVien + '\'' +
                    ", tongSoSach=" + danhSachSach.size() +
                    '}';
        }
    }


