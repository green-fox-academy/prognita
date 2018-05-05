import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    List<Student> students;
    List<Mentor> mentors;

    public String getName() {
        return name;
    }

    public Cohort(String name) {
        this.name = name;
        mentors = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addStudent(Student element) {
        students.add(element);
    }

    public void addMentor(Mentor element) {
        mentors.add(element);
    }

    public void info() {
        System.out.println("The " + getName() + " cohort has " + students.size() + " students and " + mentors.size() + " mentors");
    }


}
