/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.BatDongSan;
import repository.BatDongSanRespository;
import service.IBatDongSan;

/**
 *
 * @author son45
 */
public class BatDongSanService implements IBatDongSan {
    
    private BatDongSanRespository bdsr = new BatDongSanRespository();
    
    @Override
    public List<BatDongSan> getData() {
        return bdsr.getAll();
    }
    
    @Override
    public boolean removeById(String maBDS) {
        return bdsr.removeByid(maBDS);
    }
    
    @Override
    public boolean updateById(String maBDS, BatDongSan bds) {
        return bdsr.update(maBDS, bds);
    }
    
    @Override
    public boolean add(BatDongSan bs) {
        return bdsr.add(bs);
    }
    
    @Override
    public List<BatDongSan> sortBy(String loai, String key) {
        return bdsr.sortBy(loai, key);
    }
    
    @Override
    public List<BatDongSan> getDataBy(String loai, String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<BatDongSan> searchByMa(String key) {
        return bdsr.searchByMa(key);
    }
    
    @Override
    public List<BatDongSan> searchByTenCHS(String key) {
        return bdsr.searchByTenCHS(key);
    }
    
    @Override
    public List<BatDongSan> searchByQuanBDS(String key) {
        return bdsr.searchByQuanBDS(key);
    }
    
    @Override
    public List<BatDongSan> searchByGia(String key) {
        return bdsr.searchByGia(key);
    }
    
    @Override
    public List<BatDongSan> searchByDienTich(String key) {
        return bdsr.searchByDienTich(key);
    }
    
    @Override
    public List<BatDongSan> searchByTenVP(String key) {
        return bdsr.searchByTenVP(key);
    }
    
}
