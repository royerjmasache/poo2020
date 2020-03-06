package objecttypedata;
// Importación de librerías
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    // Creación de método principal
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        int option = 0;
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        while(option != 3){
            // Creación del menú
            System.out.println("Menú de opciones\n1. Agregar nuevo nombre\n2. Presentar lista de nombres\n3. Salir");
            option = entrance.nextInt();
            // Limpieza del buffer
            entrance.nextLine();
            switch(option){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    name.add(entrance.nextLine());
                    break;
                case 2:
                    for (int a = 0; a < name.size(); a ++ ){
                        System.out.println(name.get(a));
                    }
                    break;
                case 3:

                    System.out.println("Gracias por usar nuestro programa");
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        }
    }
}
