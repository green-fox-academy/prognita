import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number and I tell you it is Odd or Even:  ");
    int number1 = input.nextInt();

       if ((number1 & 1) ==1 ){

           System.out.println("This number is Odd");
       }else
           System.out.println("This number is Even");

}
}