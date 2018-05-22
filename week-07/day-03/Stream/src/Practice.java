import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] even = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)//filternek igaz hamis állításokat adunk
                .toArray();
        System.out.println(Arrays.toString(even));

        double oddAvarage = Arrays.stream(numbers)
                .filter(n -> (n & 1) == 1) // & | bit wise operator, Ternary operator:(if) ?
                .average()
                .getAsDouble();//statisztikai funkciók csak int stringeken vannak

        System.out.println(oddAvarage);


        List<String> words = new ArrayList<>(Arrays.asList("alma", "korte", "ananasz", "banan"));
        words.parallelStream() // ha számít a sorrend stream , ha nem számít parallel stream
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);//mindig a for each a legvége, mert void

    }
}
