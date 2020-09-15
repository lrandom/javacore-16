/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.bt3;

/**
 *
 * @author Lrandom
 */
public class HinhVuong {
     private int chieurong;

    public HinhVuong(int chieurong) {
        this.chieurong = chieurong;
    }
     
    public int chuvi(){
      return this.chieurong*4;
    }
    
    public int dientich(){
      return this.chieurong*this.chieurong;
    }
    
    public static void main(String[] args) {
        HinhVuong hinhvuong = new HinhVuong(10);
        System.out.println(hinhvuong.dientich());
        System.out.println(hinhvuong.chuvi());
    }
}
