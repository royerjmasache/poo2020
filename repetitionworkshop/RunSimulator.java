package repetitionworkshop;

import java.util.Scanner;

public class RunSimulator {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        int value;
        int option = 0;
        // Ingreso de datos desde teclado
        System.out.println("Ingrese el valor del saldo de su cuenta");
        value = entrance.nextInt();
        entrance.nextLine();
        // Creación del objeto
        Simulator simulator = new Simulator(value);
        while (option != 4){
            System.out.println("Cajero Automático QWERTY\nBienvenido\n1. Consulta de saldo\n2. Depósitos\n" +
                    "3. Retiros\n4. Salir");
            option = entrance.nextInt();
            // Limpieza de buffer
            entrance.nextLine();
            switch (option){
                case 1:
                    System.out.println("El saldo de su cuenta es: " + simulator.checkValue());
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea depositar");
                    int deposit = entrance.nextInt();
                    simulator.depositValue(deposit);
                    System.out.println("Saldo acumulado:" + simulator.checkValue());
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea retirar");
                    int withdraw = entrance.nextInt();
                    simulator.withdrawValue(withdraw);
                    System.out.println("Saldo disponible: " + simulator.checkValue());
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro sevicio");
                    break;
                default:
                    System.out.println("La opción ingresada no es la correcta");
            }

        }

    }
}
