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
public class Bai5 {
    public static void main(String[] args) {
        int a,b,c,d;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap a");
        a = scanner.nextInt();
        
        System.out.println("Vui long nhap b");
        b = scanner.nextInt();
        
        System.out.println("Vui long nhap c");
        c = scanner.nextInt();
        
        System.out.println("Vui long nhap d");
        d = scanner.nextInt();
        
        int[] numbers = new int[4];
        numbers[0]=a;
        numbers[1]=b;
        numbers[2]=c;
        numbers[3]=d;
        
        for (int i = 0; i < 3; i++) {
           for(int j = i+1; j<4;j++){
              if(numbers[i]>numbers[j]){
                 int tmp = numbers[i];
                 numbers[i]=numbers[j];
                 numbers[j]=tmp;
              }
           }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }
    }
}
