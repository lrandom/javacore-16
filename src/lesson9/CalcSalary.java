/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

/**
 *
 * @author Lrandom
 */
public class CalcSalary {
    public int salary;
    public int month;
    public float gross;
    public float net;
    public float tax;

    public CalcSalary(int salary, int month) {
        this.salary = salary;
        this.month = month;
    }
    
    
    public synchronized void calcGross() throws InterruptedException{
        this.gross = this.salary * this.month;
        wait();
    }
    
    public synchronized void calcNet(){
        this.net = this.gross - this.tax;
    }
    
    public synchronized void calcTax(float tax){
        this.tax = tax;
        notify();
    }
}
