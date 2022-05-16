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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz1 [][]= new int [2][2]; 
       int matriz2 [][]= new int [2][2];
       matriz1[0][0]=2;
       matriz1[0][1]=2;
       matriz1[1][0]=2;       
       matriz1[1][1]=2;
       matriz2[0][0]=-2;
       matriz2[0][1]=-2;
       matriz2[1][0]=-2;       
       matriz2[1][1]=-2;       
       
       
       
       int aux = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j]+matriz2[i][j]==0);
                aux++;
                
            }
        if (aux==4){
            System.out.println("la matriz es anti simetrica");
        }    
        }
        
        
        
        
    }
    
}
