/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet8q2;

/**
 *
 * @author ..
 */
public class Sheet8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        PrintedBook b = new PrintedBook(
            1, "Java", 2022, "Ahmed", 300
        );

        DigitalResource d = new DigitalResource(2, "OOP", 2023, "PDF", 5.5);
            
      

        b.displayInfo();
        d.displayInfo();

        System.out.println(b.calculateLateFee(5));
        System.out.println(d.calculateLateFee(5));

        System.out.println(b.calculateLateFee(5, 5));
        System.out.println(d.calculateLateFee(5, 5));

        System.out.println(b);
        System.out.println(d);

        LibraryItem item = new PrintedBook(
            3, "Python", 2024, "Ali", 200
        );

        System.out.println(item.calculateLateFee(5));
    }
}

