package arraypoo;

import java.util.Scanner;

public class RunVector {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        int [] vectorA = new int [10];
        int [] vectorB = new int [10];
        // Creación de objeto
        Vector vector = new Vector();
        // Ciclo repetitivo para almacenar valores
        for (int a = 0; a < vectorA.length; a++){
            // Ingreso de datos desde teclado
            System.out.println("Ingrese el valor del vector A en la posición " + a);
            vectorA[a] = entrance.nextInt();
            System.out.println("Ingrese el valor del vector B en la posición " + a);
            vectorB[a] = entrance.nextInt();
            // Llamado de métodos para establecer los valores
            vector.setVectorA(vectorA);
            vector.setVectorB(vectorB);
        }
        // Ciclo repetitivo para presentar los elementos de los arreglos
        for (int b = 0; b < vectorA.length; b++){
            // Llamado de métodos
            System.out.println(vectorA[b]);
            System.out.println(vectorB[b]);
        }
        // Presentación del resultado final
        System.out.println("La suma de los productos de los vectores es: " + vector.calculateProduct());
    }
}
