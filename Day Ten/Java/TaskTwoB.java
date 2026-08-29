public class TaskTwoB {
    public static int[] showOnlyTheInteresections(int[] number1, int[] number2) {
        if(number1[0] == number2[1]) {
        }
        
        return number1;
    }

    public static void main(String[] args) {
        int[] number1 = {4, 9, 5};
        int[] number2 = {9, 4, 9, 8, 5};

        int[] result = showOnlyTheInteresections(number1, number2);
        
        System.out.print("Result: ");
        for (int count = 0; count < result.length; count++) {
            System.out.print(result[count] + " ");
        }
    }
}


