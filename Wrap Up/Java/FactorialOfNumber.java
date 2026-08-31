
//2. Find the GCD of two numbers using loop. 
//3. Find the LCM of two numbers using loop. 
//4. Check if a number is a perfect number. 
//5. Check if a number is an Armstrong number. 
//6. Print all Armstrong numbers between 1 and 1000. 
//7. Print all perfect numbers between 1 and 1000. 
//8. Check if a number is a strong number.WRAP-UPSNACKS 
//9. Print all leap years between 1900 and 2025. . 
//10. Count how many leap years exist between 1900 and 2025.
//
//








import java.util.Scanner;
public class FactorialOfNumber {
    public static int factorialOf(int number) {
       int result = 1;
        for(int count = number; count >= 1; count--){
         result *= count;


}
    return result;

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        int answer = factorialOf(userInput);

    System.out.println("The factorial of " + userInput +  " is: " + answer);

    }



}


def factorial_Of(number):
    result = 1
        for count in number:
        result *= count
    return number

number = input("Enter a number")
answer = factorial_Of(number)

print("The factorial of " + number, + " is: ", + answer)









