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
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese base");
        int base = scanner.nextInt();
        System.out.println("Ingrese altura");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.println(area);
        
        scanner.close();
    }
    
}
