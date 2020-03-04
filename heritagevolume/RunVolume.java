package heritagevolume;

import java.util.Scanner;

public class RunVolume {
    // Creación de método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String name;
        double edge;
        double radio;
        double height;
        int option = 0;
        // Creación de menú
        while (option != 5){
            System.out.println("\t\t\t\t\tÁREA FIGURAS GEOMÉTRICAS\n1. Cubo\n2. Cilindro" +
                    "\n3. Cono\n4. Esfera\n5. Fin\n* Seleccione una opción");
            option = entrance.nextInt();
            switch (option){
                case 1:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor de la arista del cubo");
                    edge = entrance.nextDouble();
                    // Creación de objeto
                    Cube cube = new Cube(name, edge);
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + cube.getName() + "\nVolumen: "
                            + cube.calculateVolume());
                    break;
                case 2:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del radio del cilindro");
                    radio = entrance.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cilindro");
                    height = entrance.nextDouble();
                    // Creación de objeto
                    Cylinder cylinder = new Cylinder(name, radio, height);
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + cylinder.getName() + "\nVolumen: "
                            + cylinder.calculateVolume());
                    break;

                case 3:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del radio del cono");
                    radio = entrance.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cono");
                    height = entrance.nextDouble();
                    // Creación de objeto
                    Cone cone = new Cone(name, radio, height);
                    System.out.println("Nombre de la figura: " + cone.getName() + "\nVolumen: "
                            + cone.calculateVolume());
                    break;
                case 4:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del radio de la esfera");
                    radio = entrance.nextDouble();
                    // Creación de objeto
                    Sphere sphere = new Sphere(name, radio);
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + sphere.getName() + "\nVolumen: "
                            + sphere.calculateVolume());
                case 5:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Selección incorrecta, intente de nuevo");
                    break;
            }
        }
    }
}
