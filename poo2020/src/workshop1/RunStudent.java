package workshop1;

public class RunStudent {
    public static void main(String[] args) {
        // Creación de objeto student
        Student student = new Student();
        student.updateName("Royer");
        student.updateAge(21);
        student.updateHeight(1.68);
        student.updateWeight(110);
        student.updateGender("Male");
        student.updateNationality("Ecuadorian");
        String showStudent = student.getInformation();
        System.out.println(showStudent);
        System.out.println(student.eatStudent());
        System.out.println(student.sleepStudent());
    }
}
