import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 40, Gender.MALE);
        people.add(mark);
        Person jane = new Person("Jane Doe", 30, Gender.FEMALE);
        people.add(jane);
        Student john = new Student("John Doe", 20, Gender.MALE, "BME");
        people.add(john);
        Student student = new Student("Jane Doe", 30, Gender.FEMALE, "The School of Life");
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, Gender.MALE, "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor("Jane Doe", 30, Gender.FEMALE, "intermediate");
        people.add(mentor);
        Sponsor sponsor = new Sponsor("Jane Doe", 30, Gender.FEMALE, " Google ");
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, Gender.MALE, "SpaceX");
        people.add(elon);

        student.skipDays(3);


        for (int i = 0; i < 3; i++) {
            elon.hire();
        }

        for (int i = 0; i < 5; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }
        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();
    }
}
