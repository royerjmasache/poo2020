package arrayshomeworkpoo;

import java.util.Scanner;

public class RunIdentification {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variable
        int identification;
        // Ingreso de datos desde teclado
        System.out.println("Ingrese el número de su cédula");
        identification = entrance.nextInt();
        // Creación de objeto
        Identification status = new Identification(identification);
        // Llamado de método para calcular la cédula
        status.calculateValidation();
        // Presentación de resultados
        System.out.println(status.getIdentification());
        System.out.println(status.getValidation());
        System.out.println(status.getStatus());
    }
}
