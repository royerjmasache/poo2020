package intropoo.Disenopoo.arreglos_poo;

public class SumaArreglos {
    private int [] vector1 = new int [10];
    private int [] vector2 = new int [10];
    private int [] vector3 = new int [10];
    private  int i;

    public int[] getVector1() {
        return vector1;
    }
    public void setVector1(int[] vector1) {
        this.vector1 = vector1;
    }
    public int[] getVector2() {
        return vector2;
    }
    public void setVector2(int[] vector2) {
        this.vector2 = vector2;
    }
    public int[] getVector3() {
        return vector3;
    }
    public int calcularSumaVectores(){
            vector3[i]= vector1[i]+vector2[i];
        return vector3[i];
    }
}
