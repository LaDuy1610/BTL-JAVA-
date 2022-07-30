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
public class DanhGia implements  Serializable{
    private  String maDG; 
    private  String maSV; 
    private  String chatLuongDongPhuc;
    private  String chatLuongHeThong; 
    private  String diemDG; 
    private  String nhanXet; 
    private  String gopY; 

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getChatLuongDongPhuc() {
        return chatLuongDongPhuc;
    }

    public void setChatLuongDongPhuc(String chatLuongDongPhuc) {
        this.chatLuongDongPhuc = chatLuongDongPhuc;
    }

    public String getChatLuongHeThong() {
        return chatLuongHeThong;
    }

    public void setChatLuongHeThong(String chatLuongHeThong) {
        this.chatLuongHeThong = chatLuongHeThong;
    }
    
    public String getDiemDG() {
        return diemDG;
    }

    public void setDiemDG(String diemDG) {
        this.diemDG = diemDG;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    public String getGopY() {
        return gopY;
    }

    public void setGopY(String gopY) {
        this.gopY = gopY;
    }

    public DanhGia() {
        
    }

    public DanhGia(String maDG, String maSV,String chatLuongDongPhuc,String chatLuongHeThong, String diemDG, String nhanXet, String gopY) {
                 
        this.maDG = maDG;
        this.maSV = maSV; 
        this.chatLuongDongPhuc=chatLuongDongPhuc; 
        this.chatLuongHeThong=chatLuongHeThong;
        this.diemDG = diemDG;
        this.nhanXet = nhanXet;
        this.gopY = gopY;
    }

    @Override
    public String toString() {
        return "DanhGia{" + "maDG=" + maDG + ", maSV=" + maSV + ", chatLuongDongPhuc=" + chatLuongDongPhuc + ", chatLuongHeThong=" + chatLuongHeThong + ", diemDG=" + diemDG + ", nhanXet=" + nhanXet + ", gopY=" + gopY + '}';
    }

  
   
    
}
