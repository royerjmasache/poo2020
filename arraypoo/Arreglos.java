package intropoo.Disenopoo.arreglos_poo;

public class Arreglos {
    private int [] vectorA = new int [10];
    private int [] vectorB = new int [10];
    private int producto;


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int calcularSumatoriaProducto(){
        producto =0;
        for (int i = 0; i< vectorA.length; i++){
            producto = producto +(vectorA[i]+vectorB[i]);
        }
        return producto;
    }

}
