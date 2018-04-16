import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int square = scanner.nextInt();
        for (int i = 1; i <= square; i++) {
            for (int j = 1; j <= square; j++) {
                if (i == 1 || i == square) {
                    System.out.print("%");
                } else if (j == 1 || j == square || j == i) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
