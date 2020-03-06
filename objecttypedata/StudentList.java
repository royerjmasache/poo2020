package objecttypedata;
// Importación de librerías
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    // Creación de método principal
    public static void main(String[] args) {
        // Creación de lista
        List<Student> students = new ArrayList<Student>();
        // Declaración de variables
        boolean flag = true;
        int option;
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        System.out.println("Sistema de ingreso vehicular");
        do {
            System.out.println("1. Almacenar nuevo estudiante\n2. Presentar estudiante/s\n3. Salir");
            option = entrance.nextInt();
            // Limpieza del buffer
            entrance.nextLine();
            switch (option){
                case 1:
                    Student student = new Student();
                    System.out.println("Ingrese el nombre del estudiante");
                    student.setName(entrance.nextLine());
                    System.out.println("Ingrese la identificación del estudiante");
                    student.setIdentification(entrance.nextLine());
                    System.out.println("Ingrese la edad del estudiante");
                    student.setAge(entrance.nextInt());
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese la carrera del estudiante");
                    student.setCareer(entrance.nextLine());
                    System.out.println("Ingrese el correo del estudiante");
                    student.setMail(entrance.nextLine());
                    // Agregamos objeto student a la lista
                    students.add(student);
                    break;
                case 2:
                    // Presentación de estudiantes
                    // Ciclo repetitivo foreach para recorrer la lista
                    for (Student counter: students) {
                        System.out.println("*");
                        System.out.println("Name: " + counter.getName());
                        System.out.println("Identification: " + counter.getIdentification());
                        System.out.println("Age: " + counter.getAge());
                        System.out.println("Career: " + counter.getCareer());
                        System.out.println("Mail: " + counter.getMail());
                        System.out.println("*");
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        } while (flag);
    }
}
