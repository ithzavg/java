/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        final double precioVentaInstrumento1 = 1250.45;
        final double precioVentaInstrumento2 = 3743.00;
        final double precioVentaInstrumento3 = 2683.78;

        System.out.println("Ingresa el nombre del primer instrumento");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingresa el precio del instrumento1");
        double precioCompraInstrumento1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa el nombre del segundo instrumento");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingresa el precio del instrumento2");
        double precioCompraInstrumento2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa el nombre del tercer instrumento");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingresa el precio del instrumento3");
        double precioCompraInstrumento3 = scanner.nextDouble();

        double ganancia1 = precioVentaInstrumento1 - precioCompraInstrumento1;
        double total1 = (ganancia1 / precioCompraInstrumento1) * 100;

        double ganancia2 = precioVentaInstrumento2 - precioCompraInstrumento2;
        double total2 = (ganancia2 / precioCompraInstrumento2) * 100;

        double ganancia3 = precioVentaInstrumento3 - precioCompraInstrumento3;
        double total3 = (ganancia3 / precioCompraInstrumento3) * 100;

        System.out.println("*******************");
        System.out.println("El porcentaje de ganancia de: " + nombre1 + " " + "es " + total1);
        System.out.println("El porcentaje de ganancia de: " + nombre2 + " " + "es " + total2);
        System.out.println("El porcentaje de ganancia de: " + nombre3 + " " + "es " + total3);
        System.out.println("*******************");

        scanner.close();

    }

}
