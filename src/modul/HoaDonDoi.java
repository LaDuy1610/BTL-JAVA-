/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;


import java.io.Serializable;

/**
 *
 * @author PMG
 */
public class HoaDonDoi implements Serializable{
    private String maHD;
    private String loaiDH; 
    private  String maSV;
    private  String tenSV; 
    private String size;
    private  int sl; 
    private  String lidodoi;
    private String ngaydoi; 

    public HoaDonDoi(String maHD, String loaiDH, String maSV, String tenSV, String size, int sl, String lidodoi, String ngaydoi) {
        this.maHD = maHD;
        this.loaiDH = loaiDH;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.size = size;
        this.sl = sl;
        this.lidodoi = lidodoi;
        this.ngaydoi = ngaydoi;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getLoaiDH() {
        return loaiDH;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getSize() {
        return size;
    }

    public int getSl() {
        return sl;
    }

    public String getLidodoi() {
        return lidodoi;
    }

    public String getNgaydoi() {
        return ngaydoi;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setLoaiDH(String loaiDH) {
        this.loaiDH = loaiDH;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setLidodoi(String lidodoi) {
        this.lidodoi = lidodoi;
    }

    public void setNgaydoi(String ngaydoi) {
        this.ngaydoi = ngaydoi;
    }

    
}
