/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.BatDongSan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author son45
 */
public class BatDongSanRespository {

    public List<BatDongSan> getAll() {
        String query = "SELECT * FROM batDongSan";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> sortBy(String loai, String key) {
        String giaTri = "";
        if (loai.equalsIgnoreCase("Giá tiền")) {
            giaTri = "GiaBDS";
        } else if (loai.equalsIgnoreCase("Diện tích")) {
            giaTri = "dienTichBDS";
        } else {
            giaTri = "MaBDS";
        }
        String check = "";
        if (key.equalsIgnoreCase("tăng")) {
            check = "ASC";
        } else {
            check = "DESC";
        }
        String query = "SELECT * FROM batDongSan ORDER BY " + giaTri + " " + check;
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByMa(String key) {
        String query = "SELECT * FROM batDongSan WHERE MaBDS = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByTenCHS(String key) {
        String query = "SELECT * FROM batDongSan WHERE TenCSH = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByQuanBDS(String key) {
        String query = "SELECT * FROM batDongSan WHERE QuanBDS = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByGia(String key) {
        String query = "SELECT * FROM batDongSan WHERE GiaBDS = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByDienTich(String key) {
        String query = "SELECT * FROM batDongSan WHERE dienTichBDS = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<BatDongSan> searchByTenVP(String key) {
        String query = "SELECT * FROM batDongSan WHERE TenVP = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, key);
            List<BatDongSan> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BatDongSan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean removeByid(String maBDS) {
        int check = 0;
        String query = "DELETE FROM batDongSan WHERE MaBDS = ?";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setString(1, maBDS);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean add(BatDongSan bs) {
        int check = 0;
        String query = "INSERT batDongSan VALUES (?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setString(3, bs.getMa());
            ps.setObject(1, bs.getChuSoHuu());
            ps.setObject(2, bs.getVanPhong());
            ps.setObject(4, bs.getDiaChi());
            ps.setObject(5, bs.getQuan());
            ps.setObject(6, bs.getThanhPho());
            ps.setObject(7, bs.getLoai());
            ps.setObject(8, bs.getDienTich());
            ps.setObject(9, bs.getGia());
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(String maBDS, BatDongSan bds) {
        int check = 0;
        String query = "UPDATE batDongSan SET IdCSH = ?, IdVP = ?, DcBDS = ?, QuanBDS = ?, ThanhPhoBDS = ?, LoaiBDS = ?, dienTichBDS = ?, GiaBDS = ? WHERE MaBDS = ? ";
        try ( Connection conn = SQLServerConection.getConnection();  PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, bds.getChuSoHuu());
            ps.setObject(2, bds.getVanPhong());
            ps.setObject(3, bds.getDiaChi());
            ps.setObject(4, bds.getQuan());
            ps.setObject(5, bds.getThanhPho());
            ps.setObject(6, bds.getLoai());
            ps.setObject(7, bds.getDienTich());
            ps.setObject(8, bds.getGia());
            ps.setString(9, maBDS);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

}
