import java.util.Scanner;

public class PartyIdicator {
    public static void main(String[] args) {

        System.out.println("Hello! Its the ultimate Party Indicator:  ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of girls:  ");
        int numberOfGirls = input.nextInt();
        System.out.println("Enter a number of boys:  ");
        int numberOfBoys = input.nextInt();


        if (numberOfBoys + numberOfGirls == 0){
            System.out.println("No party :( ");
        }
        else if (numberOfBoys == numberOfGirls && (numberOfBoys + numberOfGirls > 20)) {
            System.out.println(" The Party is excellent");
        } else if (numberOfBoys != numberOfGirls && numberOfGirls !=0 &&(numberOfBoys + numberOfGirls > 20) ) {
            System.out.println("Quite cool party!");

        }else if (numberOfBoys != numberOfGirls && numberOfGirls !=0 && (numberOfBoys + numberOfGirls < 20)) {
            System.out.println("Average party");

        }else if (numberOfGirls == 0){
            System.out.println("Sausage party!");

        }
    }
}


//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people


