/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.TaiKhoan;
import repository.TaiKhoanRepository;
import service.ITaiKhoan;

/**
 *
 * @author son45
 */
public class TaiKhoanService implements ITaiKhoan{
private TaiKhoanRepository ts = new TaiKhoanRepository();
    @Override
    public TaiKhoan  checkLogIn(String user, String pass) {
        return ts.checkTK(user, pass);
    }
    
}
