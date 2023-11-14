/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4arreglosbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4ArregloBidimensional {

    public static void main(String[] args) {
        int[][] numeros = new int[4][];
        
        numeros[0] = new int[1];
        numeros[1] = new int[2];
        numeros[2] = new int[3];
        numeros[3] = new int[4];
        
        int k = 1;
        
        //System.out.println(numeros[3].length);
        //numeros.lenght nos da el tamaño de filas
        //numeros[n].lenght nos da el tamaño de las columnas
        
        //Guardar numeros
        
        for (int i = 0; i < numeros.length; i++) { //Control de filas
            //System.out.println(numeros[i].length);
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = k;
                k++;
            }
        }
        
        //Lectura
        for (int i = 0; i < numeros.length; i++) { //Control de filas
            //System.out.println(numeros[i].length);
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
      

    }

}
