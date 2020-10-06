/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        /*MyThread t1 = new MyThread(); 
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();
        t2.start();*/
        
//        Thread t3 = new Thread(new MyRunable());
//        t3.start();
        
//        Thread t4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//               
//            }
//        });
          
        
        CalcSalary calcSalary = new CalcSalary(20000000, 1);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                   System.out.println("Calc Gros");
                try {
                    calcSalary.calcGross();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Demo3.class.getName()).log(Level.SEVERE, null, ex);
                }
         
                   System.out.println("Calc Net");
                   calcSalary.calcNet();
                   System.out.println(calcSalary.net);
             
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
               System.out.println("Calc Tax");
               calcSalary.calcTax(50);
             
            }
        });
          
        t1.start();
        t2.start();
        
    }
}
