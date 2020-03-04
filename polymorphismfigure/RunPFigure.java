package polymorphismfigure;

import java.util.Scanner;

public class RunPFigure {
    // Creación de método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        int option = 0;
        // Presentación del menú
        while (option != 5) {
            System.out.println("\t\t\t\t\tFIGURES\nSeleccione la figura deseada para el cálculo de su área: \n" +
                        "1. Triángulo\n2. Cuadrado\n3. Rectángulo\n4. Círculo\n5. Salir");
            option = entrance.nextInt();
            switch (option) {
                case 1:
                    // Limpieza del buffer
                    entrance.nextLine();
                    // Creación del objeto y uso del constructor
                    PTriangle triangle = new PTriangle();
                    System.out.println("Ingrese el nombre de la figura seleccionada");
                    triangle.setName(entrance.nextLine());
                    System.out.println("Ingrese el valor de la base");
                    triangle.setBase(entrance.nextDouble());
                    System.out.println("Ingrese el valor de la altura");
                    triangle.setHeight(entrance.nextDouble());
                    // Uso del método para calcular el área
                    triangle.calculateArea();
                    // Presentación de resultados
                    System.out.println("Figura: " + triangle.getName() + "\nValor del área: " + triangle.getArea());
                    break;
                    case 2:
                        // Limpieza del buffer
                        entrance.nextLine();
                        // Creación del objeto y uso del constructor
                        PSquare square = new PSquare();
                        System.out.println("Ingrese el nombre de la figura seleccionada");
                        square.setName(entrance.nextLine());
                        System.out.println("Ingrese el valor del lado");
                        square.setSide(entrance.nextInt());
                        // Uso del método para calcular el área
                        square.calculateArea();
                        // Presentación de resultados
                        System.out.println("Figura: " + square.getName() + "\nValor del área: " + square.getArea());
                        break;
                    case 3:
                        // Limpieza del buffer
                        entrance.nextLine();
                        // Creación del objeto y uso del constructor
                        PRectangle rectangle = new PRectangle();
                        System.out.println("Ingrese el nombre de la figura seleccionada");
                        rectangle.setName(entrance.nextLine());
                        System.out.println("Ingrese el valor de base");
                        rectangle.setBase(entrance.nextDouble());
                        System.out.println("Ingrese el valor de la altura");
                        rectangle.setHeight(entrance.nextDouble());
                        // Uso del método para calcular el área
                        rectangle.calculateArea();
                        // Presentación de resultados
                        System.out.println("Figura: " + rectangle.getName() + "\nValor del área: " + rectangle.getArea());
                        break;
                    case 4:
                        // Limpieza del buffer
                        entrance.nextLine();
                        // Creación del objeto y uso del constructor
                        PCircle circle = new PCircle();
                        // Uso del método para calcular el área
                        System.out.println("Ingrese el nombre de la figura seleccionada");
                        circle.setName(entrance.nextLine());
                        System.out.println("Ingrese el valor del radio");
                        circle.setRadio(entrance.nextDouble());
                        circle.calculateArea();
                        // Presentación de resultados
                        System.out.println("Figura: " + circle.getName() + "\nValor del área: " + circle.getArea());
                        break;
                    case 5:
                        System.out.println("Salida realizada con éxito");
                        break;
                    default:
                        System.out.println("La opción seleccionada no es correcta");
                }
            }
    }
}
