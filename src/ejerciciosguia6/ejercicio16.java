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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] vector = new int[30];
       Scanner leer = new Scanner(System.in);
       int num1;
       int numRepetido = 0;
       
       for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (10*Math.random());
           System.out.print(vector[i]);
    }
        System.out.println("Ingrese un numero de 0 a 9 a buscar");
        num1 = leer.nextInt();
        for (int j = 0; j < vector.length; j++) {
            if (vector[j] == num1){
                System.out.println("Posición: " + j);
                numRepetido++; 
            }
        }
        System.out.println("La cantidad de veces que esta el numero es: " + numRepetido);
    }
}

