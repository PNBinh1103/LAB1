/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab1;

import static java.lang.reflect.Array.set;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
import java.util.*;

/**
 *
 * @author admin
 */
public class Q5d_LAB1 {

    public void findTheDuplicateValues() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> arr = new HashSet<>();
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter a number: ");
            arr.add(sc.nextInt());

        }
        List<Integer> listWithoutDuplicateElements = new ArrayList<>();
        for (Integer element : arr) {
            if (!listWithoutDuplicateElements.contains(element)) {
                listWithoutDuplicateElements.add(element);
            }

        }
        System.out.print(listWithoutDuplicateElements);
    }
}
