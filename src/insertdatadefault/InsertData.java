/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdatadefault;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modul.DanhGia;
import modul.TaiKhoan;
import  modul.SinhVien; 
import  modul.DongPhucTon;
import modul.HoaDonThue;
import  modul.HoaDon; 
import  modul.NguoiQuanTri; 
import modul.HoaDonDoi;
/**
 *
 * @author db939
 */
public class InsertData {
    public  void themTaiKhoan() throws IOException{
        FileOutputStream fos =  null;
        ObjectOutputStream oos = null;
        TaiKhoan tk = new TaiKhoan("SV001", "123", "SinhVien");
         TaiKhoan tk1 = new TaiKhoan("SV002", "123", "SinhVien");
          TaiKhoan tk2 = new TaiKhoan("SV003", "123", "SinhVien");
           TaiKhoan tk4 = new TaiKhoan("QTV001", "123", "QuanTriVien");
            TaiKhoan tk5 = new TaiKhoan("QTV002", "123", "QuanTriVien");
           TaiKhoan tk3 = new TaiKhoan("SV004", "123", "SinhVien");
           TaiKhoan tk6 = new TaiKhoan("SV005", "123", "SinhVien");
           TaiKhoan tk7 = new TaiKhoan("SV006", "123", "SinhVien");

           ArrayList<TaiKhoan> list = new ArrayList<>();
           list.add(tk);
           list.add(tk2);
           list.add(tk3);
           list.add(tk1);
           list.add(tk4);
           list.add(tk5);

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
    public void InsertDongPhucTon() throws IOException{
     FileOutputStream fs = null; 
     ObjectOutputStream os = null; 
     DongPhucTon dongPhucTon1 = new DongPhucTon("X",100); 
     DongPhucTon dongPhucTon2 = new DongPhucTon("XS",200); 
     DongPhucTon dongPhucTon3 = new DongPhucTon("S",320); 
     DongPhucTon dongPhucTon4 = new DongPhucTon("M",50); 
     DongPhucTon dongPhucTon5 = new DongPhucTon("L",400); 
     DongPhucTon dongPhucTon6 = new DongPhucTon("XL",350); 
     DongPhucTon dongPhucTon7 = new DongPhucTon("XXL",500); 


     ArrayList<DongPhucTon> listDPT = new ArrayList<DongPhucTon>(); 
     listDPT.add(dongPhucTon1);
     listDPT.add(dongPhucTon2);
     listDPT.add(dongPhucTon3);
     listDPT.add(dongPhucTon4);
     listDPT.add(dongPhucTon5);
     listDPT.add(dongPhucTon6);
     listDPT.add(dongPhucTon7);
     try {
          fs = new FileOutputStream("DPT.txt"); 
          os = new ObjectOutputStream(fs);
          os.writeObject(listDPT);
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         fs.close();
         os.close();
     }
    }
    public void HoaDonDoi() throws IOException{
        FileOutputStream fos =  null;
        ObjectOutputStream oos = null;
        HoaDonDoi dd1 = new HoaDonDoi("HD001", "Hóa đơn đổi", "2019602309", "Phan Minh Giang", "L", 3, "Trật", "22/02/2022");


           ArrayList<HoaDonDoi> list = new ArrayList<>();
           list.add(dd1);
        try {
            
            fos = new FileOutputStream("HoaDonDoi.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            oos.close();
            fos.close();
        }
    }
    
    public void InsertSinhVien() throws IOException{
     FileOutputStream fs = null; 
     ObjectOutputStream os = null; 
     SinhVien sinhVien1 = new SinhVien("2019602470","SV001","123","Bùi Văn Đức","CNTT2","K14","123456789","Thái Bình","duc7@gmail.com"); 
     SinhVien sinhVien2 = new SinhVien("2019602066","SV002","123","Bùi Đức Duy","CNTT2","K14","123456789","Lạng Sơn","duy2001@gmail.com"); 
     SinhVien sinhVien3 = new SinhVien("2019301170","SV003","123","Ngô Văn Giang","CNTT2","K14","123456789","Thanh Hoá","nvgiang@gmail.com"); 
     SinhVien sinhVien4 = new SinhVien("2019563217","SV004","123","Lã Lê Duy","CNTT2","K14","123456789","Phú Thọ","yurievery@gmail.com"); 
     
     


     ArrayList<SinhVien> listSV = new ArrayList<SinhVien>(); 
     listSV.add(sinhVien1);
     listSV.add(sinhVien2); 
     listSV.add(sinhVien3); 
     listSV.add(sinhVien4); 
   

     try {
          fs = new FileOutputStream("SinhVien.txt"); 
          os = new ObjectOutputStream(fs);
          os.writeObject(listSV);
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         fs.close();
         os.close();
     }
    }
     public void InsertQuanTriVien() throws IOException{
     FileOutputStream fs = null; 
     ObjectOutputStream os = null; 
     
     NguoiQuanTri qtv1 = new NguoiQuanTri("2019781932","Trần Trung Hiếu","Hà Nam"); 
     NguoiQuanTri qtv2 = new NguoiQuanTri("2019602470","Phan Minh Giang","Hà Nội"); 


     ArrayList<NguoiQuanTri> listQTV = new ArrayList<NguoiQuanTri>(); 
     listQTV.add(qtv1);
     listQTV.add(qtv2); 
    

     try {
          fs = new FileOutputStream("QuanTriVien.txt"); 
          os = new ObjectOutputStream(fs);
          os.writeObject(listQTV);
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         fs.close();
         os.close();
     }
    }
      public void InsertDanhGia() throws IOException {
      FileOutputStream f = null; 
      ObjectOutputStream o = null; 
      DanhGia danhGia1 = new DanhGia("DG01","201960247","Hài lòng","hài lòng","2 điểm","Hay","Không");
      ArrayList<DanhGia> listDG = new ArrayList<>(); 
      listDG.add(danhGia1); 
        try {
            f = new FileOutputStream("DanhGia.txt"); 
            o = new ObjectOutputStream(f);
            o.writeObject(listDG);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
         f.close();
         o.close();
        }
    }
      public void InsertHoaDon() throws IOException {
      FileOutputStream f = null; 
      ObjectOutputStream o = null; 
      HoaDon hoaDon = new HoaDon("HD01","Đơn Đặt Áo","2019602470","Ngô Văn Giang","X",2,"Thanh Hóa",100000);
      ArrayList<HoaDon> listHD = new ArrayList<>(); 
      listHD.add(hoaDon); 
        try {
            f = new FileOutputStream("HoaDon.txt"); 
            o = new ObjectOutputStream(f);
            o.writeObject(listHD);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
         f.close();
         o.close();
        }
    }
}
