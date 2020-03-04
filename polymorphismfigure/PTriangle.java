package polymorphismfigure;

public class PTriangle extends PFigure {
    // Definición de variables específicas
    private double base;
    private double height;
    // Método para actualizar la variable base
    public void setBase(double base){
        this.base = base;
    }
    // Método para actualizar la variable height
    public void setHeight(double height){
        this.height = height;
    }

    // Extensión de los métodos de la superclase
    @Override
    public void calculateArea() {
        area = (base * height) / 2;
    }
}
