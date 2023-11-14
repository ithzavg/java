/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4.arreglos;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[] banderas = {true, false, true, true, false}; 
        String[] nombres = {"Cesar", "Mateo", "Julio", 
                            "Victor", "Panchito", "Cris", 
                            "Liz", "Fatima", "Carlos", "Jacky",
                            "Josue", "Zoe", "Isaac", "Gahel"};
        double[] calificaciones = {8.3, 6.4, 5.6, 6.9, 7.8, 
                                  10.0, 9.8, 7.8, 9.4, 5.6 };
        char[] vocales;
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + nombres[i] );
        }
        
    }
    
}
