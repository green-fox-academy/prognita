import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Excercise7 {
    public static void main(String[] args) {

        String s = "This is a fancy text";
        Map<Character, Integer> frequencies = s.chars().boxed()
                .collect(toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting


        System.out.println("Frequencies:\n" + frequencies);
    }

}
