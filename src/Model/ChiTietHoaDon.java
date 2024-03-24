/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tanda
 */
public class ChiTietHoaDon {
    private String MACTHD;
    private String MAHD;
    private String MAMN;
    private int soLuong;
    private double tongTien;

    public ChiTietHoaDon() {
    }


    public ChiTietHoaDon(String MACTHD, String MAHD, String MAMN, int soLuong, double tongTien) {
        this.MACTHD = MACTHD;
        this.MAHD = MAHD;
        this.MAMN = MAMN;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public String getMACTHD() {
        return MACTHD;
    }

    public void setMACTHD(String MACTHD) {
        this.MACTHD = MACTHD;
    }

    
    
    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMAMN() {
        return MAMN;
    }

    public void setMAMN(String MAMN) {
        this.MAMN = MAMN;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
            
}
