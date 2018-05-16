package Zoo;

public class Birds extends Animal {

    public Birds() {
    }

    public Birds(String name, int age, String gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String sound() {
        return "Csip-csip-csirip";
    }


}
