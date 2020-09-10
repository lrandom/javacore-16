/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author Lrandom
 */
public class Human {
    String hairColor;
    String eyeColor;
    float height;
    String name;
    
    Human(String name, String hairColor,
         String eyeColor, float height){
     //new Human("Đen", "Đen", 1,7); 
       this.hairColor = hairColor;
       this.eyeColor = eyeColor;
       this.height = height;
       this.name = name;
    }
    
    public String getEyeColor(){
        return this.eyeColor;
    }
    
    public String getHairColor(){
        return this.hairColor;
    }
    
    public float getHeight(){
        return this.height;
    }
    
    
    void run(){
        //
        System.out.println(this.name+ " is running");
    }
    
    void sleep(){
        //
        System.out.println("I am sleeping");
    }
    
    void eat(){
        //
        System.out.println("I am eating");
    }
}
