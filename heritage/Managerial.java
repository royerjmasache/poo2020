package heritage;

public class Managerial extends Person{
    /**
     * Método constructor para la clase Managerial
     * @param name
     * @param identification
     * @param status
     * @param birth
     * @param dependence
     */
    public Managerial(String name, String identification, String status, String birth, String dependence){
        this.name = name;
        this.identification = identification;
        this.status = status;
        this.birth = birth;
        this.dependence = dependence;
    }
    private String dependence;

    public String getDependence() {
        return dependence;
    }

    public void setDependence(String dependence) {
        this.dependence = dependence;
    }
    public void manage(){
        System.out.println("Método para gestionar procesos");
    }
}

