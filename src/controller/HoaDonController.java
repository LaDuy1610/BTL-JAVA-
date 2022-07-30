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
import javax.swing.JOptionPane;
import  modul.HoaDon; 

/**
 *
 * @author User
 */
public class HoaDonController {
    public  ArrayList<HoaDon> getListHD() throws IOException{
        ArrayList<HoaDon> listHD = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("HoaDon.txt");
            os = new ObjectInputStream(fs);
            listHD = (ArrayList<HoaDon>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listHD;
    }  
    
    public void themHoaDon(HoaDon hd) throws IOException{
        ArrayList<HoaDon> list = getListHD(); 
        list.add(hd);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("HoaDon.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            JOptionPane.showMessageDialog(null, "Bạn đã đặt thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            oos.close();
            fos.close();
        }
    }
   
    
}
