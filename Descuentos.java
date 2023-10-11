/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifanidado;

/**
 *
 * @author ithzamary.vilchis
 */
public class Descuentos {

    public static void main(String[] args) {

        boolean esMaestro = true;
        boolean esEstudiante = false;
        boolean esTerceraEdad = false;
        boolean esDiscapacitado = true;
         

        if (esEstudiante || esMaestro) {
            System.out.println("Tienes descuento del 15%");
        } else if (esTerceraEdad && esDiscapacitado) {
            System.out.println("Tienes descuento del 20%");
        } else if (esDiscapacitado) {
            System.out.println("Tienes descuento del 30%");
        } else if(esTerceraEdad){
            System.out.println("Tienes descuento del 35%");
        }
        else {
            System.out.println("No tienes descuento");
        }

    }

}
