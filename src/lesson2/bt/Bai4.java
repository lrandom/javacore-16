/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2.bt;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Bai4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap a");
        a = scanner.nextInt();
        
        System.out.println("Vui long nhap b");
        b = scanner.nextInt();
        
        System.out.println("Vui long nhap c");
        c = scanner.nextInt();
        
        int min,max;
        min = a;
        if(min>b){
          min=b;
        }
        
        if(min>c){
          min=c;
        }
        
        System.out.println("So nho nhat la "+min);
        //System.out.printf("So nho nhat la %d",min);
        
        max = a;
        if(max<b){
          max=b;
        }
        
        if(max<c){
          max=c;
        }
        
        System.out.println("So lon nhat la "+max);
    }
}
