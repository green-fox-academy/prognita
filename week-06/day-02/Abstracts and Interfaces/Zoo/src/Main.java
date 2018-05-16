import Zoo.Birds;
import Zoo.Mammal;
import Zoo.Reptile;

public class Main {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 2, " male", "green");
        Mammal mammal = new Mammal("Koala", 3, "female", "Gray");
        Birds bird = new Birds("Parrot", 5, "male", "Colorful");


        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getAge() + " years old " + reptile.getColor() + " " + reptile.getGender() + " " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getAge() + " years old " + mammal.getColor() + " " + mammal.getGender() + " " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getAge() + " years old " + bird.getColor() + " " + bird.getGender() + " " + bird.getName() + " is breeding by " + bird.breed());

        System.out.println("What kind of sound they make?");
        System.out.println("The " + reptile.name + " make sound like this: " + reptile.sound());
        System.out.println("The " + mammal.name + " make sound like this: " + mammal.sound());
        System.out.println("The " + bird.name + " make sound like this: " + bird.sound());
    }

}
