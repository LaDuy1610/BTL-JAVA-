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
public class TaiKhoan implements Serializable{
    private String tenTK;
    private  String matKhau;
    private String loaiTK;
    public TaiKhoan(String tenTK, String matKhau, String loaiTK) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.loaiTK = loaiTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public TaiKhoan() {
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }
    

    @Override
    public String toString() {
        return "TaiKhoan{" + "tenTK=" + tenTK + ", matKhau=" + matKhau + ", loaiTK=" + loaiTK + '}';
    }
    
}
