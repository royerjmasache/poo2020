package heritage;

import heritageemployee.HourEmployee;
import heritageemployee.SalariedEmployee;

import java.util.Scanner;

public class RunEmployee {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Variable para escoger la opción
        int option;
        System.out.println("Bienvenido al Sistema Virtual QWERTY\nElija una opción\n" +
                "1. Calcular el salario de un empleado por horas\n2. El salario de un empleado con sueldo fijo");
        option = entrance.nextInt();
        // Estructura while para controlar el menú
        switch (option){
            case 1:
                // Limpieza del buffer
                entrance.nextLine();
                System.out.println("Ingrese el nombre del empleado");
                String name = entrance.nextLine();
                System.out.println("Ingrese el cargo del empleado");
                String position = entrance.nextLine();
                System.out.println("Ingrese la dependencia del empleado");
                String dependence = entrance.nextLine();
                System.out.println("Ingrese el número de horas trabajadas");
                double hour = entrance.nextInt();
                System.out.println("Ingrese el valor por hora trabajada");
                double value = entrance.nextInt();
                // Creación del objeto para la clase HourEmployee y uso del constructor
                HourEmployee hourEmployee = new HourEmployee(name, position, dependence, hour, value);
                // Uso del método para calcular el salario
                hourEmployee.calculateSalary(hour, value);
                // Presentación de resultados para el empleado pagado por horas
                System.out.println("Empleado por horas\nName: " + hourEmployee.getName() + "\nPosition: " +
                        hourEmployee.getPosition() + "\nDependence: " + hourEmployee.getDependence() +
                        "\nSalary: " + hourEmployee.getSalary());
                break;
            case 2:
                // Limpieza del buffer
                entrance.nextLine();
                System.out.println("Ingrese el nombre del empleado");
                String sName = entrance.nextLine();
                System.out.println("Ingrese el cargo del empleado");
                String sPosition = entrance.nextLine();
                System.out.println("Ingrese la dependencia del empleado");
                String sDependence = entrance.nextLine();
                System.out.println("Ingrese el sueldo fijo del empleado");
                double fixedValue = entrance.nextInt();
                // Creación del objeto para la clase HourEmployee y uso del constructor
                SalariedEmployee salariedEmployee = new SalariedEmployee(sName, sPosition, sDependence, fixedValue);
                // Presentación de resultados para SalariedEmployee
                System.out.println("Empleado con sueldo fijo\nName: " + salariedEmployee.getName() + "\nPosition: " +
                        salariedEmployee.getPosition() + "\nDependence: " + salariedEmployee.getDependence() +
                        "\nSalary: " + salariedEmployee.getFixedValue());
                break;
            default:
                System.out.println("La opción seleccionada no es correcta");
                break;
        }
    }
}
