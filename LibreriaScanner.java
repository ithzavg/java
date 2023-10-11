/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriascanner;
import java.util.Scanner;
/**
 *
 * @author ithzamary.vilchis
 */
public class LibreriaScanner {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       String nombre = scanner.nextLine();
       System.out.println("Bienvenido " + nombre);
       scanner.close(); 
    }
    
}
