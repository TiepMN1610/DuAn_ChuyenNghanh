/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package service.impl;

import model.NhanVien;
import repository.NhanVienRepository;
import service.INhanVien;

/**
 *
 * @author son45
 */
public class NhanVienService implements INhanVien {

    private NhanVienRepository nr = new NhanVienRepository();

    @Override
    public NhanVien getOne(String user) {
        return nr.getNhanVien(user);
    }

}
