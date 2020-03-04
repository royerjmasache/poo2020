package heritagedebtors;

import intropoo.Person;

import java.util.Scanner;

public class RunDebtor {
    // Método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String name;
        int account;
        int number;
        double capital;
        double interest;
        double term;
        boolean option = true;
        int type;
        int selection;
        String pReport = "";
        String mReport = "";
        String cReport = "";
        String result = "";
        int counter = 1;
        // Creación de reporte
        while(option){
            System.out.println("Ingrese el tipo de préstamo\n1. Personal\n2. Hipotecario\n3. Automóvil");
            type = entrance.nextInt();
            switch (type){
                case 1:
                    System.out.println("Ingrese el número del cliente");
                    number = entrance.nextInt();
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre del cliente");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el número de cuenta del cliente");
                    account = entrance.nextInt();
                    System.out.println("Ingrese el valor del capital prestado");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital prestada");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    Personal personal = new Personal(number, name, account, capital, term);
                    // Acumulación de resultados
                    pReport = personal.getNumber() + "\t\t\t\t\t\t\t" + personal.getName() + "\t\t\t\t\t\t\t"
                            + personal.getAccount() + "\t\t\t\t\t\t\t" + personal.calculateInterest() + "\n";
                    result = result + pReport;
                    break;
                case 2:
                    System.out.println("Ingrese el número del cliente");
                    number = entrance.nextInt();
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre del cliente");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el número de cuenta del cliente");
                    account = entrance.nextInt();
                    System.out.println("Ingrese el valor del capital prestada");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital prestada");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    Mortgage mortgage = new Mortgage(number, name, account, capital, term);
                    // Acumulación de resultados
                    mReport = mortgage.getNumber() + "\t\t\t\t\t\t\t" + mortgage.getName() + "\t\t\t\t\t\t\t"
                            + mortgage.getAccount() + "\t\t\t\t\t\t\t" + mortgage.calculateInterest() + "\n";
                    result = result + mReport;
                    break;
                case 3:
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el número del cliente");
                    number = entrance.nextInt();
                    // Limpieza del buffer
                    entrance.nextLine();
                    System.out.println("Ingrese el nombre del cliente");
                    name = entrance.nextLine();
                    System.out.println("Ingrese el número de cuenta del cliente");
                    account = entrance.nextInt();
                    System.out.println("Ingrese el valor del capital prestada");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital prestada");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    Car car = new Car(number, name, account, capital, term);
                    // Acumulación de resultados
                    cReport = car.getNumber() + "\t\t\t\t\t\t\t" + car.getName() + "\t\t\t\t\t\t\t"
                            + car.getAccount() + "\t\t\t\t\t\t\t" + car.calculateInterest() + "\n";
                    result = result + cReport;
                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
            // Incremento del contador
            counter = counter + 1;
            System.out.println("Desea seguir ingresando datos?\n1. Sí\n2. No");
            selection = entrance.nextInt();
            if (selection == 2) {
                option = false;
            }
        }
        // Presntación de reporte
        counter = counter - 1;
        System.out.println("REPORTE DE CLIENTES DEUDORES\nNo.Cliente\t\t\t\t\t\tNombre\t\t\t\t\t\tNo.Cuenta" +
                "\t\t\t\t\t\tInterés por pagar\n" + result + "\nTotal: " + counter + " clientes");
    }
}
