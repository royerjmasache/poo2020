package arrayshomeworkpoo;

import java.security.PublicKey;

public class Converter {
    // Declaración de variables
    private String binary;
    private int summation;

    /**
     * Métodos para actualizar y retonar el valor de binary
     * @return
     */
    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * Métodos para actualizar y retonar el valor de summation
     * @return
     */
    public int getSummation() {
        return summation;
    }

    public void setSummation(int summation) {
        this.summation = summation;
    }

    /**
     * Método constructor para la clase Converter
     * @param binary
     */
    public Converter(String binary){
        this.binary = binary;
    }

    /**
     * Método para calcular el valor decimal
     */
    public void calculateDecimal(){
        int newBinary = Integer.parseInt(binary);
        // Arreglo que almacena los valores separados
        int[] arrayB = new int[6];
        // Creación de contador
        int count = 5;
        // Ciclo repetitivo para almacenar los datos
        for (int a = 0; a < arrayB.length; a ++){
            // Fórmula para convertir el valor en decimal
            arrayB[a] = (int)((newBinary/Math.pow(10, a)) % 10);
            // Decremento del contador
            count--;
        }
        // Asignación del contador
        count = 5;
        for (int b = 0; b < arrayB.length; b ++){
            // Sumatoria
            summation = (int) (summation + (arrayB[b] * Math.pow(2, count)));
            // Decremento del contador
            count--;
        }
    }
    public void getDecimal(){
        // Presentación de resultados
        System.out.println("El valor en binario de " + binary + " es de " + getSummation()
        + " en decimal");
    }
}
