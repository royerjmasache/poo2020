package objecttypedata;

public class Student {
    // Declaración de variables
    private String name;
    private String identification;
    private int age;
    private String career;
    private String mail;

    // Métodos para actualizar y retornar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos para actualizar y retornar la variable identification
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    // Métodos para actualizar y retornar la variable age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Métodos para actualizar y retornar la variable career
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    // Métodos para actualizar y retornar la variable mail
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // Sobrecarga de constructores

    /**
     * Método constructor para la clase Student
     */
    public Student(){
    }

    /**
     * Método constructor para la clase Student
     * @param name
     * @param identification
     * @param age
     * @param career
     * @param mail
     */
    public Student(String name, String identification, int age, String career, String mail) {
        this.name = name;
        this.identification = identification;
        this.age = age;
        this.career = career;
        this.mail = mail;
    }

    /**
     * Método constructor para la clase Student
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }
}
