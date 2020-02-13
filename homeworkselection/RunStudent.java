package homeworkselection;

import java.util.Scanner;

public class RunStudent {
    // Creación de método main
    public static void main(String[] args) {
        // Creación del objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ingreso de datos desde el teclado
        System.out.println("Ingrese el nombre del estudiante:");
        String name = entrance.nextLine();
        System.out.println("Ingrese la calificación 1:");
        double grade1 = entrance.nextInt();
        System.out.println("Ingrese la calificación 2:");
        double grade2 = entrance.nextInt();
        System.out.println("Ingrese la calificación 3:");
        double grade3 = entrance.nextInt();
        System.out.println("Ingrese la calificación 4:");
        double grade4 = entrance.nextInt();
        // Creación del objeto
        Student student = new Student(name, grade1, grade2, grade3, grade4);
        // Llamado del método para calcular el promedio
        student.calculateAverage();
        // Llamado del método para calcular el estado
        student.calculateStatus();
        // Presentación de resultados
        System.out.println(student.getName());
        System.out.println(student.getAverage());
        System.out.println(student.getStatus());
    }
}
