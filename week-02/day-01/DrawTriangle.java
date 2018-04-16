import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int triangle = scanner.nextInt();
        for (int i = 0; i <= triangle; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
