/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sh6q2;

/**
 *
 * @author Student
 */
public class Sh6q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  

        Rectangle r1 = new Rectangle();
        System.out.println("Results of the first Object");
        System.out.println("The length = 1.0");
        System.out.println("The width = 1.0");
        System.out.println("Area = " + r1.getArea()
                + " Perimeter = " + r1.getPerimeter());
        
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("\nResults of the Second Object");
        System.out.println("The length = 5.0");
        System.out.println("The width = 10.0");
        System.out.println("Area = " + r2.getArea()
                + " Perimeter = " + r2.getPerimeter());
    }
}
   
    

