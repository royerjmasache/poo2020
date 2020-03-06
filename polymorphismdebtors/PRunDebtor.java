package polymorphismdebtors;
import java.util.Scanner;
public class PRunDebtor {
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
            System.out.println("1- Calcular la deuda del Prestamo Personal");
            System.out.println("2- Calcular la deuda del Prestamo Hipotecario");
            System.out.println("3- Calcular la deua del Presmatio por un Automovil");
            System.out.println("Escribe una de las opciones");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    PPersonal prestamoPersonal = new PPersonal();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    prestamoPersonal.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    prestamoPersonal.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    prestamoPersonal.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital dado: ");
                    prestamoPersonal.setCapital(scan.nextDouble());
                    System.out.println("Tasa de interes del prestamo: ");
                    prestamoPersonal.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión para el pago: ");
                    scan.nextLine();
                    prestamoPersonal.setPlazo(scan.nextInt());
                    prestamoPersonal.calcularDeuda();
                    cadena2 += ""+prestamoPersonal.getNum_cli()+"\t\t\t"+prestamoPersonal.getNombre()+"\t\t\t\t"
                            +prestamoPersonal.getNum_cuenta()+"\t\t\t\t"+prestamoPersonal.getDeudas()+"\n";
                    break;
                case 2:
                    PMortgage prestamoHipotecario = new PMortgage();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    prestamoHipotecario.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    prestamoHipotecario.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    prestamoHipotecario.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital dado: ");
                    prestamoHipotecario.setCapital(scan.nextDouble());
                    System.out.println("Tasa de interes del prestamo: ");
                    prestamoHipotecario.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión para el pago: ");
                    scan.nextLine();
                    prestamoHipotecario.setPlazo(scan.nextInt());
                    prestamoHipotecario.calcularDeuda();
                    cadena2 += ""+prestamoHipotecario.getNum_cli()+"\t\t\t"+prestamoHipotecario.getNombre()+"\t\t\t\t"
                            +prestamoHipotecario.getNum_cuenta()+"\t\t\t\t"+prestamoHipotecario.getDeudas()+"\n";
                    break;

                case 3:
                    PCar prestamoAuto = new PCar();
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    prestamoAuto.setNum_cli(scan.nextLine());
                    System.out.println("Nombre del Cliente:");
                    prestamoAuto.setNombre(scan.nextLine());
                    System.out.println("Numero de Cuenta: ");
                    prestamoAuto.setNum_cuenta(scan.nextLine());
                    System.out.println("Capital dado: ");
                    prestamoAuto.setCapital(scan.nextDouble());
                    System.out.println("Tasa de interes del prestamo: ");
                    prestamoAuto.setTasa(scan.nextDouble());
                    System.out.println("Plazo de inversión para el pago: ");
                    scan.nextLine();
                    prestamoAuto.setPlazo(scan.nextInt());
                    prestamoAuto.calcularDeuda();
                    cadena2 += ""+prestamoAuto.getNum_cli()+"\t\t\t"+prestamoAuto.getNombre()+"\t\t\t\t"
                            +prestamoAuto.getNum_cuenta()+"\t\t\t\t"+prestamoAuto.getDeudas()+"\n";
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
