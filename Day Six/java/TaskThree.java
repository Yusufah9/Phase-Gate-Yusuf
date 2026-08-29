public class TaskThree {
    public static int[] moveZerosToEnd(int[] numbers) {
        int[] result = new int[numbers.length];
        int position = 0;

        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] != 0) {
                result[position] = numbers[count];
                position++;
            }
        }

        return result;
    }
} public static void main(String[] args);
    System.out.print(position);

}

}
