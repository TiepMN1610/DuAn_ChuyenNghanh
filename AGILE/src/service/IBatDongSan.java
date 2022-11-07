/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.BatDongSan;

/**
 *
 * @author son45
 */
public interface IBatDongSan {

    List<BatDongSan> getData();

    List<BatDongSan> getDataBy(String loai, String key);

    List<BatDongSan> sortBy(String loai, String key);

    boolean removeById(String maBDS);

    boolean updateById(String maBDS, BatDongSan bds);

    boolean add(BatDongSan bs);

    List<BatDongSan> searchByMa(String key);

    List<BatDongSan> searchByTenCHS(String key);

    List<BatDongSan> searchByQuanBDS(String key);

    List<BatDongSan> searchByGia(String key);

    List<BatDongSan> searchByDienTich(String key);

    List<BatDongSan> searchByTenVP(String key);

}
