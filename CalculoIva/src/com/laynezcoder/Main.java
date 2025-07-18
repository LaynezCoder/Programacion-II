/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

import java.util.Scanner;

/**
 *
 * @author Laynecito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static final double IVA = 12;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto");
        String name = scanner.next();
        
        System.out.println("Ingrese el precio unitario del producto " + name.toUpperCase());
        double price = Double.valueOf(scanner.next());
        
        System.out.println("Ingrese la cantidad a comprar del producto " + name.toUpperCase());
        double quantity = Double.valueOf(scanner.next());
        
        double total = (price * quantity);
        double tax = (total * (IVA/100));
        double priceWithTax = total + tax;
        
        System.out.println("El precio es " + priceWithTax);    
    }
    
}
