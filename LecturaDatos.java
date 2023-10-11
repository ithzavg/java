/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturadatos;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class LecturaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Dime tu edad: ");
        int edad = lectura.nextInt();
        
        lectura.nextLine();
        
        System.out.println("Dime tu nombre");
        String nombre = lectura.nextLine();
        
        lectura.close();
        
        System.out.println("Hola " + nombre 
                + " tu edad es: " + edad);

    }

}
