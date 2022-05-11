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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;

        System.out.println("Ingrese un numero");
        numero = leer.nextDouble();
        double numerDoble = numero*2;
        double numerTripl = numero*3;
        System.out.println(numerDoble);
        System.out.println(numerTripl);
        double raiz = Math.sqrt(numero);
        System.out.print(raiz);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
