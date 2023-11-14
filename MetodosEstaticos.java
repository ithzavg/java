/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosestaticos;

/**
 *
 * @author ithzamary.vilchis
 */
public class MetodosEstaticos {
    
    public static double suma(double numero1, double numero2){ //TIPO RETORNO DOUBLE
        double resultado = numero1 + numero2;
        return resultado;
    }
    
    public static void sumaVoid(double numero1, double numero2){ //SIN TIPO RETORNO
        double resultado = numero1 + numero2;
        System.out.println(resultado);
    }
    
    public static double resta(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public static void restaVoid(int numero1, int numero2){
        System.out.println(numero1 - numero2);
    }
    
    
    
    public static void main(String[] args) {
        double suma = MetodosEstaticos.suma(30, 34);
        System.out.println(suma);
        
        //error -> porque no puedo guardar un metodo void en una variable ->double sumaVoid = MetodosEstaticos.sumaVoid(10, 20);
        
        MetodosEstaticos.sumaVoid(10, 20);
        
        double resta = MetodosEstaticos.resta(10, 5);
    }
    
}
