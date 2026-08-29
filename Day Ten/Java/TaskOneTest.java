import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest {

    @Test
    public void testThatACollectionOfArrayIsGivenAndLastTwoNumbersAreAdded() {
        int[] numbers = {1, 2, 3, 1};
        int[] expectedResult = {1, 2, 4};

        int[] actualResult = TaskOne.addArrayOf(numbers);
        assertArrayEquals(expectedResult, actualResult);
    }
}
