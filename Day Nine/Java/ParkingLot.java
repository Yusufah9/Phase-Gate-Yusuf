import java.util.Scanner;

public class ParkingLot {

    public static int parkAutomatically(int[] parkingSlots) {
        for (int slotNumbers = 0; slotNumbers < parkingSlots.length; slotNumbers++) {
            if (parkingSlots[slotNumbers] == 0) {
                parkingSlots[slotNumbers] = 1;
                return slotNumbers + 1;
            }
        }
        return -1; 
    }

    public static boolean parkAtSlot(int[] parkingSlots, int chosenSlot) {
        int targetSpace = chosenSlot - 1;
        if (targetSpace >= 0 && targetSpace < parkingSlots.length) {
            if (parkingSlots[targetSpace] == 0) {
                parkingSlots[targetSpace] = 1;
                return true;
            }
        }
        return false;
    }

    public static boolean carLeaves(int[] parkingSlots, int leaveSlot) {
        int leaveIndex = leaveSlot - 1;
        if (leaveIndex >= 0 && leaveIndex < parkingSlots.length) {
            if (parkingSlots[leaveIndex] == 1) {
                parkingSlots[leaveIndex] = 0;
                return true;
            }
        }
        return false;
    }

    public static int countFilledSpaces(int[] parkingSlots) {
        int filledSpaces = 0;
        for (int slotNumbers = 0; slotNumbers < parkingSlots.length; slotNumbers++) {
            if (parkingSlots[slotNumbers] != 0) {
                filledSpaces++;
            }
        }
        return filledSpaces;
    }

    public static int countEmptySpaces(int[] parkingSlots) {
        int emptySpaces = 0;
        for (int slotNumbers = 0; slotNumbers < parkingSlots.length; slotNumbers++) {
            if (parkingSlots[slotNumbers] == 0) {
                emptySpaces++;
            }
        }
        return emptySpaces;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] parkingSlots = new int[20];
        boolean isParkingSystemOn = true;

        while (isParkingSystemOn) {
            String parkingMenu = """
                    
                    Welcome to Mini Parking System
                    
                    1. Park car (Automatic from left to right)
                    2. Park car at a specific slot (1 - 20)
                    3. Car leaves a slot
                    4. Display parking status (Available & Filled)
                    5. View all slot numbers status
                    0. Exit system
                    """;

            System.out.println(parkingMenu);
            System.out.print("Select an option: ");

            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 0:
                    System.out.println("Exiting parking system. Goodbye!");
                    isParkingSystemOn = false;
                    break;

                case 1:
                    int slot = parkAutomatically(parkingSlots);
                    if (slot != -1) {
                        System.out.println("Car successfully parked at slot: " + slot);
                    } else {
                        System.out.println("Parking is full!");
                    }
                    break;

                case 2:
                    System.out.print("Enter slot number to park (1 to 20): ");
                    int chosenSlot = scanner.nextInt();
                    int targetSpace = chosenSlot - 1;

                    if (targetSpace >= 0 && targetSpace < parkingSlots.length) {
                        if (parkingSlots[targetSpace] == 0) {
                            parkingSlots[targetSpace] = 1;
                            System.out.println("Car parked at chosen slot: " + chosenSlot);
                        } else {
                            System.out.println("Slot " + chosenSlot + " is already occupied!");
                        }
                    } else {
                        System.out.println("Invalid slot number! Choose between 1 and 20.");
                    }
                    break;

                case 3:
                    System.out.print("Enter slot number where car is leaving (1 to 20): ");
                    int leaveSlot = scanner.nextInt();
                    boolean left = carLeaves(parkingSlots, leaveSlot);
                    if (left) {
                        System.out.println("Car left slot: " + leaveSlot);
                    } else {
                        System.out.println("Invalid slot or slot is already empty!");
                    }
                    break;

                case 4:
                    System.out.println("--- Parking Status ---");
                    System.out.println("Available Spaces: " + countEmptySpaces(parkingSlots));
                    System.out.println("Filled Spaces: " + countFilledSpaces(parkingSlots));
                    break;

                case 5:
                    System.out.print("Current Slots Layout (0 = Empty, 1 = Occupied): [ ");
                    for (int slotNumbers = 0; slotNumbers < parkingSlots.length; slotNumbers++) {
                        System.out.print(parkingSlots[slotNumbers] + " ");
                    }
                    System.out.println("]");
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 0 and 5.");
                    break;
            }
            System.out.println();
        }
    }
}
