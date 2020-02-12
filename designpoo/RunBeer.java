package designpoo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunBeer {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cerveza:");
        String name = entrance.nextLine();
        System.out.println("Ingrese el tipo de la cerveza:");
        String type = entrance.nextLine();
        System.out.println("Ingrese el valor de la cerveza");
        double price = entrance.nextDouble();
        System.out.println("Ingrese el la cantidad de unidades vendidas");
        int soldUnits = entrance.nextInt();
        // Creación de objeto
        Beer beer = new Beer(name, type, price, soldUnits);
        String information = beer.getInformation();
        System.out.println(information);



    }
}
