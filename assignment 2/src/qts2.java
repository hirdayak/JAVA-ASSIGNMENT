import java.util.Scanner;

public class qts2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even integer");
        } else {
            System.out.println(number + " is an odd integer");
        }
    }
}