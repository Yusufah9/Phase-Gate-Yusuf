import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0; 
        int average = 0;
        while (count < 10) {
            System.out.print("Enter a score: ");
            int userInput = scanner.nextInt();
            
            if (userInput % 2 == 0) {
                sum += userInput;
                average /= sum;
            }
            count++;
        }
        
        System.out.println("The sum of the even scores is: " + sum);
        
    }
}

