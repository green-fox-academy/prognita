import java.util.ArrayList;
import java.util.Arrays;

public class Excercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers.stream().mapToInt(x -> x * x).filter(x -> x > 20).forEach(System.out::println);
    }
}
