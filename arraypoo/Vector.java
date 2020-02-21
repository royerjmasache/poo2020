package arraypoo;

public class Vector {
    // Declaración de variables
    private int [] vectorA = new int [10];
    private int [] vectorB = new int [10];
    private int product;

    /**
     * Métodos para actualizar y retornar los valores del vector A
     * @return
     */
    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    /**
     * Métodos para actualizar y retornar los valores del vector B
     * @return
     */
    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    /**
     * Método para calcular el valor de la sumatoria de los productos
     * @return
     */
    public int calculateProduct(){
        product = 0;
        for (int a = 0; a < vectorA.length; a++){
            product = product + (vectorA[a] + vectorB[a]);
        }
        return product;
    }
}
