package polymorphismvolume;

public abstract class PVolume {
    // Definición de variables
    protected String name;
    protected double volume;

    // Métodos para actualizar y retornar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos para retornar la variable volume
    public double getVolume() {
        return volume;
    }

    /**
     * Método abstracto que se implementará en las clases derivadas
     */
    public abstract void calculateVolume();
}
