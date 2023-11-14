/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author ithzamary.vilchis
 */
public class Metodos {

   public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = Metodos.sumar(5, 3); // Llamando al método estático
        System.out.println("La suma es: " + resultado);
    }
    
}
