/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.Serializable;

/**
 *
 * @author db939
 */
public class SinhVien implements  Serializable{
    private String maSinhVien;
    private  String maTaiKhoan; 
    private String matKhau; 
    private String tenSinhVien;
    private  String lop; 
    private  String khoa; 
    private  String sdt; 
    private String diaChi; 
    private  String email; 

    public SinhVien(String maSinhVien, String maTaiKhoan, String matKhau, String tenSinhVien, String lop, String khoa, String sdt, String diaChi, String email) {
        this.maSinhVien = maSinhVien;
        this.maTaiKhoan = maTaiKhoan;
        this.matKhau = matKhau;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
        this.khoa = khoa;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
    }
    
  

    public SinhVien() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", maTaiKhoan=" + maTaiKhoan + ", matKhau=" + matKhau + ", tenSinhVien=" + tenSinhVien + ", lop=" + lop + ", khoa=" + khoa + ", sdt=" + sdt + ", diaChi=" + diaChi + ", email=" + email + '}';
    }
    
}
