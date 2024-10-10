import java.util.Scanner;

public class Question2 {
    public static void primeCheck (int number) {
        double squareRoot = Math.sqrt(number);

        if (number <= 1) {
            System.out.println(number + " is not a prime number");
        return;
        }

        if (number == 2) {
            System.out.println(number + " is a prime number");
            return;
        }

        if (number % 2 == 0) {
            System.out.println(number + " is not a prime number");
        return;
        }

        boolean isPrime = true;
        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number, the Square root of "+number+" is "+squareRoot+".");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

    public static void main (String [] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        primeCheck(number);
    }
}
