package repetitionworkshop;

public class Product {
    private int number1;
    private int number2;
    private int result;


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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    /**
     * Método para calcular el valor del producto
     * @return
     */
    public int calculateProduct(){
        for(int a = 1; a <= number1;a ++){
            result = result + number2;
        }
        return  result;
    }
}
