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
public class Main {
   void click(ClickListener clickListener){
      //clickListener.onClick();
       System.out.println("hihi");
       System.out.println("haha");
   }
   
    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.click(new ClickListener() {
            @Override
            public void onClick() {
               System.out.print("hihi");
               System.out.print("Haha");
            }
        });
    }
}
