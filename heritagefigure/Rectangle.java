package heritagefigure;
// Clase derivada que hereda atributos de la superclase Figure
public class Rectangle extends Figure{
    // Declaración de variables específicas para la clase Rectangle
    private double side;
    private double height;
    private double area;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
     * Método para calcular el área del rectángulo
     * @return
     */
    public double calculateArea(){
        area = side * height;
        return area;
    }

    /**
     * Método constructor para la clase Rectangle
     * @param name
     * @param side
     * @param height
     */
    public Rectangle(String name, double side, double height){
        this.name = name;
        this.side = side;
        this.height = height;
    }
}
