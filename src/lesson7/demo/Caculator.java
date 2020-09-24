/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.demo;

/**
 *
 * @author Lrandom
 */
public class Caculator {
    int sum(int a, int b) throws Exception{
       if(a<10){
         throw new MyException("Tham so dau tien phai lon hơn 10");
       }
       
       if(b<10){
         throw new MyException("So thu hai phai lon hon 10");
       }
       
       return a+b;
    }
}
