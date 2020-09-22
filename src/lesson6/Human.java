/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author Lrandom
 */
public class Human implements IHuman{

    @Override
    public void run() {
        System.out.println(this.EYECOLOR);
        System.out.println(this.HAIRCOLOR);
        System.out.println(IHuman.HAIRCOLOR);
        System.out.println(IHuman.EYECOLOR);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sleep() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sleep 8 hours");
    }
    
    public void studying(){
        
    }
    
    public int studying(String subject){
        return 1;
    }
    
    public void studying(int subjectCounter){
    
    }
    
    public void studying(int subjectCounter, String subject){
    
    }
    
    public int studying(float subject){
       return 1;
    }
    
    public static void main(String[] args) {
        Human human = new Human();
        String hairColor = human.HAIRCOLOR;
        human.run();
    }
    
}
