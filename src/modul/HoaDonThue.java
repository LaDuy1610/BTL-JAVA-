/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author db939
 */
public class HoaDonThue implements  Serializable {
    private String maThue;
    private String size;
    private int sL;
    private String ngayThue;
    private String ngayTra;
    private int donGia;
    private String maSinhVien;
    private boolean checkTra;
    @Override
    public String toString() {
        return "DongPhucThue{" + "maThue=" + maThue + ", size=" + size + ", sL=" + sL + ", ngayThue=" + ngayThue + ", ngayTra=" + ngayTra + '}';
    }

    public HoaDonThue(String size, int sL, String ngayThue, String ngayTra, String maSinhVien) {
        Random rd = new Random();
        maThue = "THUE" + rd.nextInt(100);
        this.size = size;
        this.sL = sL;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.maSinhVien = maSinhVien;
        this.checkTra = false;
        switch(this.size){
            case "X":
                donGia = 10000;
                break;
            case "XS":
                donGia = 11000;
                break;
            case "S":
                donGia = 12000;
                break;
            case "M":
                donGia = 13000;
                break;
            case "L":
                donGia = 14000;
                break;
            case "XL":
                donGia = 15000;
                break;
            case "XXL":
                donGia = 16000;
                break;    
        }
    }
    
    public long tongTien(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date d1 = null;
            Date d2 = null;
            try {
                d1 = sdf.parse(ngayThue);
                d2 = sdf.parse(ngayTra);
            } catch (ParseException e) {
            }
        long diff = (d2.getTime() - d1.getTime()) / (24 * 3600 * 1000);;
        return donGia * sL * diff; 
    }
    public String getMaThue() {
        return maThue;
    }

    public void setMaThue(String maThue) {
        this.maThue = maThue;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getsL() {
        return sL;
    }

    public void setsL(int sL) {
        this.sL = sL;
    }
    
    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }
    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public boolean isCheckTra() {
        return checkTra;
    }

    public void setCheckTra(boolean checkTra) {
        this.checkTra = checkTra;
    }

}
