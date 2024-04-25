/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Q5b_LAB1 {
    public void insertAtIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("enter number of an array: ");
        for (int i = 0; i<n; i++){
            numbers.add(sc.nextInt());
        }
        System.out.print("position you wanna change: ");
        int pos = sc.nextInt();
        System.out.print("a number you wanna change: ");
        int num  = sc.nextInt();
        numbers.set(pos, num);
        System.out.print(numbers);
    } 

}
