package polymorphisminvestors;

public abstract class PInvestor {
    protected double intereses;
    public abstract  void calcularIntereses();

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
}
