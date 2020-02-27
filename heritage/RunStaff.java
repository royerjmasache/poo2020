package heritage;

import java.util.Scanner;


public class RunStaff {
    // Creación de método main
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);

        // Ingreso de datos para el estudiante
        System.out.println("Ingrese el nombre del estudiante");
        String name = entrance.nextLine();
        System.out.println("Ingrese la identificación del estudiante");
        String identification = entrance.nextLine();
        System.out.println("Ingrese la titulación del estudiante");
        String career = entrance.nextLine();
        System.out.println("Ingrese el estado civil del estudiante");
        String status = entrance.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del estudiante");
        String birth = entrance.nextLine();
        // Creación de objeto de la clase Student y uso del método constructor
        Student student = new Student(name, career, identification, status, birth);

        // Ingreso de datos para el docente
        System.out.println("Ingrese el nombre del docente");
        String tName = entrance.nextLine();
        System.out.println("Ingrese la identificación del docente");
        String tIdentification = entrance.nextLine();
        System.out.println("Ingrese el estado civil del docente");
        String tStatus = entrance.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del docente");
        String tBirth = entrance.nextLine();
        System.out.println("Ingrese el area del docente");
        String area = entrance.nextLine();
        // Creación de objeto de la clase Teacher y uso del método constructor
        Teacher teacher = new Teacher(tName, tIdentification, tStatus, tBirth, area);

        // Ingreso de datos para el personal administrativo
        System.out.println("Ingrese el nombre del personal administrativo");
        String aName = entrance.nextLine();
        System.out.println("Ingrese la identificación del personal administrativo");
        String aIdentification = entrance.nextLine();
        System.out.println("Ingrese el estado civil del personal administrativo");
        String aStatus = entrance.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del personal administrativo");
        String aBirth = entrance.nextLine();
        System.out.println("Ingrese la dependencia del personal administrativo");
        String dependence = entrance.nextLine();
        // Creación de objeto de la clase Managerial y uso del método constructor
        Managerial managerial = new Managerial(aName, aIdentification, aStatus, aBirth, dependence);

        // Presentación de resultados del estudiante
        System.out.println("Datos del estudiante");
        System.out.println("Name: " + student.getName() + "\nIdentification: " + student.getIdentification() +
                "\nCareer: " + student.getCareer() + "\nStatus: " + student.getStatus() + "\nBirth: "
                + student.getBirth());
        // Presentación de resultados del docente
        System.out.println("\nDatos del docente");
        System.out.println("Name: " + teacher.getName() + "\nIdentification: " + teacher.getIdentification() +
                "\nStatus: " + teacher.getStatus() + "\nBirth: " + teacher.getBirth() + "\nArea: " + teacher.getArea());
        // Presentación de resultados del personal administrativo
        System.out.println("\nDatos del personal administrativo");
        System.out.println("Name: " + managerial.getName() + "\nIdentification: " + managerial.getIdentification() +
                "\nStatus: " + managerial.getStatus() + "\nBirth: " + managerial.getBirth() +
                "\nDependence: " + managerial.getDependence());
    }
}
