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
/*
1, Viết chương một chương trình sử dụng OOP trong đó có các lớp sau 
•	Tamgiac 
Vuong

Mỗi lớp hãy viết hai phương thức tính diện tích và tính chu vi, các tham số được truyền vào phương thức từ ngoài vào. Khởi tạo đối tượng và gọi các pt
Sau đó đổi các phương thức sang tĩnh và thử gọi lại

2, Hãy định nghĩa một lớp Ô tô với các thuộc tính sau 
   loaiXe
•	soBanh
•	thuongHieu 

Tạo constructor với các tham số trên 
Tạo phương thức để nhập vào các tham số trên 
Viết phương thức chạy in ra dòng thông báo “Tôi chạy với {soBanh}”. Khởi tạo đối tượng và gọi các phương thức trong main.

3, Hãy tạo một lớp NhanVien với các thuộc tính sau

•	Id
•	Ho ten
•	Tuoi
•	chucVu
•	Luong

Viết các phương thức nhập vào thuộc tính tương ứng 
Hãy tạo một mảng các nhân viên, viết ctrinh thực hiện yêu cầu sau 
Nhập vào nhân viên 
Tìm kiếm nv có tuổi lớn hơn 24 
Sắp xếp nv theo mức lương tăng dần, giảm dần 
*/

public class Demo {
    public static void main(String[] args) {
        Human luan = 
                new Human("Luan","Đen", "Nâu", (float)1.72);
        
        Human tung = new Human("Tung","Đen", "Đen", (float)1.9);
        
        System.out.println(luan.getEyeColor());
        luan.run();
        
        System.out.println(tung.getEyeColor());
        System.out.println(tung.eyeColor);
        tung.run();
          
        int numberScore = 10;
        changeNumber(numberScore);
        System.out.println(numberScore); //10
        
        changeObject(luan);
        System.out.println(luan);//Bach kim
        
        KhuonBanh banh = new KhuonBanh();
        System.out.println(banh.hinhdang);
        System.out.println(KhuonBanh.chatlieukhuon);
        
        
    }
    
    public static void changeNumber(int number){
        number+=10;
    }
    
    public static void changeObject(Human human){
        human.hairColor="Bach kim";
    }
    
}
