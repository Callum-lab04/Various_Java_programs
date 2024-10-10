import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String input = scanner.nextLine();

        stringIncrement(input);
        String reversedInput = reverseStringIncrement(input);

        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }

    static String stringIncrement(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
        }
        return input;
    }

    static String reverseStringIncrement(String input) {
        StringBuilder reversed = new StringBuilder();
        input = input.toLowerCase();
        for (int i = input.length() - 1; i >= 0; i--) {
            char character = input.charAt(i);
            reversed.append(character);
        }
        return reversed.toString();
    }
}