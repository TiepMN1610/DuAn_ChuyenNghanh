/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author son45
 */
public class BatDongSan {

    private int id;
    private int chuSoHuu;
    private int vanPhong;
    private String ma;
    private String diaChi;
    private String quan;
    private String thanhPho;
    private String loai;
    private int dienTich;
    private int gia;

    public BatDongSan(int id, int chuSoHuu, int vanPhong, String ma, String diaChi, String quan, String thanhPho, String loai, int dienTich, int gia) {
        this.id = id;
        this.chuSoHuu = chuSoHuu;
        this.vanPhong = vanPhong;
        this.ma = ma;
        this.diaChi = diaChi;
        this.quan = quan;
        this.thanhPho = thanhPho;
        this.loai = loai;
        this.dienTich = dienTich;
        this.gia = gia;
    }

    public BatDongSan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(int chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getVanPhong() {
        return vanPhong;
    }

    public void setVanPhong(int vanPhong) {
        this.vanPhong = vanPhong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String soHuu() {
        if (chuSoHuu == 1) {
            return "Nguyễn Thanh Đức";
        } else if (chuSoHuu == 2) {
            return "Nguyễn Thanh Tuấn";
        } else if (chuSoHuu == 3) {
            return "Nguyễn Thanh Hiệu";
        } else if (chuSoHuu == 4) {
            return "Nguyễn Thanh Nam";
        } else {
            return "Nguyễn Thanh Tùng";
        }
    }

    public String vanphong() {
        if (chuSoHuu == 1) {
            return "Bất động sản Thành Hưng";
        } else if (chuSoHuu == 2) {
            return "Bất động sản Nam Hưng";
        } else {
            return "Bất động sản Tuấn Hưng";
        }
    }

    public Object[] toshowData() {
        return new Object[]{soHuu(), vanphong(), ma, diaChi, quan, thanhPho, loai, dienTich, gia + "$"};
    }

    @Override
    public String toString() {
        return "BatDongSan{" + "id=" + id + ", chuSoHuu=" + chuSoHuu + ", vanPhong=" + vanPhong + ", ma=" + ma + ", diaChi=" + diaChi + ", quan=" + quan + ", thanhPho=" + thanhPho + ", loai=" + loai + ", dienTich=" + dienTich + ", gia=" + gia + '}';
    }

}
