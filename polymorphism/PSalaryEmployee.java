package polymorphism;

public class PSalaryEmployee extends PEmployee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * Implementación de método abstracto heredado de la superclase
     */
    @Override
    public void calculateBiweekly() {
        salary = monthlySalary / 2;
    }
}
