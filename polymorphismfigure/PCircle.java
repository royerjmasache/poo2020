package polymorphismfigure;
import java.lang.Math;

public class PCircle extends PFigure{
    // Definición de variables específicas
    private double radio;
    // Método para actualizar el valor de la variable circle
    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public void calculateArea() {
        area = (Math.PI) * (radio * radio);
    }
}
