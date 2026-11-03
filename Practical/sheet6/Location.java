/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6;

/**
 *
 * @author Omar Mourad
 */
 class Location {
    
    private double maxValue;
    private int column;

   
    public double getMaxValue() {
        return maxValue;
    }

    public int getColumn() {
        return column;
    }

   
    public void locateLargest(double[] values) {

        maxValue = values[0];
        column = 0;

        for (int i = 1; i < values.length; i++) {

            if (values[i] > maxValue) {
                maxValue = values[i];
                column = i;
            }
        }
    }

}
    

