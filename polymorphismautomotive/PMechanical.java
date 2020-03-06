package polymorphismautomotive;

public class PMechanical extends PEmployee {
    private int trabajos;
    private double precio;
    private double total;

    public int getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(int trabajos) {
        this.trabajos = trabajos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void sueldoQuincenal() {
        total = precio*trabajos;
        quincena = total*0.4;
    }
}
