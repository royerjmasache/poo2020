package repeatdesign;

import java.util.Scanner;

public class RunSalaryWhile {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String name;
        String option;
        double hours;
        double value;
        System.out.println("Ingrese el valor por hora trabajada");
        value = entrance.nextDouble();
        entrance.nextLine();
        // Estructura repetitiva While
        do {
            // Ingreso de datos desde teclado
            System.out.println("Ingrese el nombre del empleado");
            name = entrance.nextLine();
            System.out.println("Ingrese el número de horas trabajadas");
            hours = entrance.nextDouble();
            // Creación del objeto
            SalaryWhile employee = new SalaryWhile(name, hours, value);
            employee.calculateSalary();
            // Presentación de resultados
            System.out.println("Nombre del empleado: " + employee.getName());
            entrance.nextLine();
            System.out.println("Salario: " + employee.getSalary());
            System.out.println("Desea calcular el sueldo de otro empleado?\n" +
                    "1. Ingresar nuevos datos\n2. Salir");
            option = entrance.nextLine();
        }  while (option.equals("1"));
    }
}
