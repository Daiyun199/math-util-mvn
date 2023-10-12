/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dhp.mathuntil.main;

import com.giaolang.mathuntil.core.MathUtinity;


/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TEST CASE 1
        int n = 0;
        long expected = 1;// muon la ham n! =0! phai tra ve 
        long actual = MathUtinity.getFactorial(n);///// y noi rang ham chay ra may 
        
        // so sanh giua expected vs actual 
        System.out.println(n+"! -> expected: "+expected +" | actual = "+actual);
        
        //TEST CASE 2
        n=1;
        expected = 1;
        actual = MathUtinity.getFactorial(n);
         System.out.println(n+"! -> expected: "+expected +" | actual = "+actual);
         
        n=5;
        expected = 120;
        actual = MathUtinity.getFactorial(n);
        System.out.println(n+"! -> expected: "+120 +" | actual = "+MathUtinity.getFactorial(5));
        
     
    }
    
}
// TEST CASE 2 : VERIFY getFactorial with n = 1
//STEPS PROCEDURED : 
// GIVE N = 1
// call/invoke getFactorial(n=1)

//EXPECTED RESULT 
//     the method must return 1 in case of 0!
// STATUS:PASSED/FAILED

// TEST CASE 3 : VERIFY getFactorial with n = 5
//STEPS PROCEDURED : 
// GIVE N = 5
// call/invoke getFactorial(n=5)

//EXPECTED RESULT 
//     the method must return 120 in case of 5!
// STATUS:PASSED/FAILED


//MINH LA DEF, MINH PHAI TEST CODE CUA MINH DA 
// MUON TEST CODE (DE[) BHAY TEST APP (QC/TESTCASE) THI CAN PHAI CHUAN BIJ 
//TEST CASE - TINH HUONG KIEM THU, TUONG HOP KIEM THU - CACH TA
//                       KIEM THU TRONG 1 NGU CANH NAO DO - BAN VE BO DATA
// 1 TEST CASE CO CAU TRUC NHU SAU
// ID | Desciption } steps / Proceduces / Expected Result/ Status (Passed/Failered)
// DEV E MUON KIEM THU COI HAM CHINH E VIET getFactorial() dung hay sai
// thi e phia thiet ke cac test case

// Test Case #1 : Verify getFactorial (with n = 1)
// Steps-Procedured : cac buoc run app de test case
// 1 GIVEN  n = 0
// 2/ Execute/Call/Invoke function getFactorial()

// Expected Result : the function must return 1(standing for 0!=1)
// Status : PASSED : or FAILED, ai biet , cho run da 

// RUN HAM , RUN APP , DUA TEST CASE VAO, DC GOI LA TEST RUN
