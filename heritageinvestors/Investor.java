package heritageinvestors;

/**
 * Clase principal (Superclase)
 */
public class Investor {
    // Declaración de variables globales para las clases derivadas
    protected String name;
    protected int account;
    protected int number;
    protected double capital;
    protected double interest;
    protected double term;

    // Métodos para actualizar y retornar la variable name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos para actualizar y retornar la variable account
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    // Métodos para actualizar y retornar la variable number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Métodos para actualizar y retornar la variable capital
    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    // Métodos para actualizar y retornar la variable interest
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    // Métodos para actualizar y retornar la variable term
    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }
}
