package polymorphismfigure;

public class PSquare extends PFigure{
    // Definición de variables específicas
    private double side;
    // Método para actualizar el valor de la variable side
    public void setSide(double side){
        this.side = side;
    }
    // Extensión del método para calcular el área de la superclase
    @Override
    public void calculateArea(){
        area = (side * side);
    }
}
