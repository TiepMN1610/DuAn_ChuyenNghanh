/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NhanVien;
import model.TaiKhoan;
import model.VanPhong;

/**
 *
 * @author son45
 */
public class NhanVienRepository {

    public NhanVien getNhanVien(String user) {
        String query = "select nhanVien.HoNV, nhanVien.TenDemNV,nhanVien.TenNV,\n"
                + "nhanVien.MaNV, nhanVien.GioiTinhNV, nhanVien.EmailNV, DATEDIFF(YEAR,nhanVien.NamSinhNV,GETDATE()),\n"
                + "nhanVien.CccdNV, vanPhong.TenVP\n"
                + "from taiKhoan inner join nhanVien\n"
                + "on nhanVien.IdTK = taiKhoan.Id\n"
                + "inner join vanPhong \n"
                + "on nhanVien.IdVP = vanPhong.Id\n"
                + "where taiKhoan.TenTK = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                VanPhong vanPhong = new VanPhong(rs.getString(9));
                return new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6), rs.getInt(7), rs.getInt(8), vanPhong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        NhanVien nv = new NhanVienRepository().getNhanVien("sonptph25875");
        System.out.println(nv);
    }
}
