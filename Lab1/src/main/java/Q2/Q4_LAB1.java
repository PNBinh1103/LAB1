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
public class Q4_LAB1 {
//    private int n;
//    public Q4_LAB1(int n){
//        this.n=n;
//}
    public int SumOfEven (){
   
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array: ");
        int n = sc.nextInt();
        int numbers[]= new int[n];
        for (int i=0; i<n;i++){
            System.out.print("enter number: ");
            numbers[i]=sc.nextInt();
        }
        for (int num:numbers)
        { 
            if(num%2==0)
            {
            sum+=num;
                    
            }
        } System.out.print("sum of even numbers of an Array:");
         return sum;
        
        
    }

    }