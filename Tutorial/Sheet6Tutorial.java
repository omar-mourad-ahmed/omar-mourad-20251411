/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheet6.tutorial;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sheet6Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    Scanner input = new Scanner ( System.in);    
        
    cashregister regester = new cashregister();
        
        System.out.print(" item l :");   
        
        double price1 = input.nextDouble();
        
        regester.additem(price1);
        
        
        System.out.print(" item 2 :");   
        
        double price2 = input.nextDouble();
        
        regester.additem(price2);
        
        
        System.out.println("count is : " +regester.getitemcount());
        
        System.out.printf(" total is : "+regester.gettotalprice() );
        
        regester.clear();
        
         System.out.printf(" after clear  "+regester.gettotalprice()+" "+regester.getitemcount() );
        
    }
    
}
