package arrayshomeworkpoo;

public class Identification {
    // Declaración de variables
    private int identification;
    private String status;
    // Inicialización de variable para retornar
    int validation = 0;

    /**
     * Métodos para actualizar y retonar el valor de identification
     * @return
     */
    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    /**
     * Métodos para actualizar y retonar el valor de status
     * @return
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Método constructor para la clase Identification
     * @param identification
     */
    public Identification(int identification){
        this.identification = identification;
    }

    /**
     * Método para validar el valor de la cédula
     */
    public void calculateValidation() {
        // Arreglo que almacena los valores necesarios
        int[] values = {2,1,2,1,2,1,2,1,2};
        // Inicialización de variable status
        status = "Cédula incorrecta";
        // Arreglo que almacena los valores de la cédula por separado
        int[] arrayI = new int[10];
        // Creación de contador
        int count = 9;
        // Ciclo repetitivo para almacenamiento de datos
        for (int a = 0; a < arrayI.length ; a ++) {
            // Cálculo para obtener el último valor
            arrayI[count] = (int)((identification/Math.pow(10, a)) % 10);
            // Decremento del contador
            count--;
        }
        // Declaración e inicialización de variables para obtener la sumatoria
        int summation = 0;
        int result;
        // Ciclo repetitivo para obtener la sumatoria
        for (int b = 0; b < (arrayI.length - 1); b ++){
            result = values[b] * arrayI[b];
            // en caso de que sean mayores que nueve se les restara nueve
            if (result > 9){
                result = result - 9;
            }
            summation = summation + result;
        }
        // Declaración de variable para almacenar el residuo
        int residue = summation % 10;
        // Estructura condicional para obtener el último dígito
        if(residue != 0){
            validation = 10 - residue;
        }
        // Estructura condicional para evaluar la condición
        if (validation == arrayI[9]){
            status = "El número de cédula es correcto";
        }
    }

    /**
     * Método para obtener el valor de la validación
     * @return
     */
    public int getValidation(){
        return validation;
    }
}
