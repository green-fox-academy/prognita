import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int number = input.nextInt();

        System.out.println("How many multiplication do you wanna see?:  ");
        int multi= input.nextInt();

        for (int i = 1; i <= multi; i++) {
            int result = number * i;
           System.out.println(i + " * " + number + " = " + result);
        }

    }
}
