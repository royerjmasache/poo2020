package objecttypedata;

import java.util.Scanner;

public class RunStudent {
    // Método principal
    public static void main(String[] args) {
        // Declaración de variables
        int counter;
        Student student;
        boolean flag = true;
        int option;
        Student [] students = new Student[3];
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Ciclo de repetición
        for(counter = 0; counter < students.length; counter ++){
            System.out.println("Ingreso de nuevos estudiantes");
            Student cStudent = new Student();
            System.out.println("Ingrese el nombre del estudiante:");
            cStudent.setName(entrance.nextLine());
            System.out.println("Ingrese la identificación del estuadiante:");
            cStudent.setIdentification(entrance.nextLine());
            System.out.println("Ingrese la edad del estudiante:");
            cStudent.setAge(entrance.nextInt());
            // Limpieza del buffer
            entrance.nextLine();
            System.out.println("Ingrese la carrera del estudiante");
            cStudent.setCareer(entrance.nextLine());
            System.out.println("Ingrese el correo del estudiante");
            cStudent.setMail(entrance.nextLine());
            // Asignamos el objeto cStudent a la variable student
            students[counter] = cStudent;
        }
        System.out.println("Lista de estudiantes");
        System.out.println("Cédula\tNombre");
        int accumulator = 0;
        for(counter = 0; counter < students.length; counter ++ ){
            accumulator = accumulator + students[counter].getAge();
            System.out.println(students[counter].getIdentification() + "\t" + students[counter].getName());
        }
        System.out.println("Edad de los estudiantes: " + (accumulator/students.length));
        System.out.println("Programa finalizado");
    }
}
