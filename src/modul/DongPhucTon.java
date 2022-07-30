/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.Serializable;

/**
 *
 * @author db939
 */
public class DongPhucTon implements  Serializable{
    private  String size;
    private  int sL;

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "DongPhucTon{" + "size=" + size + ", sL=" + sL + '}';
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getsL() {
        return sL;
    }

    public void setsL(int sL) {
        this.sL = sL;
    }

    public DongPhucTon(String size, int sL) {
        this.size = size;
        this.sL = sL;
    }
}
