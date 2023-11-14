/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class Piramide2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de su piramide");
        int filas = sc.nextInt();
        char inicioLetra = 'A';
        int inicioNumero = 1;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {
                    if (inicioLetra > 'Z') {
                        inicioLetra = 'A';
                    }

                    System.out.print(inicioLetra);
                    inicioLetra++;
                } else {
                    if (inicioNumero > 9) {
                        inicioNumero = 1;
                    }
                    System.out.print(inicioNumero);
                    inicioNumero++;
                }

            }
            System.out.println();

        }

    }

}
