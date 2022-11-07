/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author son45
 */
public class NhanVien {

    private String ho;
    private String tenDem;
    private String ten;
    private String ma;
    private boolean gioiTinh;
    private String email;
    private int namSinh;
    private int cccd;
    private VanPhong vanPhong;

    public NhanVien(String ho, String tenDem, String ten, String ma, boolean gioiTinh, String email, int namSinh, int cccd, VanPhong vanPhong) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.ma = ma;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.namSinh = namSinh;
        this.cccd = cccd;
        this.vanPhong = vanPhong;
    }

    public NhanVien() {
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public VanPhong getVanPhong() {
        return vanPhong;
    }

    public void setVanPhong(VanPhong vanPhong) {
        this.vanPhong = vanPhong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", ma=" + ma + ", gioiTinh=" + gioiTinh + ", email=" + email + ", namSinh=" + namSinh + ", cccd=" + cccd + ", vanPhong=" + vanPhong + '}';
    }

}
