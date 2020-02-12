package desingselection;

import desingselection.Day;

import java.util.Scanner;

public class RunDay {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ingreso de datos desde el teclado
        System.out.println("Ingrese el número del día:\n");
        int number = entrance.nextInt();
        // Creación de objeto
        Day day = new Day();
        // Llamado de métodos
        day.setNumber(number);
        day.calculateName();
        // Presentación de resultados
        System.out.println(day.getName());
    }
}
