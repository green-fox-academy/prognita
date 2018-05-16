package Zoo;

public class Mammal extends Animal  {


    public Mammal() {
    }

    public Mammal(String name, int age, String gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String sound() {
        return "snif snif";
    }

}
