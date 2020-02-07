package designpoo;

public class Beer {
    private String name;
    private String type;
    private double price;
    private int soldUnits;
    public Beer(String name, String type, double price, int soldUnits){
        this.name = name;
        this.type = type;
        this.price = price;
        this.soldUnits = soldUnits;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoldUnits() {
        return soldUnits;
    }

    public void setSoldUnits(int soldUnits) {
        this.soldUnits = soldUnits;
    }
    public double totalValue(){
        double value = getPrice() * getSoldUnits();
        return value;
    }
    public String getInformation(){
        String information = "Cerveza:"+ getName() +"\nType:"+ getType() +"\nPrice:"+ getPrice()
                +" $\nSold Units:"+ getSoldUnits() +"\n\nTotal Value:"+totalValue();
        return information;
    }
}
