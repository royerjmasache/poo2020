package polymorphismautomotive;

import java.util.Scanner;
public class RunPEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena2 = "" ;
        int opcion = 0;
        System.out.println("CALCULO DE INVERSIONISTAS");
        String cadena = "REPORTE DE NOMINA QUINCENAL\nRFC\t\t\t\t\tNOMBRE\t\t\tDEPARTAMENTO\t\t\t\tPUESTO\t\t\t\tSUELDO QUINCENAL\n";
        cadena += "----------------------------------------------------------------------------------------------------------------";
        boolean bandera = true;
        while(bandera == true){
            // Menú para ingreso de datos
            System.out.println("1- Empleados Administrativos");
            System.out.println("2- Empleados de Mecanica");
            System.out.println("3- Empleados de Ventas");
            System.out.println("Escribe una de las opciones");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    scan.nextLine();
                    PAdministrative empAdmvo = new PAdministrative();
                    System.out.println("Ingrese nombre del empleado");
                    empAdmvo.setNombre(scan.nextLine());
                    System.out.println("Ingrese departamento del empleado");
                    empAdmvo.setDepart(scan.nextLine());
                    System.out.println("Ingrese puesto del empleado");
                    empAdmvo.setPuesto(scan.nextLine());
                    System.out.println("Ingrese sueldo mensual del empleado");
                    empAdmvo.setSueldo_men(scan.nextDouble());
                    empAdmvo.sueldoQuincenal();
                    cadena2 +="Registro Federal\t"+empAdmvo.getNombre()+"\t\t\t"+empAdmvo.getDepart()+"\t\t\t\t"
                            +empAdmvo.getPuesto()+"\t\t\t\t\t"+empAdmvo.getQuincena()+"\n";

                    break;
                case 2:
                    scan.nextLine();
                    PMechanical empMecanico = new PMechanical();
                    System.out.println("Ingrese nombre del empleado");
                    empMecanico.setNombre(scan.nextLine());
                    System.out.println("Ingrese departamento del empleado");
                    empMecanico.setDepart(scan.nextLine());
                    System.out.println("Ingrese puesto del empleado");
                    empMecanico.setPuesto(scan.nextLine());
                    System.out.println("Ingrese el precio");
                    empMecanico.setPrecio(scan.nextDouble());
                    scan.nextLine();
                    System.out.println("Ingrese numero e trabajos realizados");
                    empMecanico.setTrabajos(scan.nextInt());
                    empMecanico.sueldoQuincenal();
                    cadena2 +="Registro Federal\t"+empMecanico.getNombre()+"\t\t\t"+empMecanico.getDepart()+"\t\t\t\t\t"
                            +empMecanico.getPuesto()+"\t\t\t\t\t"+empMecanico.getQuincena()+"\n";

                    break;

                case 3:
                    scan.nextLine();
                    PSeller empVendedor = new PSeller();
                    System.out.println("Ingrese nombre del empleado");
                    empVendedor.setNombre(scan.nextLine());
                    System.out.println("Ingrese departamento del empleado");
                    empVendedor.setDepart(scan.nextLine());
                    System.out.println("Ingrese puesto del empleado");
                    empVendedor.setPuesto(scan.nextLine());
                    System.out.println("Ingrese numero de precio de los autos");
                    empVendedor.setPrecio(scan.nextDouble());
                    System.out.println("Ingrese el numero de autos vendidos");
                    empVendedor.setNum_autos(scan.nextInt());
                    empVendedor.sueldoQuincenal();
                    cadena2 +="Registro Federal\t"+empVendedor.getNombre()+"\t\t\t"+empVendedor.getDepart()+"\t\t\t\t\t\t"
                            +empVendedor.getPuesto()+"\t\t\t\t\t"+empVendedor.getQuincena()+"\n";

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
