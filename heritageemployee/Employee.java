package heritageemployee;

/**
 * Clase Principal (Superclase)
 */

public class Employee {
    // Atributos comunes para todas las clases
    protected String name;
    protected String position;
    protected String dependence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDependence() {
        return dependence;
    }

    public void setDependence(String dependence) {
        this.dependence = dependence;
    }
}
