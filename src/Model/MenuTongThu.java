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
public class MenuTongThu {
    private String MAMN;
    private int SoLuongBan;
    private Long TongThu;

    public MenuTongThu() {
    }

    public MenuTongThu(String MAMN, int SoLuongBan, Long TongThu) {
        this.MAMN = MAMN;
        this.SoLuongBan = SoLuongBan;
        this.TongThu = TongThu;
    }

    public String getMAMN() {
        return MAMN;
    }

    public void setMAMN(String MAMN) {
        this.MAMN = MAMN;
    }

    public int getSoLuongBan() {
        return SoLuongBan;
    }

    public void setSoLuongBan(int SoLuongBan) {
        this.SoLuongBan = SoLuongBan;
    }

    public Long getTongThu() {
        return TongThu;
    }

    public void setTongThu(Long TongThu) {
        this.TongThu = TongThu;
    }

    

    
    
}
