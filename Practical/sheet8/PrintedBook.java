/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet8q2;

/**
 *
 * @author ..
 */
public class PrintedBook extends LibraryItem{
    
    private String author;
    private int numberOfPages;

    public PrintedBook(int id, String title, int year,
                       String author, int pages) {
        super(id, title, year);
        this.author = author;
        this.numberOfPages = pages;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 7;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + numberOfPages);
    }

    @Override
    public String toString() {
        return super.toString() + " " + author + " " + numberOfPages;
    }
}

    

