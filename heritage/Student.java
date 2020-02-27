package heritage;

/**
 * Clase que hereda todos los tributos y métodos de la clase Person
 */
public class Student extends Person {
    /**
     * Método constructor para la clase Student
     * @param name
     * @param career
     * @param identification
     * @param status
     * @param birth
     */
    public Student(String name, String career, String identification, String status, String birth){
        this.career = career;
        this.name = name;
        this.identification = identification;
        this.status = status;
        this.birth = birth;

    }
    private String career;

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    public void enroll(){
        System.out.println("Método para matricular al estudiante");
    }
    public void learn(){
        System.out.println("Método para aprender");
    }
}
