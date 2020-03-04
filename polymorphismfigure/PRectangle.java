package polymorphismfigure;

public class PRectangle extends PFigure{
    // Definición de variables específicas
    private double base;
    private double height;
    // Método para actualizar el valor de la variable base
    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    // Método para actualizar el valor de la variable height
    @Override
    public void calculateArea(){
        area = base * height;
    }
}
