/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author son45
 */
public interface ITaiKhoan {

    public TaiKhoan checkLogIn(String user, String pass);
}
