package lesson1;

import java.util.List;
import java.util.Scanner;

public class Nomer3 {

    public static void main(String[] args) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> punctuation = List.of(',', ' ', '.', ';');
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.print("Enter a sting: ");
        line = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (Character lineSymbol : line.toCharArray()) {
            char symbol = Character.toLowerCase(lineSymbol);
            if (vowels.contains(symbol)) {
                vowelsCount = vowelsCount + 1;
            } else if (!punctuation.contains(symbol)) {
                consonantsCount = consonantsCount + 1;
            }
        }

        System.out.println("The number of vowels is " + vowelsCount);
        System.out.println("The number of consonants is " + consonantsCount);
    }
}
