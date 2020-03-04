package heritageautomotive;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RunEmployee {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String name;
        String department;
        String position;
        double salary;
        double biweeklySalary;
        double value;
        double car;
        int number;
        int type = 0;
        boolean option = true;
        int selection;
        String aReport = "";
        String mReport = "";
        String sReport = "";
        String result = "";
        int counter = 1;
        // Creación del reporte
        while (option) {
            System.out.println("Ingrese el tipo de empleado\n1. Administrativo\n2. Mecánico\n3. Vendedor");
            type = entrance.nextInt();
            switch (type) {
                case 1:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Ingreso de datos desde el teclado
                    System.out.println("Ingrese en nombre del empleado");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el departamento del empleado");
                    department = entrance.nextLine();
                    System.out.println("Ingrese el puesto del empleado");
                    position = entrance.nextLine();
                    System.out.println("Ingrese el sueldo del empleado");
                    salary = entrance.nextDouble();
                    // Creación del objeto y uso del constructor
                    Administrative administrative = new Administrative(name, department, position, salary);
                    // Acumulación de resultados
                    aReport = counter + "\t\t\t" + administrative.getName() + "\t\t\t\t\t"
                            + administrative.getDepartment() + "\t\t\t\t\t" + administrative.getPosition()
                            + "\t\t\t\t\t" + administrative.calculateBiweeklySalary() + "\n";
                    result = result + aReport;
                    break;
                case 2:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Ingreso de datos desde el teclado
                    System.out.println("Ingrese en nombre del empleado");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el departamento del empleado");
                    department = entrance.nextLine();
                    System.out.println("Ingrese el puesto del empleado");
                    position = entrance.nextLine();
                    System.out.println("Ingrese el precio del trabajo del empleado");
                    value = entrance.nextDouble();
                    System.out.println("Ingrese los trabajos realizados por el empleado");
                    number = entrance.nextInt();
                    // Creación de objeto y ueso del contador
                    Mechanical mechanical = new Mechanical(name, department, position, value, number);
                    // Llamado del método para calcular el salario
                    mechanical.calculateSalary();
                    // Acumulación de resultados
                    mReport = counter + "\t\t\t" + mechanical.getName() + "\t\t\t\t\t" + mechanical.getDepartment()
                            + "\t\t\t\t\t" + mechanical.getPosition() + "\t\t\t\t\t"
                            + mechanical.calculateBiweeklySalary() + "\n";
                    result = result + mReport;
                    break;
                case 3:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Ingreso de datos desde el teclado
                    System.out.println("Ingrese en nombre del empleado");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el departamento del empleado");
                    department = entrance.nextLine();
                    System.out.println("Ingrese el puesto del empleado");
                    position = entrance.nextLine();
                    System.out.println("Ingrese el precio del auto vendido");
                    car = entrance.nextDouble();
                    System.out.println("Ingrese la cantidad de autos vendidos por el empleado");
                    number = entrance.nextInt();
                    // Creación de objeto y uso del constructor
                    Seller seller = new Seller(name, department, position, car, number);
                    // Llamado del método para calcular el salario
                    seller.calculateSalary();
                    // Acumulación de resultados
                    sReport = counter + "\t\t\t" + seller.getName() + "\t\t\t\t\t" +
                            seller.getDepartment() + "\t\t\t\t\t" + seller.getPosition() + "\t\t\t\t\t"
                            + seller.calculateBiweeklySalary() + "\n";
                    result = result + sReport;

                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
            // Incremento del contador
            counter = counter + 1;
            System.out.println("Desea seguir ingresando datos?\n1. Sí\n2. No");
            selection = entrance.nextInt();
            if (selection == 2) {
                option = false;
            }
        }
        // Presentación de resultados finales
        counter = counter - 1;
        System.out.println("REPORTE DE NÓMINA QUINCENAL\nRFC\t\t\tNombre\t\t\t\t\tDepartamento" +
                "\t\t\t\t\tPuesto\t\t\t\t\tSueldo quincena\n" + result + "\nTotal de empleados: "
                + counter);
    }
}
