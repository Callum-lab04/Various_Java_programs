import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 3,999");
        int number = Integer.parseInt(scanner.nextLine());

        String romanNumeral = convertToRoman(number);

        System.out.println("The roman numeral for "+number+" is: "+romanNumeral);
    }
    static String convertToRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String roman = thousands[number / 1000] +
                       hundreds[(number % 1000) / 100] +
                       tens[(number % 100) / 10] +
                       ones[number % 10];
        return roman;
    }
}
