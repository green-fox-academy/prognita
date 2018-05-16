package main.java.music;

public class Violin extends  StringedInstrument{

    public Violin() {
        super("Violin", 4);
    }

    public Violin(int numberOfStrings) {
        super(4);
        super.numberOfStrings = numberOfStrings;
    }



    @Override
    String sound() {
        return "Screech";
    }
}
