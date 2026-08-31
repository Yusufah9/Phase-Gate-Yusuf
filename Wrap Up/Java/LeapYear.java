public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap years between 1900 and 2025:");

        for (int year = 1900; year <= 2025; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
