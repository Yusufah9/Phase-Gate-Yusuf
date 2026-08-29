import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTwoATestB{

    @Test
    public void testThatACollectionOfArraysThatAppearedLike() {
        int[] number1 = {4, 9, 5};
        int[] number2 = {9, 4, 9, 8, 5};
        int[] expectedResult = {4, 9};

        int[] actualResult = removeTheIntersectionFromTheArrays(number1, number2);

        assertArrayEquals(expectedResult, actualResult);
    }
}

