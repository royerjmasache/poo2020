package heritagedebtors;
// Clase derivada que hereda los atributos de la superclase Debtor
public class Personal extends Debtor {
    /**
     * Método para calcular el interés generado por préstamo personal
     * @return
     */
    public double calculateInterest(){
        interest = (capital * 0.5 ) * term;
        return interest;
    }

    /**
     * Método constructor para la clase Personal
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public Personal(int number, String name, int account, double capital, double term) {
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }
}
