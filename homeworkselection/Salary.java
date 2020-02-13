package homeworkselection;

public class Salary {
    // declaracion de variables globales
    private String name;
    private int hours;
    private double value;
    private double salary;

    /**
     * Constructor de la clase Sueldo
     */
    public Salary(String name, int hours, double value){
        this.setName(name);
        this.setHours(hours);
        this.setValue(value);
    }

    /**
     * Métodos para actualizar y retonar el valor de name
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Métodos para actualizar y retonar el valor de hours
     * @return
     */
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Métodos para actualizar y retonar el valor de value
     * @return
     */
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Método para retonar el valor de salary
     * @return
     */
    public double getSalary() {
        return salary;
    }

    // Metodo para calcular el valor de salary
    public void calculateSalary(){
        // Estructuras if - else para evaluar la condición
        if(hours <= 40){
            salary = hours * value;
        } else {
            if (hours <= 50) {
                salary = (40 * hours) + ((hours - 40) * (value * 2));
            } else {
                salary = ((40 * value) + (10 * value * 2)) + ((hours - 50) + (value * 3));
            }
        }
    }
}

