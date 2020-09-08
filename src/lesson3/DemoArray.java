/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.StringTokenizer;
/*
1.	Nhập chuỗi s1, s2 nối chuỗi s2 vào sau chuỗi s1;
2.	Cho hai chuỗi s1, s2. Hãy kiểm tra xem chuỗi s2 cho tồn tại trong chuỗi s1 hay không. Các chuỗi nhập từ bàn phím 
3.	Cho phép người dùng nhập vào một mảng các số nguyên, hãy làm các công việc sau
a)	 Tính tổng của số các phần tử trong mảng 
b)	 Tìm số nguyên tố trong mảng và in ra kết quả
c)	 Đảo ngược mảng 
d)	 Sắp xếp mảng tăng dần và giảm dần (sử dụng thuật toán tuỳ ý)
e)	 Tìm số lớn nhất và nhỏ nhất trong mảng

4.	Nhập vào hai mảng có cùng chiều dài, tính tổng, tích, thương của từng phần tử trong mảng và in ra màn hình 
     
5.	Nhập hai chuỗi s1 và s2, s3, tìm trong chuỗi s1 nếu có tồn tại chuỗi s2 thì thay thế bằng chuỗi s3, s2 có độ dài bằng s3

6.	Nhập vào một chuỗi, chuyển đổi chuỗi đó từ viết hoa thành viết thường nếu có, ko sử dụng hàm sẵn có 
*/


/**
 *
 * @author Lrandom
 */
public class DemoArray {
    public static void main(String[] args) {
        int[] mang = new int[10];
        mang[0]=1;
        mang[1]=2;
        mang[2]=3;
        mang[3]=4;
        mang[4]=5;
        mang[5]=6;
        mang[7]=8;
        mang[9]=9;
         
        int[] mang2 ={
            1,2,3,4,5
        };
        
        int[] mang3 = new int[]{
            1,2,3,4
        };
        
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
        
        for(int i :mang){
            System.out.println(i);
        }
        
        int[][] manghaichieu = new int[3][2];
        manghaichieu[0][0]=1;
        manghaichieu[0][1]=2;
        manghaichieu[1][0]=2;
        manghaichieu[1][1]=3;
        manghaichieu[2][0]=3;
        manghaichieu[2][1]=4;
        
        /*
        1 2
        2 3
        3 4
        */
        /*for (int i = 0; i < manghaichieu.length; i++) {
            for(int j=0;j<manghaichieu[i].length;j++){
                System.out.print(manghaichieu[i][j]);
            }
            System.out.println("");
        }*/
        
        
        String chuoi1 = "hallo World 787s";
        String chuoi2 = "hello World";
        
        System.out.println(chuoi1.compareTo(chuoi2));
        
        StringBuilder builder = 
                new StringBuilder("My name is Luan");
        builder.delete(11, 15);//xoa ky tu Luan
        builder.insert(11, "Nam"); //them phan tu
        builder.replace(0, 2, "His");//thay the phan tu
        System.out.println(builder.toString());
        
        StringTokenizer st = new StringTokenizer("A,B,C,D",",",false);
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println(nextElement.toString());
        }
    }
}
