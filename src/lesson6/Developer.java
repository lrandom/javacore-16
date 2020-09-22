/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author Lrandom
 */
public class Developer extends Human{

    @Override
    public void sleep() {
        //super.sleep(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sleep 4 hours");
    }
    
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.sleep(); //Sleep 4 hours
        
        
    }
}
