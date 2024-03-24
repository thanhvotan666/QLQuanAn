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
public class Menu {
    private String MAMN;
    private String tenMon;
    private double gia;
    private String loai;
    private String tinhtrang;

    public Menu() {
    }

    public Menu(String MAMN, String tenMon, double gia, String loai, String tinhtrang) {
        this.MAMN = MAMN;
        this.tenMon = tenMon;
        this.gia = gia;
        this.loai = loai;
        this.tinhtrang = tinhtrang;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMAMN() {
        return MAMN;
    }

    public void setMAMN(String MAMN) {
        this.MAMN = MAMN;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    
    
}
