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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros y la moneda a convertir: a_ si quiere dolares, b_si quiere yenes, c_ si quiere libras");
        double euros;
        euros = leer.nextDouble();
        String moneda;     
        moneda = leer.next();
        
        if ("a".equals(moneda)){
            System.out.println( cambiomonedadolar(euros) + " Dolares");
        }else if ("b".equals(moneda)){
            System.out.println(cambiomonedayen(euros)+" yenes");
            
        }else{
            System.out.println(cambiomonedalibra(euros)+" libras");
        }
        
        
    }
    
    public static double cambiomonedalibra(double euros){
        double libras = 0.86;
        
        
        double resultado = euros*libras;
        
        
        
    return resultado;
    }
    
    public static double cambiomonedayen(double euros){
        double yenes = 129.852;
        
        
        double resultado = euros*yenes;
        
        
        
    return resultado;
    }
    
    public static double cambiomonedadolar(double euros){
        double dolar = 1.28611;
        
        
        double resultado = euros*dolar;
        
        
        
    return resultado;
    }
    
}
