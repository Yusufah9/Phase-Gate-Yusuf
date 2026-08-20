
//Given x, y, and z, print the mean and median of the three values without using any built-in min/max/sort just nested if/else logic
//and print which variable name(x, y, or z) held the median value.

public class Question2 {
    public static void main(String[] args) {

    int givenX = 2;
    int givenY = 3;
    int givenZ = 6;

    if(givenX < givenY) {
    System.out.print("Mean is:"+ givenX);
    } else if(givenY < givenZ) {
    System.out.print("Median is: " + givenY);
    } else{
    System.out.print("Thank you");
    
    }
}

}




