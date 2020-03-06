package polymorphismautomotive;

public class PAdministrative extends PEmployee {
    private double sueldo_men;

    public double getSueldo_men() {
        return sueldo_men;
    }

    public void setSueldo_men(double sueldo_men) {
        this.sueldo_men = sueldo_men;
    }
    @Override
    public void sueldoQuincenal() {
        quincena = sueldo_men/2;
    }
}
