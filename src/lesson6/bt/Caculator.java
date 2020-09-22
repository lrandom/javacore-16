/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.bt;

/**
 *
 * @author Lrandom
 */
public class Caculator {
    public int sum(int a, int b){
       return a+b;
    }
    
    public double sum(double a, double b){
       return a+b;
    }
    
    public int sum(int a, int b, int c){
       return a+b+c;
    }
    
    public static void main(String[] args) {
        Caculator calCaculator = new Caculator();
        System.out.println(calCaculator.sum(1, 1));
        System.out.println(calCaculator.sum(1, 1));
        System.out.println(calCaculator.sum(1, 1, 2));
    }
    
    
}
