import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int evenCount = 0;
        int sum = 0;
        
        while (count < 10) {
            System.out.print("Enter a score: ");
            int userInput = scanner.nextInt();
            
            if (userInput % 2 == 0) {
                sum += userInput;
                evenCount++;
            }
            count++;
        }
        
        double average = 0;
        if (evenCount > 0) {
            average = sum / evenCount;
        }
        
        System.out.println("The sum of even scores is: " + sum);
        System.out.println("The average of even scores is: " + average);
        
    }
}

