/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.bt3;

/**
 *
 * @author Lrandom
 */
public class Employee {
    private int id;
    private String hoten;
    private int age;
    private float luong;

    public Employee(int id, String hoten, int age, float luong) {
        this.id = id;
        this.hoten = hoten;
        this.age = age;
        this.luong = luong;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
}
