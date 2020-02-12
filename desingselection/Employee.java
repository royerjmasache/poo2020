package desingselection;

public class Employee {
    // Declaración de variables
    private String name;
    private double hours;
    private double value;
    private double salary;

    /**
     * Métodos para actualizar y retornar el nombre
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Métodos para actualizar y la hora
     * @return
     */
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    /**
     * Métodos para actualizar y retornar la cuota
     * @return
     */
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    /**
     * Métodos para actualizar y retornar el sueldo
     * @return
     */
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Método para calcular el sueldo
     * @return
     */
    public double calculateSalary() {
        if (hours <= 40) {
            salary = hours * value;
        } else {
            salary = (40 * value) + ((hours - 40) * (value * 2));
        }
        return salary;
    }
}
