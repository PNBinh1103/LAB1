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
public class Q5c_LAB1 {

    public void duplicateValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of list: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("enter");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count > 0) {
                newList.add(arr.get(i));
            }

        }
        System.out.println(newList);
    }
}
