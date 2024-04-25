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
public class Q5a_LAB1 {

    public void reMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
//        System.out.print("enter a number you wanna remove: ");
//        int numberRemove = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("enter number: ");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.print("enter a number you wanna remove: ");
        int numberRemove = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == numberRemove) {
                flag = true;
                numbers.remove(i);
                break;
            }
        }
        System.out.println(flag);
        System.out.println(numbers);
    }
}
