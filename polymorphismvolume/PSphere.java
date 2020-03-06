package polymorphismvolume;

public class PSphere extends PVolume {
    // Declaración de variables específicas para la clase Sphere
    private double radio;
    // Métodos para actualizar y retornar la variable radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculateVolume() {
        volume = ((Math.PI) * (radio * radio * radio)) * 4/3;
    }
}
