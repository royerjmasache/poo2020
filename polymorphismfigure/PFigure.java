package polymorphismfigure;

public abstract class PFigure {
    // Definición de variables
    protected String name;
    protected double area;

    // Métodos para actualizar y retornar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método para retornar la variable name
    public double getArea() {
        return area;
    }

    /**
     * Método abstracto que se implementará en las clases derivadas
     */
    public abstract void calculateArea();

}
