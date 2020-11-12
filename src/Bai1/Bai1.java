/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lrandom
 */
public class Bai1 {

    public static void main(String[] args) {
        String[] chuoi = new String[5];
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        //Ghi file
        /*try {
            FileWriter fileWriter = new FileWriter("chuoi.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < 5; i++) {
                System.out.println("Nhap chuoi thu " + (i + 1));
                inputString = scanner.nextLine();
                bufferedWriter.write(inputString);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        String line = "";
        try {
            FileReader fileReader = new FileReader("chuoi.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int index = 0;
            while((line=bufferedReader.readLine())!=null){
              chuoi[index] = line;
              index++;
            }
            bufferedReader.close();
            fileReader.close();
            for (int i = 4; i >= 0; i--) {
                System.out.println(chuoi[i]);
            }
        } catch (Exception ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
