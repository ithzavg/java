/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int suma = 0;
        int contador =0;
        Scanner sc =  new Scanner(System.in);
        do { 
            
            System.out.println("Ingresa un numero");
            int numero = sc.nextInt();
            suma+=numero;
            contador++;
            
            
        } while(suma <= 2000);
        
        System.out.println("Tu suma es: " + suma);
        System.out.println("Ingresaste " + contador + "numeros");
    }
    
}
