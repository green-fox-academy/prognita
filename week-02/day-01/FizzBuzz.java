public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String fizzbuzz = "";
            if (i % 3 == 0) fizzbuzz += "Fizz";
            if (i % 5 == 0) fizzbuzz += "Buzz";
            if (fizzbuzz.equals("")) fizzbuzz += i;
            System.out.println(fizzbuzz);
        }
    }
}

