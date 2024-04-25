/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Q2_LAB1 {
    private int a;
    private int b;
    private int c;
    
    public Q2_LAB1(){
        
    }
    public Q2_LAB1(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
     
    }
    public int minimumNumber(){
        int min = 0;
        min=a;
        if (min>b)
            min=b;
        if (min>c)
            min=c;
       
            
    
    return min;
}
}