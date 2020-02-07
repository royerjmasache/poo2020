package workshop1;

public class Computer {
    // Declaración de atributos
    private String brand;
    private String processor;
    private String graphic;
    private int size;
    private int ram;
    private int screen;
    private String keyboard;
    private int  weight;
    private String color;
    private String material;
    // Declaración de métodos
    public String  getBrand(){
        return this.brand;
    }
    public String getProcessor(){
        return this.processor;
    }
    public String getGraphic(){
        return this.graphic;
    }
    public int getSize(){
        return this.size;
    }
    public int getRam(){
        return this.ram;
    }
    public int getScreen(){
        return this.screen;
    }
    public String getKeyboard(){
        return this.keyboard;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
    public String getMaterial(){
        return this.material;
    }
    public void updateBrand(String brand){
        this.brand = brand;
    }
    public void updateProcessor(String processor){
        this.processor = processor;
    }
    public void updateGraphic(String graphic){
        this.graphic = graphic;
    }
    public void updateSize(int size){
        this.size = size;
    }
    public void updateRam(int ram){
        this.ram = ram;
    }
    public void updateScreen(int screen){
        this.screen = screen;
    }
    public void updateKeyboard(String keyboard){
        this.keyboard = keyboard;
    }
    public void updateWeight(int weight){
        this.weight = weight;
    }
    public void updateColor(String color){
        this.color = color;
    }
    public void updateMaterial(String material){
        this.material = material;
    }
    public String runComputer(){
        String run = "La computadora ejecuta un proceso";
        return run;
    }
    public String readComputer(){
        String read = "La computadora procede a leer datos";
        return read;
    }
    public String getInformation(){
        String information = "Brand:"+brand+"\nProcessor:"+processor+"\nGraphic:"+graphic+"\nSize:"+size
                +"\nRAM:"+ram+" GB\nScreen:"+screen+"\nKeyBoard:"+keyboard+"\nWeight:"+weight+" Kg\nColor:"+color
                +"\nMaterial:"+material;
        return information;
    }
}
