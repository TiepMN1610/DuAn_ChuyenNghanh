/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author son45
 */
public class Clock {

    public void Clock(JLabel time) {
        Thread t = new Thread() {
            public void run() {
                while(true){
                    Calendar cal = Calendar.getInstance();
                    int am = cal.get(Calendar.AM_PM);
                    int h = cal.get(Calendar.HOUR);
                    int m = cal.get(Calendar.MINUTE);
                    int s = cal.get(Calendar.SECOND);
                    String am_pm = am == 0 ? "AM" : "PM";
                        String gio = "", phut = "", giay = "";
                        if (h <= 9) {
                            gio = "0" + h;
                        } else {
                            gio = "" + h;
                        }
                        if (m <= 9) {
                            phut = "0" + m;
                        } else {
                            phut = "" + m;
                        }
                        if (s <= 9) {
                            giay = "0" + s;
                        } else {
                            giay = " " + s;
                        }
                        time.setText(gio + ':' + phut + ':' + giay + " " + am_pm);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();
    }
     public void day(JLabel time) {
        Thread t = new Thread() {
            public void run() {
                while(true){
                    Calendar cal = Calendar.getInstance();
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int mont = cal.get(Calendar.MONTH);
                        String ngay = "", thang = "", nam = "";
                        if (day <= 9) {
                            ngay = "0" + day;
                        } else {
                            ngay = "" + day;
                        }
                        if (year <= 9) {
                            nam = "0" + year;
                        } else {
                            nam = "" + year;
                        }
                        if (mont<= 9) {
                            thang = "0" + mont;
                        } else {
                            thang = " " + mont;
                        }
                        time.setText("Ngày " + ngay + " tháng " + thang + " Năm " + nam);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();
    }
}
