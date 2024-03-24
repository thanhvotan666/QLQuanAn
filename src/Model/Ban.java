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
public class Ban {
    private String MAB;
    private String tenBan;
    private String tinhTrang;
    
    public Ban() {
    }

    public Ban(String MAB, String tenBan, String tinhTrang) {
        this.MAB = MAB;
        this.tenBan = tenBan;
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMAB() {
        return MAB;
    }

    public void setMAB(String MAB) {
        this.MAB = MAB;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }
    
    
}
