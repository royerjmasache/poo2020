package heritageautomotive;

/**
 * Clase principal (Superclase)
 */
public class Employee {
    // Variables globales para las clases derivadas
    protected String name;
    protected String department;
    protected String position;

    // Métodos para actualizar y retonar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos para actualizar y retonar la variable department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Métodos para actualizar y retonar la variable position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
