import java.util.Scanner;

public class LowestCommonMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int maximumNumber = number1;
        if (number2 > maximumNumber) {
            maximumNumber = number2;
        }

        int lowestcommonMultiples = maximumNumber;
        while (true) {
            if (lowestcommonMultiples % number1 == 0 && lcm % number2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM: " + lowestcommonMultiples);
    }
}
