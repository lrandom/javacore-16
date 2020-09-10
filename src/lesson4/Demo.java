/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;
/**
 *
 * @author Lrandom
 */
public class Demo {
    public static void main(String[] args) {
        Human luan = 
                new Human("Luan","Đen", "Nâu", (float)1.72);
        
        Human tung = new Human("Tung","Đen", "Đen", (float)1.9);
        
        System.out.println(luan.getEyeColor());
        luan.run();
        
        System.out.println(tung.getEyeColor());
        tung.run();
        
    }
}
