package intropoo.Disenopoo.arreglos_poo;
import java.util.Scanner;
public class EjecutaArreglo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vectorA = new int [2];
        int [] vectorB = new int [2];
        Arreglos arreglos = new Arreglos();
        for(int i = 0;i<vectorA.length;i++ ){
            System.out.println("Ingrese valores VectorA en posicion: "+i);
            vectorA[i]= scan.nextInt();
            System.out.println("Ingrese valores VectorB en posicion: " +i);
            vectorB[i] = scan.nextInt();
            arreglos.setVectorA(vectorA);
            arreglos.setVectorB(vectorB);
        }
        for (int i =0; i<vectorA.length;i++){
            System.out.println(vectorA[i]);
            System.out.println(vectorB[i]);
        }

        System.out.println("La suma de productos de matrices es: "+arreglos.calcularSumatoriaProducto());

    }
}
