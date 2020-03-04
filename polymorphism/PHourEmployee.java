package polymorphism;

public class PHourEmployee extends PEmployee{
    // Definición de variables específicas
    private double hours;
    private double value;
    // Extensión de los atributos de la superclase
    public void setHours(double hours){
        this.hours = hours;
    }
    public double getHours(){
        return hours;
    }
    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }
    // Extensión de los métodos de la superclase
    @Override
    public void calculateBiweekly() {
        salary = hours * value;
    }

}