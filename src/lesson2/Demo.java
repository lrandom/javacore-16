/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author Lrandom
 */
public class Demo {
    public static void main(String[] args) {
        /*int age = 18;
        if(age>=18){
            System.out.println("Bạn đủ tuổi kết hôn");
        }else{
            System.out.println("Bạn chưa đủ tuổi kết hôn");
        }
        
        
        String thoitiet = "troi_nang";
        if(thoitiet=="troi_nang"){
            System.out.println("Mang quan ao ra phoi");
        }else if(thoitiet=="troi_mua"){
            System.out.println("Mang quan ao vao nha");
        }else if(thoitiet=="troi_ram"){
            System.out.println("Đi chơi");
        }
        
        int number = 50;
        if(number > 5){
            if(number ==50){
                System.out.println("Matched");
            }
        }
        
        switch(thoitiet){
            case "troi_nang":
                System.out.println("Mang quan ao ra phoi");
                break;
                
            case "troi_mua":
                System.out.println("Mang quan ao vao nha");
                break;
                
            case "troi_ram":
                System.out.println("Đi chơi");
                break;
                
            default:
                System.out.println("Khong biet gio thoi tiet tn");
                break;
        }*/
        
        for (int i = 0; i < 10; i++) {
            if(i==5){
               continue;//chuyen toi lan lap tiep theo
            }
            System.out.println(i);
        }//012346789
        
        
        
        System.exit(0);
        
        for(int i=10; i>0;i--){
            System.out.println(i);
        }
        
        //i++
        //++i
        
        int a = 0;
        System.out.println(a++);//0
        System.out.println(a);
        
        int b = 0;
        System.out.println(++b);//1
        
        int counter = 0;
        do{
            //lệnh 
            System.out.println(counter);
            counter++;
        }while(counter<10);
                
        counter = 0;
        while(counter<10){
           //lệnh
            System.out.println(counter);
            counter++;
        }
        
        String[] names = new String[2];
        names[0]="Luan";
        names[1]="Nam";
        
        for (String name : names) {
            System.out.println(name);
        }
        
        int[] numbers = new int[]{
           1,2,3,4,5
        };
        for (int nb : numbers) {
            System.out.println(nb);
        }
        
        
    }
}
