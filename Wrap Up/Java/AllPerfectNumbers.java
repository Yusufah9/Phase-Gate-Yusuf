public class AllPerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            int sum = 0;
            for (int count = 1; count < number; count++) {
                if (number % count == 0) {
                    sum = sum + count;
                }
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
