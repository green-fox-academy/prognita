public class Printer {

    public static void main(String[] args) {


        printer("Alma", "Körte", "Tészta", "Csirke");
    }

    public static void printer(String... parameters) {
        for (String parameter : parameters) {
            System.out.println(parameter);
        }

    }
}

