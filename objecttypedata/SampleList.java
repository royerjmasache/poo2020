package objecttypedata;
// Importación de librerías
import java.util.List;
import java.util.ArrayList;
public class SampleList {
    public static void main(String[] args) {
        // Creación de lista en Java para almacenar valores de tipo String
        List<String> college = new ArrayList<String>();
        // Uso de método add para añadir un valor a la lista
        college.add("UTPL");
        // Uso de método size para presentar el tamaño de la lista
        System.out.println("Tamaño de la lista: " + college.size());
        // Uso de método add
        college.add("UIDE");
        // Uso de método size
        System.out.println("Tamaño de la lista: " + college.size());
        // Uso de método add
        college.add("UNL");
        // Uso de método size
        System.out.println("Tamaño de la lista: " + college.size());
        // Uso de método remove para eliminar un valor de la lista
        college.remove(1);
        System.out.println("Tamaño de lista con valor eliminado: " + college.size());
        // Uso de método set para reemplazar valores
        college.set(1, "UIDE");
        // Método add para ingresar un valor en una posición determinada
        college.add(1, "UNL");
        // Ciclo repetitivo para recorrer lista y presentar valores
        // for (int a = 0; a < college.size(); a ++){
            // System.out.println(college.get(a));
        // }
        // Uso del foreach para recorrer la lista college
        System.out.println("Elementos de la lista");
        for(String counter: college){
            System.out.println(counter);
        }
    }
}
