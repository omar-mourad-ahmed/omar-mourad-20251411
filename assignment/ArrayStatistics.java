/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment6;

/**
 *
 * @author msi
 */
public class ArrayStatistics {
    private float maxValue;
    private float minValue;

    public float getMaxValue() { return maxValue; }

    public float getMinValue() { return minValue; }

    public void findMaxMin(float[] values) {
        maxValue = values[0];
        minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) maxValue = values[i];
            if (values[i] < minValue) minValue = values[i];
        }
    }
}
