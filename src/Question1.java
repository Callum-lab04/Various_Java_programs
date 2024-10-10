import java.util.Scanner;

public class Question1 {
    public static int sumEvenIncrementByTwo (int number) {
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

        public static int sumEvenModulus (int number) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        Long startTime1 = System.nanoTime();
        int sum1 = sumEvenIncrementByTwo(number);
        Long endTime1 = System.nanoTime();
        Long duration1 = startTime1 - endTime1;

        Long startTime2 = System.nanoTime();
        int sum2 = sumEvenModulus(number);
        Long endTime2 = System.nanoTime();
        Long duration2 = startTime2 - endTime2;

        System.out.println("Sum of even numbers using Method 1 (increment by 2): " + sum1);
        System.out.println("Time taken by Method 1: " + duration1 + " nanoseconds");

        System.out.println("Sum of even numbers using Method 2 (modulus check): " + sum2);
        System.out.println("Time taken by Method 2: " + duration2 + " nanoseconds");

        // Compare the results
        if (duration1 < duration2) {
            System.out.println("Method 1 is faster.");
        } else if (duration1 > duration2) {
            System.out.println("Method 2 is faster.");
        } else {
            System.out.println("Both methods have the same speed.");
        }
    }
}