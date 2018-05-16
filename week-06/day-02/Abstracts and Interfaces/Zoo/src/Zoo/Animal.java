package Zoo;

public abstract class Animal {
    public String name;
    public int age;
    public String gender;
    public String color;

    public Animal() {

    }

    public Animal(String name, int age, String gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract String  breed();
    public abstract String sound();


}
