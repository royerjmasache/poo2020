package workshop1;

public class RunTeacher {
    public static void main(String[] args) {
        // Creación de objeto teacher
        Teacher teacher = new Teacher();
        teacher.updateName("René");
        teacher.updateAge(34);
        teacher.updateHeight(1.68);
        teacher.updateGender("Male");
        teacher.updateComponent("Programming");
        teacher.updateTitle("Computer's Science");
        teacher.updateSpecialty("Python");
        String showTeacher = teacher.getInformation();
        System.out.println(showTeacher);
        System.out.println(teacher.teachTeacher());
        System.out.println(teacher.writeTeacher());
    }
}
