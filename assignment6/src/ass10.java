public class ass10 {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 50;
            for (int num = rangeStart; num <= rangeEnd; num++) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}

