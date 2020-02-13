package homeworkselection;

import java.util.Scanner;

public class RunSalary {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ingreso de datos desde el teclado
        System.out.println("Ingrese el nombre del empleado:");
        String name = entrance.nextLine();
        System.out.println("Ingrese el número de horas trabajadas:");
        int hours = entrance.nextInt();
        System.out.println("Ingrese el valor por hora trabajada");
        double value = entrance.nextDouble();
        // Creación de objeto y uso del constructor
        Salary employee = new Salary(name, hours, value);
        // Llamado del método para calcular el salario
        employee.calculateSalary();
        // Presentación de resultados
        System.out.println("Nombre de empleado: " + employee.getName());
        System.out.println("Salario: " + employee.getSalary());
    }
}
