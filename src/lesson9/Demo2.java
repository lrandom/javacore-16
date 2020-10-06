/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Lrandom
 */
public class Demo2 {
//    public void display(String name){
//        System.out.println(name);
//    }
//    
//    public void display(Integer name){
//        System.out.println(name);
//    }

    public <T> void display(T name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        /*Demo2 demo2 = new Demo2();
        demo2.display("HI");
        demo2.display(1);*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Luan");
        names.add("Nam");
        names.add("Nguyen");

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        HashMap<String, String> infos = new HashMap<>();
        infos.put("Luan", "Quang Ninh");
        infos.put("Tung", "Hai Phong");

        infos.get("Luan");//Quang Ninh

        for (Map.Entry<String, String> entry : infos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

        HashSet<String> provinces = new HashSet<>();
        provinces.add("Ha Noi");
        provinces.add("Ha Noi");
        for (Iterator<String> iterator = provinces.iterator(); 
                iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
