public class ass9 {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100;
            for (int num = rangeStart; num <= rangeEnd; num++) {
            if (isPrime(num)) {
                System.out.println("The first prime number in the range is: " + num);
                break;
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
