import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 134500.0; 

        
            System.out.println("Bienvenido al Cajero Automático");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
           
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es de: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad que desea depositar: $");
                    double cantidadDeposito = scanner.nextDouble();
                    saldo += cantidadDeposito;
                    System.out.println("Depósito exitoso. Su saldo actual es: $" + saldo);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad que desea retirar: $");
                    double cantidadRetiro = scanner.nextDouble();
                    if (cantidadRetiro <= saldo) {
                        saldo -= cantidadRetiro;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
               
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        
    }
}
