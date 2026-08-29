public class TaskOne {
    
    public static int[] addArrayOf(int[] numbers) {
      
        if (numbers == null || numbers.length < 2) {
            return numbers;
        } 

        int lastIndex = numbers.length - 1;
        int secondLastIndex = numbers.length - 2;

        int sum = numbers[secondLastIndex] + numbers[lastIndex];

        int[] result = new int[numbers.length - 1];

        for (int count = 0; count < secondLastIndex; count++) {
            result[count] = numbers[count];
        }

        result[result.length - 1] = sum;

        return result;
    }
}


