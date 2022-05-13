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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int num2;
        int opcion;
        int num1;
        boolean exit = true;
        String salir = "n";
        
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        while (exit) {
            
        
         System.out.println("MENU");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Elija opción:");
         opcion = leer.nextInt();
         
         switch(opcion){
             case 1:
                 System.out.print(num1+num2);
                 break; 
             case 2:
                 System.out.println(num1-num2);
                 break; 
             case 3:    
                 System.out.println(num1*num2);
                 break; 
             case 4:    
                 System.out.println(num1/num2);
                 break; 
             case 5:
                 System.out.println("Desea salir del programa");
                 salir = leer.next();
                 if ("s".equals(salir)){
                     exit=false;}
                     break;
             default:
                System.out.println("Las opciones son entre 1 y 5");
                     
                 
                       
                 
                         } 
                   
         }
         
         
         
         
        }
                
        
        
      
        
        
        
    }
    

