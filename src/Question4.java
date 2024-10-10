import java.util.Scanner;

public class Question4 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an option");
        System.out.println("-----------------------");
        System.out.println("1 - Degrees Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Degrees Celsius");
        System.out.println("Option: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
        }
    }
    static void celsiusToFahrenheit() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        float inputInCelsius = Integer.parseInt(scanner.nextLine());
        float outputInFahrenheit = (inputInCelsius*9/5)+32;

        System.out.println(inputInCelsius+"\u00B0C = "+outputInFahrenheit+"\u00B0F");
    }
    static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        float inputInFahrenheit = Integer.parseInt(scanner.nextLine());
        float outputInCelsius = (inputInFahrenheit - 32)*5/9;

        System.out.println(inputInFahrenheit+"\u00B0F = "+outputInCelsius+"\u00B0C");
    }

}
