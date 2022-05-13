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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int limite;
        int num1 = 0;
        System.out.println("Ingrese limite numerico");
        limite = leer.nextInt();
       
        while (num1<limite){
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            num1 = numero + num1;
        }
                
        
        
        System.out.println("el numero total fue: " + num1);
        
        
    }
    
}
