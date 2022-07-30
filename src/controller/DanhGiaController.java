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
import modul.DanhGia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DanhGiaController {

    public ArrayList<DanhGia> getListDanhGia() throws IOException {
        ArrayList<DanhGia> listDanhGias = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("DanhGia.txt");
            os = new ObjectInputStream(fs);
            listDanhGias = (ArrayList<DanhGia>) os.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fs.close();
            os.close();
        }
        return listDanhGias;
    }

    public void themDanhGia(DanhGia dg) throws IOException {
        ArrayList<DanhGia> list = getListDanhGia();
        list.add(dg);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("DanhGia.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            JOptionPane.showMessageDialog(null, "Bạn đã gửi đánh giá thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fos.close();
        }
    }

    public void xoaDanhGia(String madg) throws IOException {
        ArrayList<DanhGia> list = getListDanhGia();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaDG().compareToIgnoreCase(madg) == 0) {
                list.remove(i);
            }
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("DanhGia.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            JOptionPane.showMessageDialog(null, "Bạn xóa thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fos.close();
        }

    }

    public DanhGia getDanhGiaByMa(String ma) throws IOException {
        ArrayList<DanhGia> list = getListDanhGia();
        for (DanhGia dg : list) {
            if (dg.getMaDG().compareToIgnoreCase(ma) == 0) {
                return dg;
            }
        }
        return null;
    }
        public DanhGia getDanhGiaByMaSV(String ma) throws IOException{
        ArrayList<DanhGia> list = getListDanhGia();
        for(DanhGia dg: list)
        {
            if(dg.getMaSV().compareToIgnoreCase(ma) == 0)
            {
                return dg;
            }
        }
        return null;
    }
//   public static void main(String[] args) throws IOException {
//     ArrayList<DanhGia> listDanhGias = getListDanhGia(); 
//     for (DanhGia x : listDanhGias){
//          System.out.println(x.toString());
//     }
//   }

}
