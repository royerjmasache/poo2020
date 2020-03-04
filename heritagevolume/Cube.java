package heritagevolume;
// Clase derivada que hereda atributos de la superclase Volume
public class Cube extends Volume {
    // Declaración de variables específicas para la clase Cube
    private double edge;
    private double volume;

    // Métodos para actualizar y retornar la variable edge
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    // Métodos para actualizar y retonar la variable volume
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Método para calcular el volumen del cubo
     * @return
     */
    public double calculateVolume(){
        volume = edge * edge * edge;
        return volume;
    }

    /**
     * Método constructor para la clase Cube
     * @param name
     * @param edge
     */
    public Cube(String name, double edge){
        this.name = name;
        this.edge = edge;
    }
}
