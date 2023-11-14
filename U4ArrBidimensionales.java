/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4arrbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class U4ArrBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        
        
        int[] arreglo = {2,4,5,6,7};
        
        
        int numero = 1;
        System.out.println(numeros);
        
      
        for(int i = 0; i<4; i++){ 
          for(int j = 0; j<5; j++){ 
              numeros[i][j] = numero;
              numero++;
          }  
        }
        
       
        for (int i = 0; i < numeros.length; i++) { //control filas
            for (int j = 0; j < 5; j++) { //control columnas
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
