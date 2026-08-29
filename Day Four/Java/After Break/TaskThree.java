import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int average = 0;
        int result= 0;
       
        while (count < 10) {
            System.out.print("Enter a score: ");
            int userInput = scanner.nextInt();
            
            sum += userInput;
            average = sum / count;
            result = sum + average;             
            count++;

        }

        
        {  System.out.println("The average of 10 scores is: " +  average);

        }

    }
}

