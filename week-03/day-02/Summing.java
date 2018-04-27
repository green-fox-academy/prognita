import java.util.Scanner;

public class Summing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = input.nextInt();

        System.out.println(sum(number));
    }


    private static int sum(int input) {
        int i = 1;
        int summ = 0;

        while (i <= input) {
            summ += i;
            i += 1;
        }
        return summ;
    }

}
