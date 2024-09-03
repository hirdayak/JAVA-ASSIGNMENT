import java.util.Scanner;

public class qts5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Congratulate! You are eligible for your vote.");
        } else {
            System.out.println("Sorry! You are not eligible for your vote.");
        }
    }
}

