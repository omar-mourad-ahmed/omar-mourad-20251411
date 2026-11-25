/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.assignment6;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class assignment6q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] values = new float[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            values[i] = input.nextFloat();
        }

        ArrayStatistics stats = new ArrayStatistics();
        stats.findMaxMin(values);

        System.out.println("Maximum value: " + stats.getMaxValue());
        System.out.println("Minimum value: " + stats.getMinValue());
        input.close();
    }
    
}
