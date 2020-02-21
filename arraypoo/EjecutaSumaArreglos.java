package intropoo.Disenopoo.arreglos_poo;
import java.util.Scanner;
public class EjecutaSumaArreglos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vector1 = new int [10];
        int [] vector2 = new int [10];
        SumaArreglos sumaArreglos = new SumaArreglos();
        for (int i = 0; i<vector1.length;i++){
            System.out.println("Ingrese valores Vector1 en posicion: "+i);
            vector1[i] = scan.nextInt();
            System.out.println("Ingrese valores Vector2 en posicion: "+i);
            vector2[i] = scan.nextInt();
        }
        sumaArreglos.setVector1(vector1);
        sumaArreglos.setVector2(vector2);

        System.out.println("Vector - 1");
        for (int i =0; i<vector1.length;i++){
            System.out.println(vector1[i]);
        }
        System.out.println("Vector - 2");
        for (int i =0; i<vector1.length;i++){
            System.out.println(vector2[i]);
        }
        System.out.println("Vector - 3");
        for (int i =0; i<vector1.length;i++){
            System.out.println(sumaArreglos.calcularSumaVectores());
        }
    }


}
