/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4.declaracionarray;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4DeclaracionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros = {1,2,3,4,5,6,7,8,9}; // espacio de memoria vacio
        String[] nombres = {"Karla", "Paola", "Alex", "Fanny", "Ismael", 
                            "Evelyn", "Juan Pablo", "Jessi", "Leonel", 
                            "Jesus", "Samuel", "Jose Antonio", 
                            "Jose Luis", "Uriel"};
        boolean[] banderas;
        char[] vocales;
        double[] precios;
        
        System.out.println("longitud: " + nombres.length);
        System.out.println("elemento 3 - posicion 2: " + nombres[2]);
        System.out.println("elemento 10 - posicion 9: " + nombres[9]);
        System.out.println("elemento 5 - posicion 4: " + nombres[4]);
        System.out.println(nombres);
    }
    
}
