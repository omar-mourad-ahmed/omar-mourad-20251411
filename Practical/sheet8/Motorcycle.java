/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet8;

/**
 *
 * @author ..
 */
public class Motorcycle extends Vehicle {
  
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine: " + engineCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + " Engine: " + engineCapacity;
    }
}

    

