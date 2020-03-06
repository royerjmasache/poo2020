package polymorphismdebtors;

public class PMortgage extends PDebtor {
    private String num_cli;
    private String nombre;
    private String num_cuenta;
    private double capital;
    private double tasa;
    private int plazo;

    public String getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(String num_cli) {
        this.num_cli = num_cli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    @Override
    public void calcularDeuda() {
        deudas = (capital)*(tasa)*(plazo);
    }
}
