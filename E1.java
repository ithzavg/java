/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2;
import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int descProd1 = 30;
        final int descProd2 = 65;
        final int descProd3 = 15;
        
        System.out.println("Escribe el nombre del videojuego1:");
        String videojuego1 = scanner.nextLine();
        System.out.println("Dime el precio");
        double precioVideojuego1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Escribe el nombre del videojuego2:");
        String videojuego2 = scanner.nextLine();
        System.out.println("Dime el precio");
        double precioVideojuego2 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Escribe el nombre del videojuego3:");
        String videojuego3 = scanner.nextLine();
        System.out.println("Dime el precio");
        double precioVideojuego3 = scanner.nextDouble();
        
        double porcentajeTotal1 = (precioVideojuego1 * descProd1) / 100;
        double porcentajeTotal2 = (precioVideojuego2 * descProd2) / 100;
        double porcentajeTotal3 = (precioVideojuego3 * descProd3) / 100;
        
        System.out.println("*******************");
        System.out.println("El nombre del videojuego1 es " + videojuego1 +" y su descuento es: " + porcentajeTotal1);
        System.out.println("El nombre del videojuego2 es " + videojuego2 +" y su descuento es: " + porcentajeTotal2);
        System.out.println("El nombre del videojuego3 es " + videojuego3 +" y su descuento es: " + porcentajeTotal3);
    }
    
}
