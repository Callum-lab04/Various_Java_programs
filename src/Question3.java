import java.util.Scanner;

public class Question3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int arraySize = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter element " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        minNumber(numbers);
        maxNumber(numbers);

    }

    public static void minNumber (int[] numbers) {
        int lowestNumber = numbers[0];

        for (int number: numbers) {
              if (number < lowestNumber) {
                  lowestNumber = number;
              }
        }
        System.out.println("The smallest number in the array is: "+lowestNumber);
    }
    public static void maxNumber (int[] numbers) {
        int largestNumber = numbers[0];

        for (int number: numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println("The largest number in the array is: "+largestNumber);
    }
}
