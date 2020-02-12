package desingselection;
import java.util.Scanner;
public class RunEmployee {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance  = new Scanner(System.in);
        // Ingreso de datos desde teclado
        System.out.println("Ingrese el nombre del empleado");
        String name = entrance.nextLine();
        System.out.println("Ingrese las horas trabajadas por el empleado");
        double hours = entrance.nextDouble();
        System.out.println("Ingrese el valor de la hora trabajada");
        double value = entrance.nextDouble();
        // Creación de objeto
        Employee employee = new Employee();
        // Actualización de datos
        employee.setName(name);
        employee.setHours(hours);
        employee.setValue(value);
        employee.calculateSalary();
        // Retorno de datos
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
