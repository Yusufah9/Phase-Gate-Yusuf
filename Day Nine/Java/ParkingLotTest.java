import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {

    @Test
    public void testThatACarOwnerCanParkTheirCarAutomaticallyAtAnyAvailableEmptySlot() {
        
        int[] parkingSlots = new int[20];
        int actualSlotNumber = ParkingLot.parkAutomatically(parkingSlots);

        // Check
        int expected = 1;
        assertEquals(expected, actualSlotNumber);
    }

    @Test
    public void testThatCarCanBeParkedAtSpecificSlot() {
       
     // Given
        int[] parkingSlots = new int[20];
        int chosenSlot = 5;

        // When
        boolean isParked = ParkingLot.parkAtSlot(parkingSlots, chosenSlot);

        // Check
        int expectedSlotStatus = 1;
        int actualSlotStatus = parkingSlots[chosenSlot - 1];
        assertEquals(expectedSlotStatus, actualSlotStatus);
    }

    @Test
    public void testThatCarLeavingASlotMakesItEmpty() {
        
        // Given
        int[] parkingSlots = new int[20];
        int leaveSlot = 3;
        parkingSlots[leaveSlot - 1] = 1;

        // When
        boolean hasLeft = ParkingLot.carLeaves(parkingSlots, leaveSlot);

        // Check
        int expectedSlotStatus = 0;
        int actualSlotStatus = parkingSlots[leaveSlot - 1];
        assertEquals(expectedSlotStatus, actualSlotStatus);
    }

    @Test
    public void testThatParkingStatusCountsCorrectly() {
        
        // Given
        int[] parkingSlots = new int[20];
        parkingSlots[0] = 1;
        parkingSlots[1] = 1;

        // When
        int filledSpaces = ParkingLot.countFilledSpaces(parkingSlots);

        // Check
        int expectedFilled = 2;
        assertEquals(expectedFilled, filledSpaces);
    }
}


















//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out CalculatorTest.java Calculator.java


//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
