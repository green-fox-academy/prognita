public class Appenda {

    public static void main(String[] args) {
        String am = "kuty";

        System.out.println(appendA(am));


    }

    private static String appendA(String am) {

        am = am.concat("a");
        return (am);
    }
}
