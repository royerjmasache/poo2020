package repetitionworkshop;

import java.util.Scanner;

public class RunProduct {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        boolean flag = true;
        int change;
        // Estructura repetitiva While
        while (flag == true) {
            // Ingreso de datos desde el teclado
            System.out.println("Ingrese el valor del primer número");
            int number1 = entrance.nextInt();
            System.out.println("Ingrese el valor del segundo número");
            int number2 = entrance.nextInt();
            // Creación de objeto
            Product product = new Product();
            // Llamado de métodos
            product.setNumber1(number1);
            product.setNumber2(number2);
            System.out.println(product.calculateProduct());
            System.out.println("Desea seguir ingresando datos?\n1. Ingresar nuevos datos\n" +
                    "2. Salir");
            change = entrance.nextInt();
            // Estructura condicional para salir del ciclo
            if (change == 2) {
                flag = false;
            }
        }
    }
}
