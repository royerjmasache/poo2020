package heritagevolume;
// Importación de librería Math
import java.lang.Math;
// Clase derivada que hereda atributos de la superclase Volume
public class Cone extends Volume {
    // Declaración de variables específicas para la clase Cone
    private double radio;
    private double height;
    private double volume;

    // Métodos para actualizar y retornar la variable radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para actualizar y retornar la variable height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Métodos para actualizar y retornar la variable volume
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Método para calcular el volumen del cono
     * @return
     */
    public double calculateVolume(){
        volume = ((Math.PI) * (radio * radio) * (height)) * 1/3;
        return volume;
    }

    /**
     * Método para constructor para la clase Cone
     * @param name
     * @param radio
     * @param height
     */
    public Cone(String name, double radio, double height){
        this.name = name;
        this.radio = radio;
        this.height = height;
    }
}
