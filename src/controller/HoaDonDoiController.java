/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import  modul.HoaDonDoi; 
/**
 *
 * @author PMG
 */
public class HoaDonDoiController {
     public ArrayList<HoaDonDoi> getListHD() throws IOException{
        ArrayList<HoaDonDoi> listHD = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("HoaDonDoi.txt");
            os = new ObjectInputStream(fs);
            listHD = (ArrayList<HoaDonDoi>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listHD;
    }  
    
    public void themHoaDon(HoaDonDoi dd) throws IOException{
        ArrayList<HoaDonDoi> list = getListHD(); 
        list.add(dd);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("HoaDonDoi.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            JOptionPane.showMessageDialog(null, "Bạn đã đổi thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            oos.close();
            fos.close();
        }
    }

   
    
}
