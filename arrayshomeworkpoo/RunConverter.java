package arrayshomeworkpoo;

import java.util.Scanner;

public class RunConverter {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String binary;
        // Ingreso de datos desde teclado
        System.out.println("Ingrese el número binario de 6 dígitos que desee calcular");
        binary = entrance.nextLine();
        // Creación de objeto
        Converter converter = new Converter(binary);
        // Llamado de métodos para calcular el valor
        converter.calculateDecimal();
        // Presentación de resultados
        converter.getDecimal();
    }
}
