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
    
    
}
