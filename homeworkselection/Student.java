package homeworkselection;

public class Student {
    // Declaración de variables
    private String name;
    private String status;
    private double grade1;
    private double grade2;
    private double grade3;
    private double grade4;
    private double average;

    /**
     * Método constructor para la clase Student
     */
    public Student(String name, double grade1, double grade2, double grade3, double grade4){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    /**
     * Métodos para actualizar y retornar el valor de name
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para retornar el valor del estado de la materia
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * Métodos para actualizar y retornar el valor de primera nota
     * @return
     */
    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    /**
     * Métodos para actualizar y retornar el valor de segunda nota
     * @return
     */
    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    /**
     * Métodos para actualizar y retornar el valor de la tercera nota
     * @return
     */
    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    /**
     * Métodos para actualizar y retornar el valor de la cuarta nota
     * @return
     */
    public double getGrade4() {
        return grade4;
    }

    public void setGrade4(double grade4) {
        this.grade4 = grade4;
    }

    /**
     * Método para retornar el valor de average
     * @return
     */
    public double getAverage() {
        return average;
    }

    // Método que calcular el promedio del estudiante
    public void calculateAverage(){
        average = (grade1 + grade2 + grade3 + grade4)/4;
    }
    // Método para calcular el estado
    public void calculateStatus(){
        // Estructura if-else para evaluar la condición
        if(average >= 60){
            status = "Aprobado";
        }else{
            status = "Reprobado";
        }
    }
}
