/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dhp.mathuntil.core.test;

import com.giaolang.mathuntil.core.MathUtinity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
public class MathUtilityTest {
    // test case #1 - verify GetFactorial(with n=0)
    //Steps/Procedures
    //    1. Given n=0
    //    2. Call/invoke getFactorial (n=0)
    //Expected Results
    //       The method must return 1 at the result of 0!=1
    // Status : PASSED | FAILED chowf đến lúc runtime mới 
   @Test
   public void FactorialGivenRightArgument0ReturnsOk(){
       assertEquals(1, MathUtinity.getFactorial(0));
   }
    @Test
   public void FactorialGivenRightArgument1ReturnsOk(){
       assertEquals(1, MathUtinity.getFactorial(1));
   }
    
    @Test
   public void FactorialGivenRightArgument5ReturnsOk(){
       assertEquals(120, MathUtinity.getFactorial(5));
   }
    // 3 TEST CASE TRÊN KO ĐẸP , BỐC MÙI, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
   // TRONG NGHỀ KIỂM THỬ CÓ 1 KĨ THUẬT ĐÓ LÀ TÁCH HÀM DATA KIỂM THỬ RA 
   // 1 CHỖ , CHO DỄ NHÌN, DỄ QUẢN LÍ ĐC DATA THIỂU ĐÓ HAY KO 
   
   // SAU ĐÓ TA ĐƯA BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
   // QUA CÁC THAM SỐ (PARAMETER)
   // TỨC LÀ ASSERTEQUALS(EXPECTED, ACTUAL) LÀ 2 THAM SỐ
   // ỨNG VỚI BỘ DATA ĐC TÁCH RA
                  // 120     5!
                  // 720     6!
                  //  24     4!
                  // 
   
   //   MẢNG [4][2] (0,1)(1,1)(2,2)()
   // CODE NHÌN GỌN, PHÁT HIỆN ĐC THIẾU ĐỦ TEST DATA, TEST CASE
   // KỸ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LỆNH SO SÁNH -> ĐC GỌI 
   // LÀ DDT -  DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG RẼ
    
}
