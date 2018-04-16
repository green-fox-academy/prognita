import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {


        int userNumber = 0;
        int myNumber = 0;
        Random randomNumber = new Random();
        myNumber = randomNumber.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess my Number: ");

        while (userNumber != myNumber) {

            userNumber = scanner.nextInt();
            if (userNumber < myNumber) {
                System.out.println("The stored number is higher");
            } else if (userNumber > myNumber)
                System.out.println("The stored number is lower");

            else System.out.println("You found the number!: " + myNumber);
        }

    }
}

