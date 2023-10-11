/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifanidado;

/**
 *
 * @author ithzamary.vilchis
 */
public class IfAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion = 100;
        int edad = 18;
        
        if(edad == 10){
            System.out.println("No puedes pasar al juego");
        }else {
            System.out.println("Si puedes pasar");
        }
        
        if(!(edad == 10)){
            System.out.println("Si puedes pasar al juego");
        }
        
        if (calificacion >= 90) {
            System.out.println("Felicidades");
            System.out.println("Tienes letra A");
        }else if(calificacion >= 80){
            System.out.println("Muy bien");
            System.out.println("Tienes letra B");
        }else if(calificacion >= 70){
            System.out.println("Puedes ser mejor");
            System.out.println("Tienes letra C");
        }else if(calificacion >= 60){
            System.out.println("Tienes letra D");
        }else {
            System.out.println("Tienes letra F");
        }
        
        
        int suma = 300 + 22; //322
        
        if ((suma > 300) || (suma > 350)) {
            
            System.out.println("Bloque 1");
            
        }else {
            System.out.println("Bloque 2");
        }
        
    }
    
}
