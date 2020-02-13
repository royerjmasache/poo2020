package homeworkselection;

import java.util.Enumeration;
import java.util.Scanner;

public class RunBiggerNumber {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ingreso de datos desde el teclado
        System.out.println("Ingrese el valor del primer número: ");
        int number1 = entrance.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        int number2 = entrance.nextInt();
        System.out.println("Ingrese el valor del tercer número: ");
        int number3 = entrance.nextInt();
        System.out.println("Ingrese el valor del cuarto número: ");
        int number4 = entrance.nextInt();
        // Creación de objeto
        BiggerNumber biggerNumber = new BiggerNumber(number1, number2, number3, number4);
        // Llamado del método
        biggerNumber.calculateNumber();
        // Presentación de resultados
        System.out.println("El número mayor obtenido es: " + biggerNumber.getHigher());
    }
}
