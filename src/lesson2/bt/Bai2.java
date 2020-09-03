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
public class Bai2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap vao mot so");
        number = scanner.nextInt();   
        
        int total=0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
              //number chia het cho i => i la ước
              total = total+i;
            }
        }
        
        if(total==number){
            System.out.println("Đây là số hoàn hảo");
        }else{
            System.out.println("Ko phai la so hoan hao");
        }
    }
}
