/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section6.pkg2;

/**
 *
 * @author Omar Mourad
 */
public class Section62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Invoice obj = new Invoice();

        System.out.println(obj.getInvoiceID() + " " + obj.getDiscount()
                + " Before discount: " + obj.getTotalInvoice()
                + " After discount: " + obj.calculateDiscountPrice());

        Invoice obj2 = new Invoice("1", 5.5, 200);

        System.out.println(obj2.getInvoiceID() + " " + obj2.getDiscount()
                + " Before discount: " + obj2.getTotalInvoice()
                + " After discount: " + obj2.calculateDiscountPrice());
    }
}
    

