package objecttypedata;
// Importación de librerías
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleList {
    // Método principal
    public static void main(String[] args) {
        // Creación de lista
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        // Declaración de variables
        boolean flag = true;
        int option;
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        System.out.println("Sistema de ingreso vehicular");
        do {
            System.out.println("1. Almacenar nuevo vehículo\n2. Presentar vehículo/s\n3. Salir");
            option = entrance.nextInt();
            // Limpieza del buffer
            entrance.nextLine();
            switch (option){
                case 1:
                    Vehicle vehicle = new Vehicle();
                    System.out.println("Ingrese la placa del vehículo");
                    vehicle.setPlate(entrance.nextLine());
                    System.out.println("Ingrese la marca del vehículo");
                    vehicle.setBrand(entrance.nextLine());
                    System.out.println("Ingrese el año del vehículo");
                    vehicle.setYear(entrance.nextInt());
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el modelo del vehículo");
                    vehicle.setModel(entrance.nextLine());
                    System.out.println("Ingrese el color del vehículo");
                    vehicle.setColor(entrance.nextLine());
                    System.out.println("Ingrese el ciclindraje del vehículo");
                    vehicle.setCylindrical(entrance.nextInt());
                    // Agregamos objeto vehículo a la lista
                    vehicles.add(vehicle);
                    break;
                case 2:
                    // Presentación de vehículos
                    // System.out.println("Plate\tBrand\tCylindrical");
                    // Ciclo repetitivo foreach para recorrer la lista
                    for (Vehicle counter: vehicles) {
                        System.out.println("*");
                        System.out.println("Plate: " + counter.getPlate());
                        System.out.println("Brand: " + counter.getBrand());
                        System.out.println("Year: " + counter.getYear());
                        System.out.println("Model: " + counter.getModel());
                        System.out.println("Color: " + counter.getColor());
                        System.out.println("Cylindrical: " + counter.getCylindrical());
                        System.out.println("*");
                        // System.out.println(counter.getPlate() + "\t" + counter.getBrand() + "\t"
                                // + counter.getCylindrical());
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
