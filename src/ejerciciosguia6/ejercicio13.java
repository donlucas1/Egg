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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero, i, j;
        System.out.println("Ingrese tamaño de lados de la figura");
        numero = leer.nextInt();
        
        for (int k = 1; k <= numero; k++ ) {
            for (int l = 1; l <= numero; l++) {
                if ((k<numero) && (k>1) && (l<numero) && (l>1)) {
                    System.out.print("  ");
          
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
