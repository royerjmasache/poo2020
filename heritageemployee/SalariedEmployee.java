package heritageemployee;

public class SalariedEmployee extends Employee{
    // Declaración de variables para la clase SalariedEmployee
    private double fixedValue;

    /**
     * Método constructor para la clase SalariedEmployee
     * @param name
     * @param position
     * @param dependence
     * @param fixedValue
     */
    public SalariedEmployee(String name, String position, String dependence, double fixedValue){
        this.name = name;
        this.position = position;
        this.dependence = dependence;
        this.fixedValue = fixedValue;
    }

    public double getFixedValue() {
        return fixedValue;
    }

    public void setFixedValue(double fixedValue) {
        this.fixedValue = fixedValue;
    }
}
