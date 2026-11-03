/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section6;

import java.util.Scanner;

/**
 *
 * @author Omar Mourad
 */
public class Sheet6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns in the array: ");
        int n = input.nextInt();

        double[] values = new double[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextDouble();
        }

        Location obj = new Location();

        obj.locateLargest(values);

        System.out.println("The location of the largest element is "
                
                + obj.getMaxValue() +
                " at position (" 
                + obj.getColumn() + ")");
        
    }
    
}
