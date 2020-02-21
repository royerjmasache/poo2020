package matrixpoo;

public class Array {
    // Declaración de variables
    private int[][] arrayA = new int[3][3];
    private int[][] arrayB = new int[3][3];
    private int[][] arrayC = new int[3][3];

    /**
     * Método constructor para la clase Array
     * @param arrayA
     * @param arrayB
     */
    public Array(int[][] arrayA, int[][] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    public int[][] getArrayA() {
        return arrayA;
    }

    public void setArrayA(int[][] arrayA) {
        this.arrayA = arrayA;
    }

    public int[][] getArrayB() {
        return arrayB;
    }

    public void setArrayB(int[][] arrayB) {
        this.arrayB = arrayB;
    }

    public int[][] getArrayC() {
        return arrayC;
    }

    public void setArrayC(int[][] arrayC) {
        this.arrayC = arrayC;
    }
    public int[][] calculateSum(){
        for (int a = 0; a < arrayA.length; a ++){
            for(int b = 0; b < arrayA.length; b ++){
                arrayC[a][b] = arrayA[a][b] + arrayB[a][b];
            }
        }
        return arrayC;
    }

    public void getResult(int array[][]){
        for (int a = 0; a < array.length; a ++){
            for (int b = 0; b < array.length; b ++ ){
                System.out.print("[" + array[a][b] + "]" + " ");
            }
            System.out.println(" ");
        }
    }
}
