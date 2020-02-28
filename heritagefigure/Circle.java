package heritagefigure;
// Importación de librería Math
import java.lang.Math;
// Clase derivada que hereda atributos de la superclase Figure
public class Circle extends Figure{
    // Declaración de variables específicas para la clase Circle
    private double radio;
    private double area;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método para calcular el área del círculo
     * @return
     */
    public double calculateArea(){
        area = (Math.PI * (radio * radio));
        return area;
    }

    /**
     * Método constructor para la clase Circle
     * @param name
     * @param radio
     */
    public Circle(String name, double radio){
        this.name = name;
        this.radio = radio;
    }
}
