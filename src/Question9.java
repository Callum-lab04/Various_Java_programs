import java.util.Scanner;

public class Question9 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String pigLatinPhrase = convertToPigLatin(phrase);

        System.out.println("Pig Latin: " + pigLatinPhrase);
        scanner.close();
    }
    static String convertPhraseToPigLatin(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder pigLatinPhrase = new StringBuilder();

        for (String word: words) {
            pigLatinPhrase.append(convertToPigLatin(word)).append(" ");
        }
        return pigLatinPhrase.toString().trim();
    }

    static String convertToPigLatin(String word) {
        if (isVowel(word.charAt(0))) {
            return word + "-ay"; // If word begins with a vowel
        } else {
            int firstVowelIndex = findFirstVowelIndex(word);
            if (firstVowelIndex != -1) {
                return word.substring(firstVowelIndex) + "-" + word.substring(0, firstVowelIndex) + "ay";
            }
        }
        return word;
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public static int findFirstVowelIndex(String word) {
        for (int i = 1; i <word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
