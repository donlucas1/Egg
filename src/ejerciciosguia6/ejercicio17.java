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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] vector = new int[5];
       vector[0]=1;
       vector[1]=10;
       vector[2]=100;
       vector[3]=1000;
       vector[4]=10000;
       Scanner leer = new Scanner(System.in);
       int num1;
       int numdeundigito = 0;
       int numdedosdigito = 0 ;
       int numdetresdigito = 0;
       int numdecuatrodigito = 0;          
       int numdecincodigito = 0;          
        for (int j = 0; j < vector.length; j++) {
            if (vector[j] <10){
              numdeundigito++; 
            }else if (vector[j] >=10 && vector[j]<100){
                numdedosdigito++;
                
            }else if(vector[j] >=100 && vector[j]<1000){
                numdetresdigito++;
                
            }else if (vector[j] >=1000 && vector[j]<10000){
                numdecuatrodigito++;
                
            }else if (vector[j] >=10000 && vector[j]<100000){
                numdecincodigito++;
            }
        }
        System.out.println("vectores" + numdeundigito + " " +  numdedosdigito + " " + numdetresdigito + " " + numdecuatrodigito + " " + numdecincodigito);    
    }
    
}
