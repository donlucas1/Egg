/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia6;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int centigrados;
        System.out.println("Ingrese grados centigrados");
        centigrados = leer.nextInt();
        int Fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("grados en Fahrenheit: "+ Fahrenheit);
        
        
    }
    
}
