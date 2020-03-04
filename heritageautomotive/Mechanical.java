package heritageautomotive;
// Clase derivada que hereda atributos de la clase Employee
public class Mechanical extends Employee {
    // Declaración de variables específicas para la clase Mechanical
    private double value;
    private int number;
    private double salary;
    private double biweeklySalary;

    // Métodos para actualizar y retornar la variable value
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Métodos para actualizar y retornar la variable number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Métodos para actualizar y retornar la variable salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Métodos para actualizar y retornar la variable biweeklySalary
    public double getBiweeklySalary() {
        return biweeklySalary;
    }

    public void setBiweeklySalary(double biweeklySalary) {
        this.biweeklySalary = biweeklySalary;
    }

    /**
     * Método para calcular el salario quincenal
     * @return
     */
    public double calculateSalary(){
        salary = value * number;
        return salary;
    }

    public double calculateBiweeklySalary(){
        biweeklySalary = salary * 0.04;
        return biweeklySalary;
    }

    /**
     * Método constructor para la clase Mechanical
     * @param name
     * @param department
     * @param position
     * @param value
     * @param number
     */
    public Mechanical(String name, String department, String position, double value, int number){
        this.name = name;
        this.department = department;
        this.position = position;
        this.value = value;
        this.number = number;
    }
}
