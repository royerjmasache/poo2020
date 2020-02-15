package repeatdesign;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class RunSalaryFor {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String name;
        String option;
        boolean flag = true;
        double hours;
        double value;
        System.out.println("Ingrese el valor por hora trabajada");
        value = entrance.nextDouble();
        for (int a = 1; flag == true; a ++) {
            System.out.println("Ingrese el nombre del empleado");
            name = entrance.nextLine();
            entrance.nextLine();
            System.out.println("Ingrese el número de horas trabajadas");
            hours = entrance.nextDouble();
            entrance.nextLine();
            // Creación del objeto
            SalaryFor employee = new SalaryFor(name, hours, value);
            employee.calculateSalary();
            // Presentación de resultados
            System.out.println("Nombre del empleado: " + employee.getName());
            System.out.println("Salario: " + employee.getSalary());
            System.out.println("Desea ingresar más datos?\n1. Ingresar más datos\n" +
                    "2. Salir");
            option = entrance.nextLine();
            if (option.equals("2")){
                flag = false;
            }
        }
    }
}
