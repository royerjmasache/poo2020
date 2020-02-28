package heritagefigure;

// Clase derivada que hereda atributos de la superclase Figure
public class Triangle extends Figure{
    // Declaración de variables específicas para la clase Triangle
    private double base;
    private double height;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método para calcular el área del triángulo
     * @return
     */
    public double calculateArea(){
        area = (base * height) / 2;
        return area;
    }

    /**
     * Método constructor para la clase Triangle
     * @param name
     * @param base
     * @param height
     */
    public Triangle(String name, double base, double height){
        this.name = name;
        this.base = base;
        this.height = height;
    }
}
