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
  public class Rectangle {
    private double width = 1;
    private double length = 1;
   
    public Rectangle() {
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
    