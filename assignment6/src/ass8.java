import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {

            System.out.print("Enter a number (0 to exit): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            sum += number;
        }

        System.out.println("The sum of positive numbers is: " + sum);
    }
}
