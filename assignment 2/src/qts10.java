import java.util.Scanner;

public class qts10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the marks obtained in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Input the marks obtained in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Input the marks obtained in Mathematics: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        int totalMathsPhysics = maths + physics;

        boolean isEligible = (maths >= 65 && physics >= 55 && chemistry >= 50) &&
                (totalMarks >= 190 || totalMathsPhysics >= 140);

        if (isEligible) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}
