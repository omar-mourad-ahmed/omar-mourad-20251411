/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6.pkg2;

/**
 *
 * @author Omar Mourad
 */
public class Invoice {
    
    private String invoiceID;
    private double discount;
    private double totalInvoice;

  
    public Invoice(String invoiceID, double discount, double totalInvoice) {
        this.invoiceID = invoiceID;
        this.discount = discount;
        this.totalInvoice = totalInvoice;
    }

    public Invoice() {
        invoiceID = "1";
        discount = 2.5;
        totalInvoice = 100;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public double calculateDiscountPrice() {
        return totalInvoice - (totalInvoice * discount / 100);
    }
    
}
