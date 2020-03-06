package polymorphismvolume;

import java.util.Scanner;

public class RunPVolume {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
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
                    // Creación de objeto
                    PCube cube = new PCube();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    cube.setName(entrance.nextLine());
                    System.out.println("Ingrese el valor de la arista del cubo");
                    cube.setEdge(entrance.nextDouble());
                    cube.calculateVolume();
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + cube.getName() + "\nVolumen: "
                            + cube.getVolume());
                    break;
                case 2:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Creación de objeto
                    PCylinder cylinder = new PCylinder();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    cylinder.setName(entrance.nextLine());
                    System.out.println("Ingrese el valor del radio del cilindro");
                    cylinder.setRadio(entrance.nextDouble());
                    System.out.println("Ingrese el valor de la altura del cilindro");
                    cylinder.setHeight(entrance.nextDouble());
                    cylinder.calculateVolume();
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + cylinder.getName() + "\nVolumen: "
                            + cylinder.getVolume());
                    break;

                case 3:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Creación de objeto
                    PCone cone = new PCone();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    cone.setName(entrance.nextLine());
                    System.out.println("Ingrese el valor del radio del cono");
                    cone.setRadio(entrance.nextDouble());
                    System.out.println("Ingrese el valor de la altura del cono");
                    cone.setHeight(entrance.nextDouble());
                    cone.calculateVolume();
                    System.out.println("Nombre de la figura: " + cone.getName() + "\nVolumen: "
                            + cone.getVolume());
                    break;
                case 4:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Creación de objeto
                    PSphere sphere = new PSphere();
                    System.out.println("Ingrese nuevamente el nombre de la figura seleccionada");
                    sphere.setName(entrance.nextLine());
                    System.out.println("Ingrese el valor del radio de la esfera");
                    sphere.setRadio(entrance.nextDouble());
                    sphere.calculateVolume();
                    // Presentación de resultados
                    System.out.println("Nombre de la figura: " + sphere.getName() + "\nVolumen: "
                            + sphere.getVolume());
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
