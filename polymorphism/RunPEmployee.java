package polymorphism;

import java.util.Scanner;

public class RunPEmployee {
    // Método principal
    public static void main(String[] args) {
        // Obtener el sueldo quincenal de un empleado por hora
        PHourEmployee pHours = new PHourEmployee();
        Scanner entrance = new Scanner(System.in);
        System.out.println("SUELDO QUINCENAL DE EMPLEADO POR HORAS\n" +
                "Ingrese el número de horas trabajadas: ");
        pHours.setHours(entrance.nextDouble());
        System.out.println("Ingrese el valor de la hora trabajada");
        pHours.setValue(entrance.nextDouble());
        // Llamado del método para calcular el sueldo quincenal
        pHours.calculateBiweekly();
        System.out.println("El sueldo quincenal es de: " + pHours.getSalary());
        // Obtener sueldo quincel de un empleado asalariado
        PSalaryEmployee pSalary = new PSalaryEmployee();
        System.out.println("SUELDO QUINCENAL DE UN EMPLEADO ASALARIADO\n" +
                "Ingrese el valor del sueldo mensual");
        pSalary.setMonthlySalary(entrance.nextDouble());
        // Llamado del método para calcular el sueldo quincenal
        pSalary.calculateBiweekly();
        System.out.println("El sueldo quincenal es de: " + pSalary.getSalary());
    }
}
