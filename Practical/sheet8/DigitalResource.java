/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet8q2;

/**
 *
 * @author ..
 */
public class DigitalResource extends LibraryItem {
    
    private String fileFormat;
    private double fileSize;

    public DigitalResource(int id, String title, int year,
                           String format, double size) {
        super(id, title, year);
        fileFormat = format;
        fileSize = size;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 3;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + fileFormat);
        System.out.println("Size: " + fileSize);
    }

    @Override
    public String toString() {
        return super.toString() + " " + fileFormat + " " + fileSize;
    }
}

    

