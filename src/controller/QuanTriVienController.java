/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import modul.SinhVien;
import  modul.NguoiQuanTri; 

/**
 *
 * @author User
 */
public class QuanTriVienController {
       public  ArrayList<NguoiQuanTri> getListQT() throws IOException{
        ArrayList<NguoiQuanTri> listQT = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("NguoiQuanTri.txt");
            os = new ObjectInputStream(fs);
            listQT = (ArrayList<NguoiQuanTri>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listQT;
    } 
}
