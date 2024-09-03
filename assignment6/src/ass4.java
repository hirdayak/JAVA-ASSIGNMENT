import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == searchChar) {
                System.out.println("Character '" + searchChar + "' found at index " + i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
    }
}

