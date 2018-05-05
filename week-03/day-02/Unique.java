
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Unique {

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        //  should print: `[1, 11, 34, 52, 61]`
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        Set<Integer> list1 = new LinkedHashSet<>(list);

        list1.addAll(list);
        list.clear();
        list.addAll(list1);

        System.out.println(list1);


    }

}
