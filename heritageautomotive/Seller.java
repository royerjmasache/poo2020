package heritageautomotive;
// Clase derivada que hereda atributos de la clase Employee
public class Seller extends Employee {
    // Declaración de variables específicas para la clase Seller
    private double car;
    private int number;
    private double salary;
    private double biweeklySalary;
    int minimum = 320;

    // Métodos para actualizar y retornar la variable car
    public double getCar() {
        return car;
    }

    public void setCar(double car) {
        this.car = car;
    }

    // Métodos para actualizar y retornar la variable number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Métodos para actualizar y retornar la variable biweeklySalary
    public double getBiweeklySalary() {
        return biweeklySalary;
    }

    public void setBiweeklySalary(double biweeklySalary) {
        this.biweeklySalary = biweeklySalary;
    }

    // Métodos para actualizar y retonar la variable salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Método para calcular el valor del salario mensual
     * @return
     */
    public double calculateSalary(){
        salary = car * number;
        return salary;
    }

    /**
     * Método para calcular el valor del salario quincenal
     * @return
     */
    public double calculateBiweeklySalary(){
        biweeklySalary = minimum + (salary * 0.02);
        return biweeklySalary;
    }

    /**
     * Método constructor para la clase Seller
     * @param name
     * @param department
     * @param position
     * @param car
     * @param number
     */
    public Seller(String name, String department, String position, double car, int number){
        this.name = name;
        this.department = department;
        this.position = position;
        this.car = car;
        this.number = number;
    }
}
