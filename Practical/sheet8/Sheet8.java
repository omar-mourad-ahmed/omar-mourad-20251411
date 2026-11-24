/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet8;

/**
 *
 * @author ..
 */
public class Sheet8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Car c = new Car("Toyota", "Corolla", 2022, 4);
        Motorcycle m = new Motorcycle("Honda", "CBR", 2023, 600);

        c.displayDetails();
        m.displayDetails();

        System.out.println(c.calculateRentalPrice(3));
        System.out.println(m.calculateRentalPrice(3));

        System.out.println(c.calculateRentalPrice(3, 50));
        System.out.println(m.calculateRentalPrice(3, 20));

        System.out.println(c);
        System.out.println(m);
    }
}
    
    

