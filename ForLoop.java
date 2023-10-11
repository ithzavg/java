/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloop;

/**
 *
 * @author ithzamary.vilchis
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola - " + i);
            
            for(int j = 0; j < 3; j++){
                System.out.println("Segundo for " + j);
                
                for (int k = 0; k <  2; k++) {
                    System.out.println("Tercer for " + k);
                }
            }
            
            
        }
        
        for(int i = 0; i < 6; i++){
            
        }
        
    }
    
}
