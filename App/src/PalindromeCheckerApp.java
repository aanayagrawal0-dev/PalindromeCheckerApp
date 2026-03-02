import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.pritnln("I am a genius " );
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("--- Palindrome Checker (OO Design) ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = service.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Handle null or empty strings
        if (input == null) return false;

        // Clean the string (optional: removes spaces and converts to lowercase)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers (As per your hint)
        int start = 0;
        int end = cleanInput.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (cleanInput.charAt(start) != cleanInput.charAt(end)) {
                return false; // Characters don't match, not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters matched
    }
}

