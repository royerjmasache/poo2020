package homeworkselection;

public class BiggerNumber {
    // Declaración de variables
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int higher;

    /**
     * Método constructor para la clase BiggNumber
     * @param number1
     * @param number2
     * @param number3
     * @param number4
     */
    public BiggerNumber(int number1, int number2, int number3, int number4){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    /**
     * Métodos para actualizar y retonar el valor de number1
     * @return
     */
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * Métodos para actualizar y retonar el valor de number1
     * @return
     */
    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    /**
     * Métodos para actualizar y retonar el valor de number1
     * @return
     */
    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    /**
     * Métodos para actualizar y retonar el valor de number1
     * @return
     */
    public int getNumber4() {
        return number4;
    }

    public void setNumber4(int number4) {
        this.number4 = number4;
    }

    /**
     * Métodos para actualizar y retonar el valor de number1
     * @return
     */
    public int getHigher() {
        return higher;
    }

    public void setHigher(int higher) {
        this.higher = higher;
    }

    /**
     * Método para calcular el número que es mayor
     */
    public void calculateNumber(){
        if ((number1 > number2) && (number1 > number3) && (number1 > number4)){
            higher = number1;
        } else {
            if((number2 > number3) && (number2 > number4)){
                higher = number2;
            } else {
                if(number3 > number4){
                    higher = number3;
                } else {
                    higher = number4;
                }
            }
        }
    }
}
