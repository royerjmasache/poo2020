package polymorphismautomotive;

public class PSeller extends PEmployee {
    private double precio;
    private int num_autos;
    private double salario_min;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNum_autos() {
        return num_autos;
    }

    public void setNum_autos(int num_autos) {
        this.num_autos = num_autos;
    }

    public double getSalario_min() {
        return salario_min;
    }

    public void setSalario_min(double salario_min) {
        this.salario_min = salario_min;
    }

    @Override
    public void sueldoQuincenal() {
        salario_min = 400;
        quincena = salario_min +((precio*num_autos)*0.2);
    }
}
