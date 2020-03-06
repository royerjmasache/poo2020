package polymorphismvolume;

public class PCube extends PVolume {
    // Declaración de variables específicas para la clase Cube
    private double edge;

    // Métodos para actualizar y retornar la variable edge
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void calculateVolume(){
        volume = edge * edge * edge;
    }
}
