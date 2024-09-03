import java.util.Scanner;

public class ass3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < 3; j++) {
            int columnSum = 0;
            for (int i = 0; i < 3; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + columnSum);
        }
    }
}
