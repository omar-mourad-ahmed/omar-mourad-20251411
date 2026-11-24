/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet8;

/**
 *
 * @author ..
 */
public class Car extends Vehicle{
   
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 100;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numberOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() + " Doors: " + numberOfDoors;
    }
}

    

