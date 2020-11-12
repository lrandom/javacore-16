/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lrandom
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection connection = DriverManager.getConnection(url,"root","koodinh"); 
            //Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //stm.execute("INSERT INTO category(name) VALUES('NIIT')", args);
//            
//            ResultSet rs = stm.executeQuery("SELECT * FROM category");
//            
//            rs.next();
//            rs.relative(4);
//            while(rs.next()){
//               String name =  rs.getString("name");
//               System.out.println(name);
//            }
            
            //int affectRow = stm.executeUpdate("UPDATE category SET name ='TEST'");
            //System.out.println(affectRow);
            String sql = "INSERT INTO category(name) VALUES(?)";
            PreparedStatement prt= connection.prepareStatement(sql);
            prt.setString(1, "ICT");
            prt.executeUpdate();
            
            sql = "SELECT * FROM category WHERE id > ?";
            PreparedStatement prt2 = connection.prepareStatement(sql);
            prt2.setInt(1, 3);
            ResultSet rs= prt2.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
