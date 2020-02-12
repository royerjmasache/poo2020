package designpoo;

import java.util.Scanner;

public class Student {
    // Declaración de atributos
    private String firstName;
    private String lastName;
    private String status;
    private String component;
    private double score1;
    private double score2;
    private double average;


    public Student(String firstName, String lastName, String component, double score1, double score2){
        // Uso de this para variables globales
        this.firstName = firstName;
        this.lastName = lastName;
        this.component = component;
        this.score1 = score1;
        this.score2 = score2;
    }

    // Declaración de métodos
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * Método para calcular el promedio
     * @return
     */
    public int totalAverage(){
        // Uso de round para redondear al valor más cercano
        average = Math.round(score1 + score2);
        return (int) average;
    }
    /**
     * Método para evaluar la condición y retornar el estado
     * @return
     */
    public String finalStatus(){
        // Estructura condicional para evaluar la condición
        if(average >= 28){
            status = "Aprobado";
        } else {
            status = "Reprobado";
        }
        return status;
    }
    // Método que retorna el resultado deseado
    public String getInformation(){
        String information = "Reporte Estudiantil\nNombre: " + getFirstName()
                + "\nApellido: " + getLastName() + "\nComponente: " + getComponent()
                + "\nNota 1: " + getScore1() + "\nNota 2: " + getScore2()
                + "\nPromedio: " + totalAverage() + "\nEstado: " + finalStatus();
        return information;
    }
}
