/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhileloop;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class Menu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean banderaSalida = true;
        
        while(banderaSalida){
            System.out.println("Bienvenido a la cafeteria");
            System.out.println("Elige tu cafe favorito");
            System.out.println("1. Pumpkin spice latte");
            System.out.println("2. Latte");
            System.out.println("3. Americano");
            System.out.println("4. Capuccino");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido un pumpkin spice latte");
                    System.out.println("El total es: $" +90);
                    break;
                case 2:
                    System.out.println("Has elegido un latte");
                    System.out.println("El total es: $50");
                    break;
                case 3:
                    System.out.println("Has elegido un americano");
                    System.out.println("El total es $30");
                    break;
                case 4: 
                    System.out.println("Has elegido un capuccino");
                    System.out.println("El total es $70");
                    break;
                case 5:
                    System.out.println("Gracias por venir");
                    banderaSalida = false;
                    break;
                
                default:
                    System.out.println("Opcion invalida");
            }
            
            
        }
        
    }
}
