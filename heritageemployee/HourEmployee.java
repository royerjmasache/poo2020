package heritageemployee;

public class HourEmployee extends Employee{
    // Declaración de variables para la clase HourEmployee
    private double hour;
    private double value;
    private double salary;

    /**
     * Método constructor para la clase HourEmployee
     * @param name
     * @param position
     * @param dependence
     * @param hour
     * @param value
     */
    public HourEmployee(String name, String position, String dependence, double hour, double value){
        this.name = name;
        this.position = position;
        this.dependence = dependence;
        this.hour = hour;
        this.value = value;

    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateSalary(double hour, double value){
        salary = hour *  value;
        return salary;
    }
}
