import java.util.ArrayList;

public class Main {
    ArrayList<Integer> summTheNumbers = new ArrayList<Integer>();

    public Main(ArrayList<Integer> summTheNumbers) {
        this.summTheNumbers = summTheNumbers;
    }

    public Integer setSummTheNumbers(ArrayList<Integer> summTheNumbers) {
        this.summTheNumbers = summTheNumbers;
        int sum = 0;
        for (Integer numbers : summTheNumbers) {
            sum += numbers;

        }
        return sum;

    }
}
