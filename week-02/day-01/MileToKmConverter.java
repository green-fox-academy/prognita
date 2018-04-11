import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in kilometer:  ");

        double km = input.nextDouble();
        double miles = km * 0.621;

        System.out.println("Distance in miles: " + miles);

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}