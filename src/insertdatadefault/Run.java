/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdatadefault;

import java.io.IOException;

/**
 *
 * @author db939
 */
public class Run {
    static InsertData it = new InsertData();
    public static void main(String[] args) throws IOException {
        it.themTaiKhoan();
        it.InsertSinhVien();
        it.InsertDongPhucTon();
        it.InsertQuanTriVien();
        it.InsertDanhGia();
        it.InsertHoaDon();
        it.HoaDonDoi();
    }
}
