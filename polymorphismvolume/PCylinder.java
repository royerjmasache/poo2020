package polymorphismvolume;

public class PCylinder extends PVolume {
    // Declaración de variables específicas para la clase Cylinder
    private double radio;
    private double  height;
    // Métodos para actualizar y retornar la variable radio
    public double getRadio(double v) {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para actualizar y retornar la variable height
    public double getHeight(double v) {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        volume = (Math.PI) * (radio * radio) * (height);
    }
}
