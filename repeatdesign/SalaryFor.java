package repeatdesign;

public class SalaryFor {
    // Declaración de variables
    private String name;
    private double hours;
    private double value;
    private double salary;

    /**
     * Métodos para retornar y actualizar name
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Métodos para retornar y actualizar hours
     * @return
     */
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Métodos para retonar y actualizar value
     * @return
     */
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Métodos para retornar y actualizar salary
     * @return
     */
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Método para calcular el salario
     */
    public void calculateSalary() {
        if (hours <= 40) {
            salary = hours * value;
        } else {
            salary = (40 * value) + ((hours - 40) * (value * 2));
        }
    }
    public SalaryFor(String name, double hours, double value){
        this.name = name;
        this.hours = hours;
        this.value = value;
    }

}
