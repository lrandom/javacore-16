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
public class Demo<T>{
   T message;
   void setMessage(T name){
     this.message = name;
   }
   
   void printHello(){
       System.out.println(message);
   }
   
   public static void main(String[] args) {
     Demo<String> demo = new Demo();
     demo.setMessage("hi");
     demo.printHello();
     
     Demo<Integer> demo2 = new Demo();
     demo2.setMessage(new Integer(1));
     demo2.printHello();
   }
}
