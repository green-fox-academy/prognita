public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }

    public Sponsor(String name, int age, Gender gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void hire() {
        this.hiredStudents = hiredStudents + 1;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents "
                + getCompany() + " and hired " + getHiredStudents() + " students so far.");
    }
}
