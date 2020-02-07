package workshop1;

import com.sun.source.tree.ReturnTree;

import javax.print.DocFlavor;

public class Teacher {
    // Definición de atributos
    private String name;
    private int age;
    private double height;
    private String gender;
    private String component;
    private String title;
    private String specialty;
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
    public String getGender(){
        return this.gender;
    }
    public String getComponent(){
        return this.component;
    }
    public String getTitle(){
        return this.title;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public String teachTeacher(){
        String teach = "El profesor procede a enseñar";
        return teach;
    }
    public String writeTeacher(){
        String write = "El profesor procede a escribir";
        return write;
    }
    public void updateName(String name){
        this.name = name;
    }
    public void updateAge(int age){
        this.age = age;
    }
    public void updateHeight(double height) {
        this.height = height;
    }
    public void updateGender(String gender){
        this.gender = gender;
    }
    public void updateComponent(String component){
        this.component = component;
    }
    public void updateTitle(String title){
        this.title = title;
    }
    public void updateSpecialty(String specialty){
        this.specialty = specialty;
    }
    public String getInformation(){
        String information = "Name:"+name+"\nAge:"+age+"\nHeight:"+height+" m\nGender:"+gender
                +"\nComponent:"+component+"\nTitle:"+title+"\nSpecialty:"+specialty;
        return information;
    }
}
