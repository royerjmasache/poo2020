package heritagedebtors;
// Clase derivada que hereda los atributos de la superclase Debtor
public class Car extends Debtor {
    public double calculateInterest(){
        /**
         * Método para calcular el interés generado por préstamo de automóvil
         */
        interest = (capital * 0.7 ) * term;
        return interest;
    }

    /**
     * Método constructor para la clase Car
     * @param number
     * @param name
     * @param account
     * @param capital
     * @param term
     */
    public Car(int number, String name, int account, double capital, double term) {
        this.number = number;
        this.name = name;
        this.account = account;
        this.capital = capital;
        this.term = term;
    }
}
