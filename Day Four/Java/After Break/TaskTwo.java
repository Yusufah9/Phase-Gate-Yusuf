import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double average;
       
        while (count < 10) {
            System.out.print("Enter a score: ");
            int userInput = scanner.nextInt();
            count++;

        }
             average /= userInput;
        
        {  System.out.println("The average of 10 scores is: " +  average);

        }

    }
}

//collect 10 scores and print average
