/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;


/**
 *
 * @author tanda
 */
public class HoaDon {
    private String MAHD;
    private String ngayLap;
    private double thanhTien;
    private String MAB;
    private String MANV;
    
    public HoaDon() {
    }

    public HoaDon(String MAHD, String ngayLap, double thanhTien, String MAB, String MANV) {
        this.MAHD = MAHD;
        this.ngayLap = ngayLap;
        this.thanhTien = thanhTien;
        this.MAB = MAB;
        this.MANV = MANV;
    }



    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMAB() {
        return MAB;
    }

    public void setMAB(String MAB) {
        this.MAB = MAB;
    }

}

