import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {


        String[] abc = {"first", "second", "third"};

        String temp1 = abc [0];
        abc[0] = abc [2];
        abc[2] = temp1;
        System.out.println(Arrays.toString(abc));

        // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

    }
}
