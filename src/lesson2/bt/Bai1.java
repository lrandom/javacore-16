/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2.bt;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */

/*
1, Viết một chương trình nhập một số từ bàn phím, kiểm tra xem số đấy có phải số nguyên tố hay không
2, Viết một chương trình nhập một số từ bàn phím, kiểm tra số đấy có phải số hoàn hảo
3, Viết một chương trình nhập vào 3 số a,b,c và giải phương trình bậc 2 ax2 + bx + c =0;
4, Nhập vào ba số a,b,c. Tìm số lớn nhất và nhỏ nhất và in ra màn hình 
5, Nhập vào bốn số a,b,c,d. Sắp xếp tăng dần bằng thuật toán sủi bọt.
*/
public class Bai1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap vao mot so");
        number = scanner.nextInt();
        //6
        boolean isNT = true;
        for(int i = 2; i<number; i++){
            if(number%i==0){
                isNT = false;
                break;
            }
        }; 
        if(isNT == true){
            System.out.println("Đây là số NT");
        }else{
            System.out.println("Đây 0 phai số NT");
        }
    }
}
