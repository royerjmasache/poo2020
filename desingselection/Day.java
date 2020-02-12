package desingselection;

import java.util.Scanner;

public class Day {
    // Declaración de variables
    private int number;
    private String name;

    /**
     * Métodos para actualizar y retornar el número
     * @return
     */
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Métodopara retornar el nombre
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Método para calcular el nombre del día
     * @return
     */
    public String  calculateName(){
        // Inicialización de variable
        name = "";
        // Uso de switch para evaluar la condición
        switch (number){
            case 1:
                name = "Lunes";
                break;
            case 2:
                name = "Martes";
                break;
            case 3:
                name = "Miércoles";
                break;
            case 4:
                name = "Jueves";
                break;
            case 5:
                name = "Viernes";
                break;
            case 6:
                name = "Sábado";
                break;
            case 7:
                name = "Domingo";
                break;
            default:
                name = "El valor seleccionado está fuera del rango";
        }
        // Retorno de variable
        return name;
    }
}
