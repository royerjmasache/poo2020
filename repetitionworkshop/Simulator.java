package repetitionworkshop;

public class Simulator {
    private int value;

    /**
     * Método constructor para la clase Simulator
     * @param value
     */
    public Simulator(int value){
        this.value = value;
    }

    /**
     * Método para consultar el valor del saldo
     * @return
     */
    public int checkValue(){
        return value;
    }

    /**
     * Método para realizar depósito
     * @param deposit
     */
    public void depositValue(int deposit){
        if(deposit > 0){
            value = value + deposit;
        } else {
            System.out.println("El valor ingresado no es correcto");
        }
    }

    /**
     * Método para realizar retiro
     * @param withdraw
     */
    public void withdrawValue(int withdraw){
        if(withdraw <= value){
            value = value - withdraw;
        } else {
            System.out.println("La cantidad ingresada excede el valor de los fondos");
        }
    }
}
