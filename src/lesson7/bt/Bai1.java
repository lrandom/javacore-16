/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.bt;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Bai1 {
    public static void main(String[] args) {
        int a=0; 
        int b=0;
        boolean isCorrectA = false;
        boolean isCorrectB = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap vao so a");
        
        do {            
          try {
            a = scanner.nextInt();  
            isCorrectA = true;
          } catch (Exception e) {
            isCorrectA = false;
            scanner.nextLine();
            System.out.println("Vui long nhap lai");
          }
        } while (isCorrectA==false);
 

        scanner.nextLine();
        System.out.println("Vui long nhap so b");
        do {            
          try {
            b = scanner.nextInt();  
            isCorrectB = true;
          } catch (Exception e) {
            isCorrectB = false;
            scanner.nextLine();
            System.out.println("Vui long nhap lai");
          }
        } while (isCorrectB==false);
        
        System.out.println("Tong hai so la "+ (a+b));
                
    }
}
