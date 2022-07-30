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

/**
 *
 * @author This Pc
 */
public class HoaDonThueController {
    public static ArrayList<HoaDonThue> getListHoaDonThue() throws IOException{
        ArrayList<HoaDonThue> listDPThue = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("DPThue.txt");
            os = new ObjectInputStream(fs);
            listDPThue = (ArrayList<HoaDonThue>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listDPThue;
    }
    public static void themHDThue(HoaDonThue dpt) throws IOException{
        ArrayList<HoaDonThue> themHDT = getListHoaDonThue();
        themHDT.add(dpt);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("DPThue.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(themHDT);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            oos.close();
            fos.close();
        }
    }
    public void xoaHDThue(String maThue) throws IOException{
        ArrayList<HoaDonThue> xoaHDT = getListHoaDonThue();
        for(int i = 0; i < xoaHDT.size(); i++){
            if(xoaHDT.get(i).getMaThue().compareToIgnoreCase(maThue) == 0){
                xoaHDT.remove(i);
            }
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream("DPThue.txt");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(xoaHDT);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                oos.close();
                fos.close();
            }
        }
    }
    public static void checkTraTrue(String maThue) throws IOException{
        ArrayList<HoaDonThue> checkHDT = getListHoaDonThue();
        for(int i = 0; i < checkHDT.size(); i++){
            if(checkHDT.get(i).getMaThue().compareToIgnoreCase(maThue) == 0){
                checkHDT.get(i).setCheckTra(true);
            }
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream("DPThue.txt");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(checkHDT);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                oos.close();
                fos.close();
            }
        }
    }
    public HoaDonThue getHoaDonThueByMaThue(String maThue) throws IOException{
        ArrayList<HoaDonThue> getHDT = getListHoaDonThue();
        for(HoaDonThue hdt: getHDT)
        {
            if(hdt.getMaThue().compareToIgnoreCase(maThue) == 0)
            {
                return hdt;
            }
        }
        return null;
    }
}
