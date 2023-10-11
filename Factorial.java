/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forloop;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class Factorial {
    public static void main(String[] args) {
        // 5! -> 5x4x3x2x1 = ____
        // 7! -> 7x6x5x4x3x2x1 = ___
        // 7! -> 1x2x3x4x5x6x7 = ___
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        
        int numero = scanner.nextInt();
        scanner.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // 1x2x3x4x5
            
            // factorial = factorial * 1;
            
            //factorial = 1*1 = 1
            // incrementamos i -> 2
            //factorial = 1*2 = 2
            // incrementamos i -> 3
            //factorial = 2*3 = 6
            // incrementamos i -> 4
            //factorial = 6*4 = 24
            // incrementamos i = 5
            //factorial = 24*5 = 120
            // incremenramos i -> 6
            // factorial =  120 * 6 = 720
            // incrementamos  i -> 7
            // factorial = 720 * 7 = 5040
            
        }
        
        System.out.println("El factorial de " + numero  +
                " es "+ factorial);
    }
    
}
