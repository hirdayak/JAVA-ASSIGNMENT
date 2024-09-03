import java.util.Scanner;

public class qts1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Number1 and Number2 are equal");
        } else {
            System.out.println("Number1 and Number2 are not equal");
        }
    }
}

