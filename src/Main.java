import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Teachers teachers = new Teachers();
        teachers.lessons();
        Student student = new Student();
        student.studentFio();
        ApplicationTest applicationTest = new ApplicationTest();
        applicationTest.names();
        StudentTwo studentTwo = new StudentTwo("d","", null, null);
        Marks marks = new Marks();
        marks.addNewItem();

    }
}