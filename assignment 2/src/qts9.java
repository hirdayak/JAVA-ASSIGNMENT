import java.util.Scanner;

public class qts9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the Y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the X-axis.");
        } else {
            System.out.println("The coordinate point (" + x + "," + y + ") is at the origin.");
        }
    }
}

