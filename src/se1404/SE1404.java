/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import util.MyToys;

/**
 *
 * @author ADMIN
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToys.cF(5)); //hy vọng 120
        System.out.println("6! = " + MyToys.cF(6)); //expected 720
//        System.out.println("0! = " + MyToys.cF(0)); //expected 1
//        System.out.println("-5! = " + MyToys.cF(-5)); //toang
                //JVM sẽ giết app, ném ra ngoại lệ của chính mình
                //chửi user đưa tham số cà chớn
    }
    
}


//thế thì: việc làm = tay clean % build kết hợp với Ant chạy bộ Test đảm bảo xanh -> jar
//đỏ không ra gì cả, chửi message báo lỗi, việc này ổn nhưng thủ công quá
//có cách tự động vi diệu
//Dev push code lên trên Git server
//Có ai đó sẽ theo dõi Git, nếu có thay đội do ai đó push thì
//ai đó, sẽ kéo code về máy (xài git) local nào đó
//ai đó sẽ gọi Ant lên, (local)
//ai đó chạy Ant, nếu xanh -> ra file .jar
//                    đỏ, thì ai đó quất email chửi thằng dev vừa push code lên
//                    copy nguyên message đỏ lỗi đó chửi qua email
//ai đó cứ lắng nghe Git để làm điều này
//Dev sửa code, đẩy lên đỏ, bị chửi đẩy lên đỏ bị chửi đẩy lên xanh kết thúc
//liên tục liên tục tích hợp và kiểm tra code, ổn thôi, không ổn chửi
//Continuos Integration CI
//ai đó chính là App Jenkins, TeamCity,... (CI app, CI server, CI tool)