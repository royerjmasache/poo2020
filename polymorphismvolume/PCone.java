package polymorphismvolume;

import java.lang.Math;
public  class PCone extends PVolume {
    private double radio;
    private double height;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateVolume(){
        volume = ((Math.PI) * (radio * radio) * (height)) * 1/3;
    }
}
