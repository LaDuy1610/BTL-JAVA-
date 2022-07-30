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
import  modul.SinhVien;
/**
 *
 * @author db939
 */
public class SinhVienController {
    public  ArrayList<SinhVien> getListSinhViens() throws IOException{
        ArrayList<SinhVien> listSinhViens = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("SinhVien.txt");
            os = new ObjectInputStream(fs);
            listSinhViens = (ArrayList<SinhVien>)os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fs.close();
            os.close();
        }
        return listSinhViens;
    }  
    public SinhVien getSinhVienByID(String id) throws IOException{
        ArrayList<SinhVien> list = getListSinhViens();
        for(SinhVien sv: list)
        {
            if(sv.getMaTaiKhoan().compareToIgnoreCase(id) == 0)
            {
                return sv;
            }
        }
        return null;
    }
       public SinhVien getSinhVienByMa(String ma) throws IOException{
        ArrayList<SinhVien> list = getListSinhViens();
        for(SinhVien sv: list)
        {
            if(sv.getMaSinhVien().compareToIgnoreCase(ma) == 0)
            {
                return sv;
            }
        }
        return null;
    }
//    public static void main(String[] args) throws IOException {
//        ArrayList<SinhVien> listSinhViens = getListSinhViens();
//        for(SinhVien x: listSinhViens){
//            System.out.println(x.toString());
//        }
//    }
    
    
}
