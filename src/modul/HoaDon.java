/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.Serializable;

/**
 *
 * @author
 */
public class HoaDon implements Serializable{
    private String maDH; 
    private String loaiDH; 
    private  String maSV;
    private  String tenSV; 
    private String size;
    private  int sl; 
    private  String diaChiNhan; 
    private  int gia; 

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getLoaiDH() {
        return loaiDH;
    }

    public void setLoaiDH(String loaiDH) {
        this.loaiDH = loaiDH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    

    public float getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public HoaDon() {
    }

    public HoaDon(String maDH, String loaiDH, String maSV, String tenSV, String size, int sl,String diaChiNhan, int gia) {
        this.maDH = maDH;
        this.loaiDH = loaiDH;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.size = size;
        this.sl = sl;
        this.diaChiNhan=diaChiNhan;
        this.gia = gia;
    }
    public int TongTien(){
        return gia*sl;
     
    }

 

}
