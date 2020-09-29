/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.URL;

/**
 *
 * @author Lrandom
 */
public class Demo {
    public static void main(String[] args) {
        try {
            /*FileInputStream fis = new FileInputStream("/Users/mac/desktop/test.txt");
            BufferedInputStream buf = new BufferedInputStream(fis);
            int i =0;*/
            /*System.out.println(fis.available());
            while((i=fis.read())!=-1){
                System.out.println((char)i);
                System.out.println(fis.available());
            }
            fis.close();*/
            /*while((i = buf.read())!=-1){
                System.out.println((char)i);
            }
            buf.close();
            fis.close();*/
            //int i = 0;
            //FileReader fileReader = new FileReader("test.txt");
            /*while((i=fileReader.read())!=-1){
                System.out.println((char)i);
            }*/
            
            /*BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            
            bufferedReader.close();
            fileReader.close();*/
            
            /*URL url = new URL("https://image.freepik.com/free-vector/watercolor-natural-background-with-landscape_23-2148244911.jpg");
            InputStream inputStream =  url.openStream();
            
            FileOutputStream fos = new FileOutputStream("nem-ran.jpg");
            FileInputStream fis = 
                    new FileInputStream("/Users/mac/Downloads/linhtinh/nem-ran.jpg");
            int i = 0 ;
            
            BufferedOutputStream bufferOutput = new BufferedOutputStream(fos);
            while((i=inputStream.read())!=-1){
              bufferOutput.write(i);
            }
            bufferOutput.flush();
            fos.close();
            fis.close();*/
            
            /*File file = new File("/Users/mac/downloads/linhtinh");
            File[] subFiles =  file.listFiles();
            System.out.println("Xin moi chon");
            System.out.println("1. Mo file");
            System.out.println("2. Xoa File");
            System.out.println("3. Doi ten File");
            
            for(int i=0;i<subFiles.length;i++){
                System.out.println(subFiles[i].getAbsolutePath());
            }*/
            
            //Ghi đối tượng
            /*FileOutputStream fos = new FileOutputStream("persons.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            Person person = new Person();
            person.setId(1);
            person.setName("Luan");
            obj.writeObject(person);*/
            
            
            //Đọc đối tượng
            FileInputStream fis = new FileInputStream("persons.dat");
            ObjectInputStream obj = new ObjectInputStream(fis);
            Person person = (Person)obj.readObject();
            System.out.println(person.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Demo() {
    }
}
