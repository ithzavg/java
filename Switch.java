/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifanidado;

/**
 *
 * @author ithzamary.vilchis
 */
public class Switch {
    public static void main(String[] args) {
        int expresion = 6;
        
        switch (expresion) {
            case 1:
                System.out.println("Enero");
                break;
            case 2: 
                System.out.println("Febrero");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("El mes no existe");
        }
    }
    
}
