package repetitionworkshop;

public class Division {
    private int number1;
    private int number2;
    private int a;


    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getA() {
        return a;
    }

    /**
     * Método constructor para la clase Division
     * @param number1
     * @param number2
     */
    public Division (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

  /**
     * Método para calcular el valor de la división
     * @return
     */
    public void calculateDivision(){
        for(a = 0; number1 >= number2; a ++){
            number1 = number1 - number2;
        }
    }

    public int setDivision(){
        return a;
    }
}
