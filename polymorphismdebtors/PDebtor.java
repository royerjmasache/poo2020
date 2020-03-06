package polymorphismdebtors;

public abstract class PDebtor {
    protected double deudas;
    public abstract void calcularDeuda();

    public double getDeudas() {
        return deudas;
    }

    public void setDeudas(double deudas) {
        this.deudas = deudas;
    }
}
