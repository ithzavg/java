/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4arreglosbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4Arreglo {

    public static void main(String[] args) {
        int[][] numeros = new int[4][];
        numeros[0] = new int[1];
        numeros[1] = new int[2];
        numeros[2] = new int[3];
        numeros[3] = new int[4];

        int k = 1;

        System.out.println(numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("tamanio" + numeros[i].length);
            for (int j = 0; j < numeros[i].length; j++) {

                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("**************************");

        double[][] m = {
            {0.0, 0.1, 0.2},
            {0.0, 0.1, 0.2},
            {0.0, 0.1, 0.2},
            {0.0, 0.1, 0.2},};
        
            m[0][2] = 400;
        
        
        
        for (int i = 0; i < m.length; i++) {
            //System.out.println("tamanio" + m[i].length);
            for (int j = 0; j < m[i].length; j++) {
                
                System.out.println(m[i][j] + " ");

            }
            System.out.println();
        }
    }

}
