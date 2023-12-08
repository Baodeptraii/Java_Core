package Main;

import java.io.Serializable;

public class SinhVien implements Comparable <SinhVien> , Serializable {
    private String maSV, tenSV;
    private int YoB;
    private float gpa;

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien(String maSV, String tenSV, int yoB, float gpa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        YoB = yoB;
        this.gpa = gpa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getYoB() {
        return YoB;
    }

    public void setYoB(int yoB) {
        YoB = yoB;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + YoB + " " + gpa;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    public String getTen(String ten) {
        String[] Ten = ten.split(" ");
        String res = Ten[Ten.length - 1];
        return res;
    }
}
