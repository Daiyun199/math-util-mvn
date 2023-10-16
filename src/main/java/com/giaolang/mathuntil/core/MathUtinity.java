/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathuntil.core;

/**
 *
 * @author asus
 */
public class MathUtinity {
    public static final double PI = 3.14;
     
     
     // KỸ THUẬT GỌI LÀ REGRESSION TESTING 
             //         KIỂM THỬ HỒI QUY0 TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST
     // Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa vì 
     // 
     // fix bug thì phải sửa code, sửa hàm
     // thêm hàm , thêm tính năng
     // tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
     // HÀM ĐANG NGON- MÀU XANH, NÊÚ TA SỬA HÀM VÌ LÝ DO GÌ ĐO
     // LIỆU RẰNG HÀM CÒN XANH HAY KO, THÌ PHẢI TEST LẠI
     // NẾU TEST = TAY , BẰNG LOG, THÌ CỰC KỲ TỐN THỜI GIAN, MẤT SỨC
     // TA CHỈ VIỆC RUN ;ẠI CÁI TEST SCRIPT NÀY
     // NẾU HÀM SỬA NGON, NÓ PHẢI RA MÀU XANH
     // NẾU HÀM SỬA KO NGON, NÓ RA MÀU ĐỎ
     // NHỚ TEST SCRIPT TA VERIFY LẠI1 HÀM RẤT NHANH-> KIỂM THỬ LẠI 
     // THỨ ĐÃ TỪNG KIỂM THỬ ĐỂ ĐẢM BẢO NÓ CÒN NGON SO VỚI TRC
     // KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY- REGRESSION TEST
     // NHỜ CI, HỒI QUY LIÊN TỤC 
     
     // BÀI NÀY MÌNH THỬ HỒI QUY = CÁCH SỬA LẠI HÀM THEO THUẬT TOÁN
     // ĐỆ QUY - RECURSION
     //5! = 1.2.3.4.5
    // 5! = 4!.5
    // 4! = 3!.4
    // N! = N.(N-1)!
    // ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN 
    
public static  long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("invalid, n must be from 1 to 20");
        
        if(n==0 || n==1)
            return 1;
        
      // Dùng đệ Quy 
           return n*getFactorial(n-1);
        }
}
    

    // public const double PI = 3.14; // C# ko caanf static ma van giong vi co const + final
    // ham tinh n!=1.2.3.4.5
    // 0!=1!=1- quy uoc
    // ko tinh dc so am
    // n! tang rat nhanh , 20! vua du full kieu long 10 con so -
    // quy uoc < - ! va > 20! se nem ra ngoai le , ko tinh dc
//    public static  long getFactorial(int n){
//        if(n<0 || n>20)
//            throw new IllegalArgumentException("invalid, n must be from 1 to 20");
//        
//        if(n==0 || n==1)
//            return 1;
//        
//        long result = 1;// bien tich luy, gom nhieu viec nhan ,bien con heo dat
//                         // acc accumulation
//                         
//        // song den for 
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//            
//        }
//        return result;
//        }
//    
//}
