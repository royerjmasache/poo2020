package arrayshomeworkpoo;

public class File {
    // Declaración de variables
    private String[] name = new String[5];
    private int[] age = new int[5];
    private String[] college = new String[5];
    private String[] mobile = new String[5];

    /**
     * Métodos para actualizar y retornar el arreglo name
     * @return
     */
    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    /**
     * Métodos para actualizar y retornar el arreglo age
     * @return
     */
    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public String[] getCollege() {
        return college;
    }

    /**
     * Métodos para actualizar y retornar el arreglo college
     * @param college
     */
    public void setCollege(String[] college) {
        this.college = college;
    }

    /**
     * Métodos para actualizar y retornar el arreglo mobile
     * @return
     */
    public String[] getMobile() {
        return mobile;
    }

    public void setMobile(String[] mobile) {
        this.mobile = mobile;
    }

    /**
     * Método constructor para la clase File
     * @param name
     * @param age
     * @param college
     * @param mobile
     */
    public File (String name[], int age[], String college[], String mobile[]){
        this.name = name;
        this.age = age;
        this.college = college;
        this.mobile = mobile;
    }

    /**
     * Método para presentar las fichas de datos de los estudiantes
     */
    public void studentFile(){
        // Ciclo repetitivo para presentar los datos de cada estudiante
        for (int a = 0; a < name.length; a ++){
            // Presentación de resultados
            System.out.println("Name: " + name[a] + "\nAge: " + age[a]
            + "\nCollege: " + college[a] + "\nMobile: " + mobile[a] + "\n");
        }
    }
}
