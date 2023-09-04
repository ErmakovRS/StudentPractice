import java.util.ArrayList;

public class StudentTwo {
    private String name;
    private String secondName;
    private ArrayList<String> subjects;
    private ArrayList<Integer> grades;

    public StudentTwo(String name, String secondName, ArrayList<String> subjects, ArrayList<Integer> grades) {
        this.name = name;
        this.secondName = secondName;
        this.subjects = subjects;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void addSubjects(String subject){
        this.subjects.add(subject);
    }

    public void addGrades (Integer grade){
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return String.format("Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", subjects=" + subjects +
                ", grades=" + grades +
                '}');
    }
}
