package polymorphisminvestors;
import java.util.Scanner;
public class RunPInvestor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena2 = "" ;
        int opcion = 0;
        System.out.println("CALCULO DE INVERSIONISTAS");
        String cadena = "REPORTE DE INVERSIONES\nNO.CLIENTE\t\t\tNOMBRE\t\t\t\tNO.CUENTA\t\t\t\tINTERES GANADO\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean bandera = true;
        while(bandera == true){
            // Menú para ingreso de datos
            System.out.println("1- Calcular el interes de la Cuenta de Ahorro");
            System.out.println("2- Calcular el interes de la Cuenta de Pagaré");
            System.out.println("3- Calcular el interes de la Cuenta  Maestra");
            System.out.println("Escribe una de las opciones");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    PSave cuentaAhorro = new PSave();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    cuentaAhorro.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    cuentaAhorro.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    cuentaAhorro.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital invertido: ");
                    cuentaAhorro.setCapital(scan.nextDouble());
                    System.out.println("Tasa de Interes: ");
                    cuentaAhorro.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    cuentaAhorro.setPlazo(scan.nextInt());
                    cuentaAhorro.calcularIntereses();
                    cadena2 += ""+cuentaAhorro.getNum_cli()+"\t\t\t"+cuentaAhorro.getNombre()+"\t\t\t\t"
                            +cuentaAhorro.getNum_cuenta()+"\t\t\t\t"+cuentaAhorro.getIntereses()+"\n";
                    break;
                case 2:
                    PPay pagare = new PPay();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    pagare.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    pagare.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    pagare.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital invertido: ");
                    pagare.setCapital(scan.nextDouble());
                    System.out.println("Tasa de Interes: ");
                    pagare.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    pagare.setPlazo(scan.nextInt());
                    pagare.calcularIntereses();
                    cadena2 += ""+pagare.getNum_cli()+"\t\t\t"+pagare.getNombre()+"\t\t\t\t"
                            +pagare.getNum_cuenta()+"\t\t\t\t"+pagare.getIntereses()+"\n";


                    break;

                case 3:
                    PMaster cuentaMaestra = new PMaster();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    cuentaMaestra.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    cuentaMaestra.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    cuentaMaestra.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital invertido: ");
                    cuentaMaestra.setCapital(scan.nextDouble());
                    System.out.println("Tasa de Interes: ");
                    cuentaMaestra.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    cuentaMaestra.setPlazo(scan.nextInt());
                    cuentaMaestra.calcularIntereses();
                    cadena2 += ""+cuentaMaestra.getNum_cli()+"\t\t\t"+cuentaMaestra.getNombre()+"\t\t\t\t"
                            +cuentaMaestra.getNum_cuenta()+"\t\t\t\t"+cuentaMaestra.getIntereses()+"\n";


                    break;
            }
            scan.nextLine();
            System.out.println("Si desea seguir calculando a los inversionistas presion |Si|");
            System.out.println("Si desea cerrar el proceso presione |No|");
            String cancelar = scan.nextLine().toUpperCase();
            if (cancelar.equals("NO")){
                System.out.println(cadena+"\n" + cadena2 );
                opcion = 5;
                bandera = false;
            }else{
                System.out.println();
                opcion = 4;

            }

        }
    }
}
