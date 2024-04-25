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
public class Q6c_LAB1 {

    public void concatenateString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the fisrt string: ");
        String input1 = sc.nextLine();
        System.out.print("enter the second string: ");
        String input2 = sc.nextLine();
        String concatenated = input1.concat(input2);

        System.out.println(concatenated);
        // Scanner.close();
    }
}
