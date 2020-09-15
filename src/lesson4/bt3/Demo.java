/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.bt3;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Demo {
     public static void main(String[] args) {
         Employee[] employees = new Employee[3];
         int index = 0;
         int choice = 0;
         Scanner sc = new Scanner(System.in);
         
         do {            
          
             System.out.println("Vui long chon");
             System.out.println("1. Them moi nv");
             System.out.println("2. Tim kiem nv co do tuoi lon hon 24");
             System.out.println("3. Sap xep nv theo luong tang dan");
             System.out.println("4. Sap xep nv theo luong giam dan");
             System.out.println("5. Thoat ctrinh");
             choice = sc.nextInt();
             switch(choice){
                case 1:
                    System.out.println("Vui long dien");
                    System.out.println("Id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ho ten");
                    String fullname = sc.nextLine();
                    System.out.println("Tuoi");
                    int age = sc.nextInt();
                    System.out.println("Luong");
                    float salary = sc.nextFloat();
                    Employee employee = 
                            new Employee(id, fullname, age, salary);
                    employees[index] = employee;
                    index++;
                    break;
                    
                case 2:
                    for (int i = 0; i < employees.length; i++) {
                        Employee emp = employees[i];
                        if(emp!=null){
                           if(emp.getAge()>24){
                               System.out.println("Nhan vien voi id la "+emp.getId());
                               System.out.println("Ho ten "+emp.getHoten());
                               System.out.println("Luong "+emp.getLuong());
                               System.out.println("age "+emp.getAge());
                           }
                        }
                    }
                    break;
                    
                case 3:
                    for (int i = 0; i < employees.length-1; i++) {
                        for (int j = i+1; j < employees.length; j++) {
                            Employee emp1 = employees[i];
                            Employee emp2 = employees[j];
                            Employee emp3;
                            if(emp1.getLuong() > emp2.getLuong()){
                               emp3 = emp1;
                               employees[i] = employees[j];
                               employees[j] = emp3;
                            }
                        }
                    }
                    
                    for (int i = 0; i < employees.length; i++) {
                        if(employees[i]!=null){
                          System.out.println(employees[i].getId());
                          System.out.println(employees[i].getHoten());
                        }
                    }
                    break;
                    
                case 4:
                    break;
             }
             
         } while (choice !=5);
    }
}
