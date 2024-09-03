import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a decimal number: ");

        double decimalNumber = scanner.nextDouble();

        int integerNumber = (int) decimalNumber;

        System.out.println("The integer part of " + decimalNumber + " is " + integerNumber);

    }
}
