package designpoo;
import java.util.Scanner;

public class RunStudent {
    // Método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ingreso de datos por teclado
        System.out.println("Ingrese el nombre del estudiante:\n");
        String firstName = entrance.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        String lastName = entrance.nextLine();
        System.out.printf("Ingrese el nombre del componente:\n");
        String component = entrance.nextLine();
        System.out.println("Ingrese el valor de la nota del primer bimestre:\n");
        double score1 = entrance.nextDouble();
        System.out.println("Ingrese el valor de la nota del segundo bimestre:\n");
        double score2 = entrance.nextDouble();
        // Creación de objeto
        Student student = new Student(firstName, lastName, component, score1, score2);
        // Llamado del método
        String information = student.getInformation();
        // Presentación de resultados
        System.out.println(information);
    }
}
