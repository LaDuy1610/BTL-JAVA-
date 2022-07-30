/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class NguoiQuanTri implements Serializable{
    private String maQT;
    private String tenQT;
    private String diaChiString; 

    public String getMaQT() {
        return maQT;
    }

    public void setMaQT(String maQT) {
        this.maQT = maQT;
    }

    public String getTenQT() {
        return tenQT;
    }

    public void setTenQT(String tenQT) {
        this.tenQT = tenQT;
    }

    public String getDiaChiString() {
        return diaChiString;
    }

    public void setDiaChiString(String diaChiString) {
        this.diaChiString = diaChiString;
    }

    public NguoiQuanTri(String maQT, String tenQT, String diaChiString) {
        this.maQT = maQT;
        this.tenQT = tenQT;
        this.diaChiString = diaChiString;
    }

    public NguoiQuanTri() {
    }
    
    
}
