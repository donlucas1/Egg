/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia6;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author lucas
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra,primerletra,ultimaletra;
        int largo;
        int  incorrecto = 0;
        int correcto = 0;
        
        do {
            System.out.println("Ingrese una palabra");
            palabra = leer.nextLine();
            largo = palabra.length();
            primerletra=palabra.substring(0,1);
            System.out.println(primerletra);
            ultimaletra=palabra.substring(4);
            System.out.println(ultimaletra);
            if (largo==5){
                if("x".equals(primerletra)) 
                        if("o".equals(ultimaletra)){
                        System.out.println("Correcto");
                        correcto=correcto+1;
                        }else{
                          System.out.println("Incorrecto");  
                          incorrecto=incorrecto+1;
                          
                        } 
                else{
                    System.out.println("Incorrecto");
                    incorrecto=incorrecto+1;
                }
            }else{
                System.out.println("Incorrecto");
                incorrecto=incorrecto+1;
            
                
            }

        } while (palabra.equalsIgnoreCase("&&&&&") == false) ;
        
        System.out.println("correctos: " + correcto + " incorrecto " + incorrecto );
        
    
    }

}
