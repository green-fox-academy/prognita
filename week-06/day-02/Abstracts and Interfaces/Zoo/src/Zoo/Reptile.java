package Zoo;

public class Reptile extends Animal {

    public Reptile() {
    }

    public Reptile(String name, int age, String gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String sound() {
        return "GRRGR";
    }


}
