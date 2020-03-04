package heritagevolume;
// Importación de librería Math
import java.lang.Math;
// Clase derivada que hereda atributos de la superclase Volume
public class Sphere extends Volume {
    // Declaración de variables específicas para la clase Sphere
    private double radio;
    private double volume;

    // Métodos para actualizar y retornar la variable radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para actualizar y retornar la variable volume
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Método para calcular el volume de la esfera
     * @return
     */
    public double calculateVolume(){
        volume = ((Math.PI) * (radio * radio * radio)) * 4/3;
        return volume;
    }

    /**
     * Método constructor para la clase Sphere
     * @param name
     * @param radio
     */
    public Sphere(String name, double radio){
        this.name = name;
        this.radio = radio;
    }
}
