public class Excercise5 {
    public static void main(String[] args) {
        //Write a Stream Expresszion to find the uppercase characters in a string!

        System.out.println("Ez a mondtad Tök Vicces !".chars()
                .filter(x -> (Character.isUpperCase(x)))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString());


    }
}
