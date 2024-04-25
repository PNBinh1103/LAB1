/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab1;

import java.util.*;

/**
 *
 * @author admin
 */
public class Q6b_LAB1 {

    public void countNumberOfWords() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = 0;
        String[] words = input.split("\\s+");
        count = words.length;
        System.out.println("Number of words in the string: " + count);

        sc.close();
    }

}
