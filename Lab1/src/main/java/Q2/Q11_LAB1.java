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
public class Q11_LAB1 {
    private int number;

   
    public Q11_LAB1(){
        
}
    public Q11_LAB1(int number){
        this.number=number;
        
    }
    public void InputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        number = sc.nextInt();
            
    
    }
}
