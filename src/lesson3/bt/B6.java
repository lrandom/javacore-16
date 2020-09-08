/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3.bt;

/**
 *
 * @author Lrandom
 */
public class B6 {
    public static void main(String[] args) {
        String a = "Hello World";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            int x = (int)a.charAt(i);
            if(x>=65 && x<=90){
                x+=32;
            }
            char c = (char)x;
            b+=c;
        }
        System.out.println(b);
    }
}
