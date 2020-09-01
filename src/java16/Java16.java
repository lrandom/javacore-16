/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java16;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Java16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello World");
        
        //đặt một biến
        int number = 0; 
        //number = "String";
        
        //camelCase fullName
        //under_score full_name
        //Pascal FullName -> class
        //kebab full-name
        
        //System.out.println(number);
        
        //System.out.printf("%d", number);
        
        //Lay mot so tu ban phim
        /*Scanner s = new Scanner(System.in);
        number = s.nextInt();
        System.out.println(number);
        
        System.out.println("Hello \"Luan\" \tQuang Ninh\n");*/
        
        System.out.println(!true);
        System.out.println(!false);
        
        System.out.println(10==10);//true
        System.out.println(10!=5); //true
        System.out.println(10<5);//false
        System.out.println(10>5);//true
        System.out.println(10<=10);//true
        System.out.println(10>=10);//true
        
        int i = (10==5)?1:2; //2//unary
        if(10==5){
          i = 1;
        }else{
          i = 2;
        }
        
        System.out.println(i); 
        
        System.out.println((10>=0) && (10<=5));//false
        System.out.println((5<10) && (1<10));//true
        
        System.out.println((10>=0) || (5<10));//true
        
        //chuyển kiểu tường minh
        float a = 10;
        int b =(int)a;//exception cannot cast exception

        
        
        
        //chuyển kiểu ngầm định
        /*int c = 10;
        float x = c;*/
    }
}
