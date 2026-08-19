
public class Average {
    public static void main(String[] args) {
        int count = 100;
        int sum = 0;
        for (int counter = 1; counter <= count; counter++)
            sum += counter;
        int average = sum / count; 
        
        System.out.println("Average: " + average);
    }
}

