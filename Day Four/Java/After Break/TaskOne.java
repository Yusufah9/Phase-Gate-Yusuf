import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double average = 0;
       
        while (count < 10) {
            System.out.print("Enter a score: ");
            int userInput = scanner.nextInt();
            
            sum += userInput;
            count++;        
        }
        
        {  System.out.println("The sum of the 10 scores is: " + sum);

        }

    }
}

