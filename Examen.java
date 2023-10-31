/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double precio;
        int nombreCombo;
        do {
            System.out.println("1-soltero:-chico:250,mediano:266.5,grande:288");
            System.out.println("2-pareja:-chico:380.3,mediano:390.5,grande:410.5");
            System.out.println("3-estudiante:-chico:100,mediano:115.3,grande:122.7");
            System.out.println("elige un combo");
            nombreCombo = num.nextInt();
            num.nextLine();

            String combo;
            if (nombreCombo == 1) {
                combo = "Soltero";
            } else if (nombreCombo == 2) {
                combo = "Pareja";
            } else {
                combo = "Estudiante";
            }

            switch (nombreCombo) {
                case 1:
                    System.out.println("tamaño del combo( CH, M, G)");

                    String tamanio = num.nextLine();
                    if (tamanio.equals("CH")) {
                        precio = 250;

                    } else if (tamanio.equals("M")) {
                        precio = 266.5;
                    } else {
                        precio = 288;
                    }

                    System.out.println("Desea palomitas mas grandes por $15 (si/no)");
                    String aumenta = num.nextLine();

                    if (aumenta.equals("si")) {
                        precio += 15;
                    }

                    System.out.println("Combo comprado: " + nombreCombo + " " + combo);
                    System.out.println("Aumento tamanio? " + aumenta);
                    System.out.println("Total cuenta" + precio);

                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (nombreCombo != 2);
    }
}
