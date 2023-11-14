/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4arrbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class ArrInicializacion {

    public static void main(String[] args) {
        String[][] nombres = {
            {"Pao", "Jessi", "Jesus"},
            {"Pablo", "Karla", "Isma"},
            {"Fanny", "Alex", "Samuel"}
        };
        
        //Leer
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " , ");
            }
            System.out.println();
        }
    }

}
