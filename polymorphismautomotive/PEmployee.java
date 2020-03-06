package polymorphismautomotive;

public abstract class PEmployee {
    protected String nombre;
    protected String depart;
    protected String puesto;
    protected  double quincena;

    /**
     * Metodo abstracto para todas las clases
     * @return
     */
    public abstract void sueldoQuincenal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }
}
