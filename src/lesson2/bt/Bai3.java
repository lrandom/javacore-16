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
public class Bai3 {
    public static void main(String[] args) {
        int a,b,c;
        float delta;
        float result1,result2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap a");
        a = scanner.nextInt();
        
        System.out.println("Vui long nhap b");
        b = scanner.nextInt();
        
        System.out.println("Vui long nhap c");
        c = scanner.nextInt();
        
        delta = b*b - 4*a*c;
        
        if(delta>0){
            System.out.println("Phuong trinh co hai nghiem pb");
            result1 = (float)(-b+Math.sqrt(delta))/(2*a);
            result2 = (float)(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Nghiem 1 "+result1);
            System.out.println("Nghiem 2 "+result2);
        }
        
        if(delta<0){
            System.out.println("Pt vô nghiệm");
        }
        
        if(delta==0){
            System.out.println("Nghiệm kép");
            System.out.println(-b/(2*a));
        }
    }
}
