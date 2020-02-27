package heritage;

/**
 * Clase principal (Superclase)
 */

public class Person {

    // Atributos comunes para todas las clases
    protected String name;
    protected String identification;
    protected String status;
    protected String birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
