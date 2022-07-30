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

import modul.HoaDonThue;
import  modul.DongPhucTon;
import modul.TaiKhoan;


/**
 *
 * @author db939
 */
public class DongPhucController {
    public static ArrayList<DongPhucTon> getListDPT() throws IOException{
        ArrayList<DongPhucTon> listDPT = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("DPT.txt");
            os = new ObjectInputStream(fs);
            listDPT = (ArrayList<DongPhucTon>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listDPT;
    }
             public static void congDPTon(String size, int soLuong) throws IOException{
        ArrayList<DongPhucTon> congDPT = getListDPT();
        for(int i = 0; i < congDPT.size(); i++){
            if(congDPT.get(i).getSize().compareToIgnoreCase(size) == 0){
                int setSoLuong = congDPT.get(i).getsL() + soLuong;
                congDPT.get(i).setsL(setSoLuong);
            }
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream("DPT.txt");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(congDPT);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                oos.close();
                fos.close();
            }
        }
    }
     public static void truDPTon(String size, int soLuong) throws IOException{
        ArrayList<DongPhucTon> truDPT = getListDPT();
        for(int i = 0; i < truDPT.size(); i++){
            if(truDPT.get(i).getSize().compareToIgnoreCase(size) == 0){
                int setSoLuong = truDPT.get(i).getsL() - soLuong;
                truDPT.get(i).setsL(setSoLuong);
            }
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream("DPT.txt");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(truDPT);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                oos.close();
                fos.close();
            }
        }
    }
   
}
