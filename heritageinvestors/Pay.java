package heritageinvestors;
// Clase derivada que hereda atributos de la clase Investor
public class Pay extends Investor {
    /**
     * Método para calcular el valor del interés de inversión en pagaré
     * @return
     */
    public double calculateInterest(){
        interest = (capital * 0.3 ) * term;
        return interest;
    }

    /**
     * Método constructor para la clase Pay
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public Pay(int number, String name, int account, double capital, double term){
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }

}
