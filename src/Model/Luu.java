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
public class Luu {
    private String MAB;
    private String MAMN;
    private int soLuong;
    public Luu() {
    }

    public Luu(String MAB, String MAMN, int soLuong) {
        this.MAB = MAB;
        this.MAMN = MAMN;
        this.soLuong = soLuong;
    }

    public String getMAB() {
        return MAB;
    }

    public void setMAB(String MAB) {
        this.MAB = MAB;
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
    
}
