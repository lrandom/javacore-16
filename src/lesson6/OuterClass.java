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
public class OuterClass {
    /*private String name = "Luan";
    class InnerClass{
       public void printName(){
           System.out.println(OuterClass.this.name);
       }
    }*/
    
    /*static private String name = "Luan";
    static class InnerClass{
       public void printName(){
           System.out.println(OuterClass.name);
       }
    }*/
    
    public void test(){
        class InnerClass{
            void test2(){
                System.out.println("hello");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.test2();
    }
    
    public static void main(String[] args) {
        /*
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass 
                inner = new outerClass.InnerClass();
        inner.printName();*/
    }
}
