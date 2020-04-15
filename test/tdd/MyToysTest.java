/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF; //đây là kĩ thuật viết giống C
                                // ở dưới gọi hàm static mà không cần chấm

/**
 *
 * @author ADMIN
 */
public class MyToysTest {
    
    //chỗ này dùng để test các hàm ta viết, đảm bảo chất lượng
    //mỗi hàm ta test ta cần chuẩn bị sẵn data, giá trị kì vòng, và chạy thử hàm
    //xem kq xử lí, và so sánh xem có đúng kì vọng không
    //không đúng kì vọng: sai ở data mẫu hay sai ở code
    //ví dụ tui muốn kiểm tra coi 5! có trả về 120 hay không, khi chạy hàm -> 1 test case
    //1 tình huống test
    //login: case 1 -> đúng user/pass -> ok vào đúng trang
    //       case 2 -> đúng user sai pass -> chửi câu ắt hẳn bạn quên pass
    //
    
    //tình huống hàm cF() chạy đúng, bản chất mỗi case phải là một hàm, tôi gộp
    @Test //biến hàm bất kì đi kèm JUnit thành public static void main()
    public void testSuccessfulCases(){
        assertEquals(1, cF(0)); //hàm so sánh và in ra màu xanh khớp, đỏ nếu không khớp
                                //thay vì luận bằng mắt
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    //ngoại lệ thì sao, ngoài lệ không phải là 1 value để so sánh
    //nó là cái bất thường nào đó xảy ra, không ước lượng được chính xác nó là giá trị gì
    //do đó không thể so sánh với 1 cái khác, không xài assertX() được
    @Test (expected = IllegalArgumentException.class)
    public void testExceptionCases(){
        cF(-5);
        cF(-6);
    }
}

//Ant chỉ quan tâm code không sai cú pháp, không thiếu thư viện, bố ra .jar, .war, .ear, .apk
//lỗi logic nó không check được, cụ thể bài này đang đỏ nè

//hãy dạy cho Ant biết cách: code không sai cú pháp, không thiếu thư viện import, màu xanh
//của JUnit mới ra được .jar

//Ant không thông minh, chỉ biết làm theo những gì nó được chỉ để làm ở trong file build.xml
//và file build-impl.xml  - kịch bản để compile and build

//độ file này 1 chút, độ ở dòng 1005 NetBeans 8, 1204 NetBeans 11

//giống má khi đi làm dăn mình trong tờ giấy: 4h rửa nồi, đong gạo vo gạo... căn nước,
//cắm điện, ấn nút Cook
