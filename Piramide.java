/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class Piramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de su piramide");
        int filas = sc.nextInt();

       

        for (int i = 1; i <= filas; i++) {
            // i = 1;
            // i <= filas -> 1<=5...si
            
            
            
            // i = 2
            // i <= filas -> 2<=5...si
            
            // i = 3
            // i <= filas -> 3<=5...si
            
            for (int j = 1; j <= i; j++) {
                
                // j = 1;
                // j <= i -> 1 <= 1 ... si
                // imprime 1 asterisco
                // j++ -> j = 2
                
                // j = 1;
                // j <= i -> 1 <= 2 ... si
                // imprime 1 asterisco
                // j++ -> j = 2
                
                // j = 1;
                // j <= i -> 1 <= 3 ... si
                // imprime 1 asterisco
                // j++ -> j = 2
                
                System.out.print("*");
                
                // segunda vuelta
                // 2 <= 1 ... no -> sale
                
                
                //segunda vuelta
                // 2 <= 2 ... si -> imprime otro asterisco *
                // j++ -> j = 3;
                //tercera vuelta 
                // 3 <= 2 ... no -> sale
            }
            // imprime un salto de linea
            System.out.println();
        }

    }

}
