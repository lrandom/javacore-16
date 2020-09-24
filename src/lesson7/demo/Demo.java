/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lrandom
 */
public class Demo {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        //Checked Exception
        /*try {
            FileInputStream fis = 
            new FileInputStream(new File("text.txt")); 
        } 
        catch (Exception e){
            System.out.println("Co loi xay ra "+e.getMessage());
        }*/
        
        //Runtime Exception
        /*int a = 10;
        
        try {
             System.out.println(a/5);
        } catch (ArithmeticException e) {
            System.out.println("Co loi xay ra"+ e.getMessage());
        } finally{
            System.out.println("Finally");
        }*/
        
        /*Caculator calc = new Caculator();
        try {
            calc.sum(4, 3);
        }
        
        catch (MyException e1){
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } */
        
      
       
        //try(
        BufferedReader bufferedReader = 
                new BufferedReader(new FileReader("text.txt"));
              //  ){
            bufferedReader.readLine();
        //}
        bufferedReader.close();
       
    }
}
