package heritageinvestors;
// Clase derivada que hereda atributos de la clase Investor
public class MasterAccount extends Investor {
    /**
     * Método para calcular el interés de inversión en cuenta maestra
     * @return
     */
    public double calculateInterest(){
        interest = (capital * 0.4) * term;
        return interest;
    }

    /**
     * Método constructor para la clase MasterAccount
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public MasterAccount(int number, String name, int account, double capital, double term){
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }

}
