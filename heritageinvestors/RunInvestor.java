package heritageinvestors;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class RunInvestor {
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
        String sReport = "";
        String pReport = "";
        String mReport = "";
        String result = "";
        int counter = 1;
        // Creación de reporte
        while(option){
            System.out.println("Ingrese el tipo de inversionista\n1. Cuenta ahorro\n2. Pagaré\n3. Cuenta Maestra");
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
                    System.out.println("Ingrese el valor del capital de inversión");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital invertida");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    Save save = new Save(number, name, account, capital, term);
                    // Acumulación de resultados
                    sReport = save.getNumber() + "\t\t\t\t\t\t\t" + save.getName() + "\t\t\t\t\t\t\t"
                            + save.getAccount() + "\t\t\t\t\t\t\t" + save.calculateInterest() + "\n";
                    result = result + sReport;
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
                    System.out.println("Ingrese el valor del capital de inversión");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital invertida");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    Pay pay = new Pay(number, name, account, capital, term);
                    // Acumulación de resultados
                    pReport = pay.getNumber() + "\t\t\t\t\t\t\t" + pay.getName() + "\t\t\t\t\t\t\t"
                            + pay.getAccount() + "\t\t\t\t\t\t\t" + pay.calculateInterest() + "\n";
                    result = result + pReport;
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
                    System.out.println("Ingrese el valor del capital de inversión");
                    capital = entrance.nextInt();
                    System.out.println("Ingrese el plazo para la capital invertida");
                    term = entrance.nextInt();
                    // Creación de objeto y eso del constructor
                    MasterAccount master = new MasterAccount(number, name, account, capital, term);
                    // Acumulación de resultados
                    mReport = master.getNumber() + "\t\t\t\t\t\t\t" + master.getName() + "\t\t\t\t\t\t\t"
                            + master.getAccount() + "\t\t\t\t\t\t\t" + master.calculateInterest() + "\n";
                    result = result + mReport;
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
        System.out.println("REPORTE DE INVERSIONES\nNo.Cliente\t\t\t\t\t\tNombre\t\t\t\t\t\tNo.Cuenta" +
                "\t\t\t\t\t\tInterés ganado\n" + result + "\nTotal: " + counter + " inversiones");
    }
}