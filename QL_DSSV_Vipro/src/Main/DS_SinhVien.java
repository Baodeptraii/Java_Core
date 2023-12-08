package Main;

import java.io.*;
import java.util.*;

public class DS_SinhVien {
    private ArrayList<SinhVien> DanhSach;

    public DS_SinhVien(ArrayList<SinhVien> danhSach) {
        DanhSach = danhSach;
    }

    public DS_SinhVien() {
        this.DanhSach = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv) {
        this.DanhSach.add(sv);
    }

    public void inSinhVien() {
        for (SinhVien sinhVien: DanhSach) {
            System.out.println(sinhVien.toString());
        }
    }

    public boolean check_empty() {
        return this.DanhSach.isEmpty();
    }

    public int nums() {
        return this.DanhSach.size();
    }

    public void empty_DS() {
        this.DanhSach.removeAll(DanhSach);
    }

//    public boolean check_SV(String sv) {
//        return this.DanhSach.contains(sv);
//    }

    public boolean check_SV(String ten) {
        for(SinhVien sinhVien: DanhSach) {
            if(sinhVien.getMaSV().indexOf(ten) >= 0 ){
                System.out.println(sinhVien);
                return true;
            }
        }
        return false;
    }

    public void xoa_SV(String ten) {
        for(SinhVien sinhVien: DanhSach) {
            if(sinhVien.getMaSV().indexOf(ten) >= 0 ){
                DanhSach.remove(sinhVien);

            }
        }


    }

    public void find_byTen(String ten) {
        for(SinhVien sinhVien: DanhSach) {
            if(sinhVien.getTen(sinhVien.getTenSV()).equalsIgnoreCase(ten)){
                System.out.println(sinhVien);
            }
        }
    }

    public void sapxepUp() {
        Collections.sort(this.DanhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() > o2.getGpa()) {
                    return 1;
                } else if(o1.getGpa() < o2.getGpa()){
                    return -1;
                } else {
                    return 0;
                }

            }
        });
    }
    public void sapxepDown() {
        Collections.sort(this.DanhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() > o2.getGpa()) {
                    return -1;
                } else if(o1.getGpa() < o2.getGpa()){
                    return 1;
                } else {
                    return 0;
                }

            }
        });
    }

    public void ghiVaoFile(File file) {

        try {
            OutputStream os  = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (SinhVien sv: DanhSach) {
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
