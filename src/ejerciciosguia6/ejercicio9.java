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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Escriba una palabra");
        frase = leer.nextLine();
        char largo;
        char control = 'A';
        largo = frase.charAt(0);
        if (largo == control){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
         // TODO code application logic here
    }
}         

