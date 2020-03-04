package heritageautomotive;
// Clase derivada que hereda atributos de la clase Employee
public class Administrative extends Employee {
    // Declaración de variables específicas para la clase Administrative
    private double salary;
    private double biweeklySalary;

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
     * Método para calcular el sueldo quincenal
     * @return
     */
    public double calculateBiweeklySalary(){
        biweeklySalary = salary / 2;
        return biweeklySalary;
    }

    public Administrative(String name, String department, String position, double salary){
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
}
