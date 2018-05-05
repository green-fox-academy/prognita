public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, Gender gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + getLevel() + " mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

}
