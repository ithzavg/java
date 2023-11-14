/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosestaticos;

/**
 *
 * @author ithzamary.vilchis
 */
public class Metodos {
    
   
 
    public static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    public static double sumaOtro(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }
    
    public static void sumaVoid(double numero1, double numero2){
        System.out.println(numero1 + numero2);
    }
    
    public static String nombres(int numero, int edad, String color, double precio){
        System.out.println(numero);
        System.out.println(edad);
        System.out.println(color);
        System.out.println(precio);
        
        return "Cafe con leche";
    }
    
    public static void main(String[] args) {
        
        double suma = Metodos.suma(3,4);
        System.out.println(suma);
        
        System.out.println(Metodos.suma(10, 3));
        
        Metodos.sumaVoid(10, 2);
        
        System.out.println(Metodos.nombres(0, 0, "color", 2.2));
        
        
        
    }
    
    
    
}
