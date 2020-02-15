package repetitionworkshop;
// Integrantes: Royer Masache, Andrés Vallejo, Jordy Esparza
import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        int number;
        // Ingreso de datos desde teclado
        System.out.println("Ingrese el valor del número al que desea obtener el factorial");
        number = entrance.nextInt();
        // Creación de objeto
        Factorial factorial = new Factorial();
        // Presentación de resultados
        System.out.println("El resultado es: " + factorial.calculateFactorial(number));
    }
}
