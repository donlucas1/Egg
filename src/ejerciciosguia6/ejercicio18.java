/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia6;

/**
 *
 * @author lucas
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int matriz [][] = new int [4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
            matriz[i][j] = (int) (10*Math.random());    
            }
        }
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
            matriz[i][j] = (int) (10*Math.random());    
                System.out.print(" " + matriz [i][j]);
            }
            System.out.println("");
        } 
        int aux;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
            aux=matriz[i][j];    
            matriz[i][j]=matriz[j][i];
            matriz[j][i]=aux*-1;
            }
    
    }
        System.out.println("matriz transpuesta");
    for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                 System.out.print(" " + matriz [j][i]);
            }
            System.out.println(""); 
            }
}
}