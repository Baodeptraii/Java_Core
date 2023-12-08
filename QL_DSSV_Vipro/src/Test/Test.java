package Test;

import Main.DS_SinhVien;
import Main.SinhVien;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DS_SinhVien ds1 = new DS_SinhVien();
        int flag = 0;
        do {
            System.out.println();
            System.out.println("----------MENU-----------");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không");
            System.out.println("4. Lấy ra số lượng sinh viên trong danh sách");
            System.out.println("5. Làm rỗng danh sách sinh viên");
            System.out.println("6. Tìm sinh viên theo mã");
            System.out.println("7. Xóa sinh viên ra danh sách");
            System.out.println("8. Tìm sinh viên theo tên");
            System.out.println("9. Sắp xếp danh sách sinh viên theo GPA");
            System.out.println("10. Lưu danh sách sinh viên vào tập tin");
            System.out.println("0. Thoát");
            System.out.println("-------------------------");
            System.out.print("Lựa chọn của bạn : ");
            flag = sc.nextInt();
            sc.nextLine();
            if (flag == 1) {

                System.out.print("Nhập mã sinh viên : ");
                String msv = sc.nextLine();
                System.out.print("Nhập họ và tên : ");
                String ten = sc.nextLine();
                System.out.print("Nhập năm sinh : ");
                int nam = sc.nextInt();
                System.out.print("Nhập GPA : ");
                float gpa = sc.nextFloat();
                SinhVien sv = new SinhVien(msv,ten,nam,gpa);
                ds1.themSinhVien(sv);

            } else if (flag == 2) {
                ds1.inSinhVien();

            } else if (flag == 3) {
                if(ds1.check_empty()){
                    System.out.println("Chua có sinh viên nào trong danh sách");
                } else {
                    System.out.println("Đã có sinh viên trong dach sách, bấm số 2 để in");
                }

            } else if (flag == 4) {
                System.out.println("Danh sách có : "+ds1.nums()+" sinh viên");

            } else if (flag == 5) {
                System.out.println("Bạn có chắc muốn xóa chứ ? Y/N ");
                String huhu = sc.nextLine();
                if("Y".compareTo(huhu) ==0 ){
                    ds1.empty_DS();
                    System.out.println("Đã xóa hết. Bấm số 4 để kiểm tra ");
                }

            } else if (flag == 6) {
                System.out.print("Nhập mã sinh viên muốn tìm : ");
                String ma = sc.nextLine();
                SinhVien sv = new SinhVien(ma);
                if(ds1.check_SV(ma) == false) {
                    System.out.println("Không có sinh viên tương ứng");
                }

            } else if (flag == 7) {
                System.out.print("Nhập mã sinh viên muốn xóa : ");
                String ma = sc.nextLine();
                SinhVien sv = new SinhVien(ma);
                ds1.xoa_SV(ma);
                System.out.println("Đã xóa ");

            } else if (flag == 8) {
                System.out.print("Nhập tên sinh viên muốn tìm : ");
                String ma = sc.nextLine();
                ds1.find_byTen(ma);

            } else if (flag == 9) {
                System.out.println("1.Tăng dần");
                System.out.println("2.Giảm dần");
                int aaa = sc.nextInt();
                if(aaa == 1) {
                    ds1.sapxepUp();

                } else {
                    ds1.sapxepDown();
                }
                System.out.println("Đã sắp xếp. Bấm số 2 để in");

            } else if(flag == 10) {
                System.out.print("Nhập tên file : ");
                String file = sc.nextLine();
                File f = new File(file);
                ds1.ghiVaoFile(f);
            }
            System.out.print("Press 'Enter' to continue...");
            String next = sc.nextLine();
            if (next == "")
                continue;
        } while (flag != 0);
    }
}
