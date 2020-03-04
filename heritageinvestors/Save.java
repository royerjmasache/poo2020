package heritageinvestors;
// Clase derivada que hereda atributos de la clase Investor
public class Save extends Investor {
    /**
     * Método para calcular el valor del interés en cuenta de ahorro
     * @return
     */
    public double calculateInterest(){
        interest = (capital * 0.2 ) * term;
        return interest;
    }

    /**
     * Método constructor para la clase Save
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public Save(int number, String name, int account, double capital, double term){
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }


}
