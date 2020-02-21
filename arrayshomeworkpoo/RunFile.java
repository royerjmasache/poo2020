package arrayshomeworkpoo;

import java.util.Scanner;

public class RunFile {
    // Creación de método principal
    public static void main(String[] args) {
        // Creación de objeto Scanner
        Scanner entrance = new Scanner(System.in);
        // Declaración de variables
        String[] name = new String[5];
        int[] age = new int[5];
        String[] college = new String[5];
        String[] mobile = new String[5];
        // Ciclo repetitivo para recorrer los arreglos y almacenar resultados
        for(int a = 0; a < name.length; a ++){
            System.out.println("Ingrese el nombre del estudiante " + (a + 1));
            name[a] = entrance.nextLine();
            System.out.println("Ingrese la edad del estudiante ");
            age[a] = entrance.nextInt();
            // Limpieza del buffer
            entrance.nextLine();
            System.out.println("Ingrese el nombre de la universidad del estudiante ");
            college[a] = entrance.nextLine();
            System.out.println("Ingrese el número de celular del estudiante");
            mobile[a] = entrance.nextLine();
        }
        // Creación de objeto
        File file = new File(name, age, college, mobile);
        // Presentación de resultados finales
        file.studentFile();
    }
}
