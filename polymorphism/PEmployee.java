package polymorphism;

public abstract class PEmployee {
    // Definición de variables
    protected String name;
    protected String department;
    protected String position;
    protected double salary;

    // Métodos para actualizar y retornar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos para actualizar y retornar la variable department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Métodos para actualizar y retornar la variable position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary(){
        return salary;
    }
    /**
     * Método abstracto que se implementará en las clases derivadas
     */
    public abstract void calculateBiweekly();
}
