/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.assignment6;

/**
 *
 * @author msi
 */
public class assignment6q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount account = new BankAccount("12345", 1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
    
}
