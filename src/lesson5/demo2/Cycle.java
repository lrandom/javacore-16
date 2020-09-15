/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.demo2;

/**
 *
 * @author Lrandom
 */
public class Cycle extends Vehicles{
    @Override
    public void getAccess() {
        this.getName();
        System.out.println("Hello");
    }
    
    
    
}
