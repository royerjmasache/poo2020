package matrixpoo;

import java.util.Scanner;

public class RunArray {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        int[][] arrayA = new int[3][3];
        int[][] arrayB = new int[3][3];
        System.out.println("Array A");
        // Ingreso de datos desde teclado
        for (int a = 0; a < arrayA.length; a ++){
            for (int b = 0; b < arrayA.length; b ++){
                System.out.println("Ingrese el valor del elemento de la Matriz A en la posición " + (a + 1) + "," + (b +1));
                arrayA[a][b] = entrance.nextInt();
            }
        }
        System.out.println("Array B");
        // Ingreso de datos desde teclado
        for (int a = 0; a < arrayB.length; a ++){
            for (int b = 0; b < arrayB.length; b ++){
                System.out.println("Ingrese el valor del elemento de la Matriz B en la posición " + (a + 1) + "," + (b +1));
                arrayB[a][b] = entrance.nextInt();
            }
        }
        // Creación de objeto
        Array array = new Array(arrayA, arrayB);
        // Llamado del método para calcular la suma
        array.calculateSum();
        // Presentación de resultados
        System.out.println("Matriz A");
        array.getResult(arrayA);
        System.out.println("\nMatriz B");
        array.getResult(arrayB);
        System.out.println("\nMatriz C");
        array.getResult(array.calculateSum());
    }
}
