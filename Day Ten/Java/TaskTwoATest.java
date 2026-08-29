import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskTwoATest {

    @Test
    public void testThatACollectionOfArrayIsGivenAndLastTwoNumbersAreAdded() {
        int[] number1 = {1, 2, 2, 1};
        int[] number2 = {2, 2};
        int[] expectedResult = {2};

        int[] actualResult = addArrayOfTwoIndexesFromNumber1(number1, number2);

        assertArrayEquals(expectedResult, actualResult);
    }
}

