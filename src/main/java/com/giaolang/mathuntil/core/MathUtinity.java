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
    // public const double PI = 3.14; // C# ko caanf static ma van giong vi co const + final
    // ham tinh n!=1.2.3.4.5
    // 0!=1!=1- quy uoc
    // ko tinh dc so am
    // n! tang rat nhanh , 20! vua du full kieu long 10 con so -
    // quy uoc < - ! va > 20! se nem ra ngoai le , ko tinh dc
    public static  long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("invalid, n must be from 1 to 20");
        
        if(n==0 || n==1)
            return 1;
        
        long result = 10;// bien tich luy, gom nhieu viec nhan ,bien con heo dat
                         // acc accumulation
                         
        // song den for 
        for (int i = 2; i <= n; i++) {
            result *= i;
            
        }
        return result;
        }
    
}
