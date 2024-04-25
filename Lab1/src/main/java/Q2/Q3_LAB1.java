/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab1;

/**
 *
 * @author admin
 */
public class Q3_LAB1 {
    private int n;
    public Q3_LAB1(int n){
        this.n=n;
    }
    public void hailstone(){
      
        while (n>1){
            if (n%2==1){
                System.out.println(n+" is odd, so we take 3*"+n+"+1: "+ (n*3+1));
                n=n*3+1;
            }
            else
                System.out.println(n+" is even, so we take"+n+"/2:"+ n/2);
                 n=n/2;
            }
        
    
    
    }
}
    

                     

