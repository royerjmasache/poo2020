package heritagedebtors;
// Clase derivada que hereda los atributos de la superclase Debtor
public class Mortgage extends Debtor {
    /**
     * Método para calcular el interés por préstamo hipotecario
     * @return
     */
    public double calculateInterest(){
        interest = (capital * 0.6 ) * term;
        return interest;
    }

    /**
     * Método constructor para la clase Mortgage
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public Mortgage(int number, String name, int account, double capital, double term) {
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }
}
