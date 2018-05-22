import java.util.ArrayList;
import java.util.List;

public class Excercise10 {
    public static void main(String[] args) {

        List<Fox> Foxlist = new ArrayList<>();

        Foxlist.add(new Fox("Charle", "Beow", "Black"));
        Foxlist.add(new Fox("Pety", "Pallida", "Brown"));
        Foxlist.add(new Fox("Bapa", "Pallida", "Red"));
        Foxlist.add(new Fox("Foxy", "Pallida", "Green"));
        Foxlist.add(new Fox("Maxy", "Sand", "Green"));

//for green and Pallida foxes
        System.out.println("Pallida and Green Fox finder: ");

        Foxlist.stream().map(Fox -> new Fox(Fox.getName(), Fox.getType(), Fox.getColor()))
                .filter(type -> type.getType().equals("Pallida"))
                .filter(color -> color.getColor().equals("Green"))
                .forEach(System.out::println);
//for green foxes
        System.out.println("");
        System.out.println("Green Fox finder: ");

        Foxlist.stream().map(Fox -> new Fox(Fox.getName(), Fox.getType(), Fox.getColor()))
                .filter(color -> color.getColor().equals("Green"))
                .forEach(System.out::println);


    }
}
