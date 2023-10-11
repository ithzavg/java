/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriascanner;
import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = lecturaDatos.nextInt();
        System.out.println("Ingrese la altura");
        int altura = lecturaDatos.nextInt();
        
        int area = (base * altura)/2;
        
        System.out.println("El area: " + area);
        
        lecturaDatos.close();
    }
}
