package workshop1;

public class Student {
    // Definición de atributos
    private String name;
    private int age;
    private double height;
    private int weight;
    private String gender;
    private String nationality;
    // Creación de métodos
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getGender(){
        return this.gender;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getInformation(){
        String information = "Name:"+name+"\nAge:"+age+"\nHeight:"+height+" m\nWeight:"+weight+" pounds\nGender:"+gender
                +"\nNationality:"+nationality;
        return information;
    }
    public void updateName(String name){
        // Uso de this para variables globales
        this.name = name;
    }
    public void updateAge(int age){
        // Uso de this para variables globales
        this.age = age;
    }
    public void updateHeight(double height){
        // Uso de this para variables globales
        this.height = height;
    }
    public void updateWeight(int weight){
        // Uso de this para variables globales
        this.weight = weight;
    }
    public void updateGender(String gender){
        // Uso de this para variables globales
        this.gender = gender;
    }
    public void updateNationality(String nationality){
        // Uso de this para variables globales
        this.nationality = nationality;
    }
    public String eatStudent(){
        String eat = "El estudiante procede a comer";
        return eat;
    }
    public String sleepStudent(){
        String sleep = "El estudiante procede a dormir";
        return sleep;
    }
}
