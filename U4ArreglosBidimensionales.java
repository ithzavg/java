/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4arreglosbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] numeros = new int [4][5];
        int numero = 1;
        //Guardando informacion en arreglo unidimensional
        for(int i=0; i<4; i++){ //control de filas
            for(int j=0; j<5; j++){ // control de columnas
                numeros[i][j] = numero;
                numero++;
            }
        }
        
        //Leyendo informacion en arreglo unidimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " "); 
            }
            System.out.println();
        }
        
    }
    
}
