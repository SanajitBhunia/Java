package String;

import java.util.Scanner;

public class VowelToUnderscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the number of vowels in the input string
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        // If the vowel count is greater than 3, replace vowels with underscores
        if (vowelCount > 3) {
            String modifiedString = ""; // Start with an empty string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (isVowel(ch)) {
                    modifiedString += "_"; // Replace vowel with underscore
                } else {
                    modifiedString += ch; // Keep other characters as is
                }
            }
            System.out.println("Modified string: " + modifiedString);
        } else {
            System.out.println("Vowel count is not greater than 3. Original string: " + input);
        }

        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
