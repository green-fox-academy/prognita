public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;


    public Student(String name, int age, Gender gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;

    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }


    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from "
                + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }


}
