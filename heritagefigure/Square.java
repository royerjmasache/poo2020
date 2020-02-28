package heritagefigure;
// Clase derivada que hereda atributos de la superclase Figura
public class Square extends Figure {
    // Declaración de variable específica para la clase Square
    private double side;
    private double area;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método para calcular el área del cuadrado
     * @return
     */
    public double calculateArea(){
        setArea(side * side);
        return getArea();
    }

    /**
     * Método constructor para la clase Square
     * @param name
     * @param side
     */
    public Square(String name, double side){
        this.name = name;
        this.side = side;
    }


}
