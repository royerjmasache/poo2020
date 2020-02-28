package heritagefigure;
import java.util.Scanner;

public class RunFigure {
    // Creación de método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        int option = 0;
        String name;
        double base;
        double height;
        double side;
        double radio;
        // Presentación del menú
        while (option != 5) {
            System.out.println("\t\t\t\t\tFIGURES\nSeleccione la figura deseada para el cálculo de su área: \n" +
                    "1. Triángulo\n2. Cuadrado\n3. Rectángulo\n4. Círculo\n5. Salir");
            option = entrance.nextInt();
            switch (option) {
                case 1:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor de la base");
                    base = entrance.nextDouble();
                    System.out.println("Ingrese el valor de la altura");
                    height = entrance.nextDouble();
                    // Creación del objeto y uso del constructor
                    Triangle triangle = new Triangle(name, base, height);
                    // Uso del método para calcular el área
                    triangle.calculateArea();
                    // Presentación de resultados
                    System.out.println("Figura: " + triangle.calculateArea() + "\nValor del área: " + triangle.getArea());
                    break;
                case 2:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del lado");
                    side = entrance.nextDouble();
                    // Creación del objeto y uso del constructor
                    Square square = new Square(name, side);
                    // Uso del método para calcular el área
                    square.calculateArea();
                    // Presentación de resultados
                    System.out.println("Figura: " + square.getName() + "\nValor del área: " + square.getArea());
                    break;
                case 3:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del lado");
                    side = entrance.nextDouble();
                    System.out.println("Ingrese el valor de la altura");
                    height = entrance.nextDouble();
                    // Creación del objeto y uso del constructor
                    Rectangle rectangle = new Rectangle(name, side, height);
                    // Uso del método para calcular el área
                    rectangle.calculateArea();
                    // Presentación de resultados
                    System.out.println("Figura: " + rectangle.getName() + "\nValor del área: " + rectangle.getArea());
                    break;
                case 4:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre de la figura seleccionada");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el valor del radio");
                    radio = entrance.nextDouble();
                    // Creación del objeto y uso del constructor
                    Circle circle = new Circle(name, radio);
                    // Uso del método para calcular el área
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
