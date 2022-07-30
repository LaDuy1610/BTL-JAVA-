/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modul.TaiKhoan;

/**
 *
 * @author db939
 */
public class TaiKhoanController {
    public ArrayList<TaiKhoan> getListTaiKhoan() throws IOException{
        ArrayList<TaiKhoan> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("Taikhoan.txt");
            ois = new ObjectInputStream(fis);
            list = (ArrayList<TaiKhoan>) ois.readObject();
            System.out.println("Ban da chay thong cong");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ois.close();
            fis.close();
        }
        return list;
    }
    public TaiKhoan getTaiKhoan(String taiKhoan, String matKhau) throws IOException{
        ArrayList<TaiKhoan> list = getListTaiKhoan();
        for(TaiKhoan tk : list){
            if(tk.getTenTK().compareToIgnoreCase(taiKhoan) == 0 && tk.getMatKhau().compareToIgnoreCase(matKhau) == 0){
                return tk;
            }
        }
        return  null;
    }
       public TaiKhoan getTaiKhoan(String taiKhoan) throws IOException{
        ArrayList<TaiKhoan> list = getListTaiKhoan();
        for(TaiKhoan tk : list){
            if(tk.getTenTK().compareToIgnoreCase(taiKhoan) == 0 ){
                return tk;
            }
        }
        return  null;
    }
    public void suaTK(String taiKhoan, String passwordmoi) throws IOException{
        ArrayList<TaiKhoan> list = getListTaiKhoan();
        for(TaiKhoan tk : list){
            if(tk.getTenTK().compareToIgnoreCase(taiKhoan) ==  0){
                tk.setMatKhau(passwordmoi);
            }
        }
        
        FileOutputStream fos =  null;
        ObjectOutputStream oos = null;
         try {
            
            fos = new FileOutputStream("Taikhoan.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            oos.close();
            fos.close();
        }
    }
    
}
