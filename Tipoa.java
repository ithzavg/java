/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipoa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tipoa {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        double precio = 0;
        int opcion;
        
        do {

            System.out.println("1. capuchino ch:25.30, M:30, G:37.5 ");
            System.out.println("2. latte ch:32.50, M:38.40, G:42.50 ");
            System.out.println("3. matcha ch:41.50, M:48.90, G:52.5 ");
            System.out.println("4. Salir");
            
            System.out.println("Elige un cafe: ");
            opcion = lec.nextInt();
            String cafe = "";

            if (opcion == 1) {
                cafe = "capuchino";
            } else if (opcion == 2) {
                cafe = "late";
            } else if (opcion == 3) {
                cafe = "matcha";
            }

            lec.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("De que tamanio quiere su cafe?(1. CH/2. M/3. G)");
                    String tamanio = lec.nextLine();

                    if (tamanio.equalsIgnoreCase("CH")) {
                        precio = 25.30;
                    } else if (tamanio.equalsIgnoreCase("M")) {
                        precio = 30.00;
                    } else {
                        precio = 37.5;
                    }

                    System.out.println("Que tipo de leche quiere? (Deslactosada/Normal)");
                    String tipoleche = lec.nextLine();

                    if (tipoleche.equals("deslactosada")) {
                        System.out.println("entra al if");
                        precio += 12;
                    }

                    System.out.println("cafe comprado: " + cafe);
                    System.out.println("tipo de leche: " + tipoleche);
                    System.out.println("total cuenta: " + precio);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Gracias por usar el menu");
                    break;

                default:
                    System.out.println("opcion no valida");
            }

        } while (opcion != 4);
    }

}
