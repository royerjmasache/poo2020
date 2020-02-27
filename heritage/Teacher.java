package heritage;

public class Teacher extends Person{
    /**
     * Método constructor para la clase Teacher
     * @param name
     * @param identification
     * @param status
     * @param birth
     * @param area
     */
    public Teacher(String name, String identification, String status, String birth, String area){
        this.name = name;
        this.identification = identification;
        this.status = status;
        this.birth = birth;
        this.area = area;

    }
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void teach(){
        System.out.println("Método para enseñar");
    }
    public void qualify(){
        System.out.println("Método para calificar");
    }

}
