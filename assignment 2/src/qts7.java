import java.util.Scanner;

public class qts7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        int height = scanner.nextInt();

        if (height < 150) {
            System.out.println("The person is Dwarf.");
        } else if (height >= 150 && height <= 165) {
            System.out.println("The person has Average height.");
        } else {
            System.out.println("The person is Tall.");
        }
    }
}
