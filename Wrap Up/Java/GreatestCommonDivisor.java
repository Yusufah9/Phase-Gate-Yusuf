import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int findgreatestCommonDivisor(int number1, int number2) {
        int greatestCommonDivisor = 1;

        for (int count = 1; count <= number1 && count <= number2; count++) {
            if (number1 % count == 0 && number2 % count == 0) {
                greatestCommonDivisor = count; 
            }
        }

        return greatestCommonDivisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int answer = findgreatestCommonDivisor(firstNumber, secondNumber);
        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is: " + answer);
    }
}
