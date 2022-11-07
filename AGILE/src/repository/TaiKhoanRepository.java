/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author son45
 */
public class TaiKhoanRepository {

    public TaiKhoan checkTK(String user, String pass) {
        String query = "SELECT TenTK, MatKhauTK FROM taiKhoan WHERE TenTK = ? AND MatKhauTK = ? ";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, user);
            ps.setObject(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new TaiKhoan(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
