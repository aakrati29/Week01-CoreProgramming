import java.util.*;

// Create a class CalendarPresenting for display calendar
public class CalendarPresenting {

    // Create a method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Create a method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year in February
        if (month == 2 && CheckIsLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Create a method to check if a year is a leap year
    public static boolean CheckIsLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Create a method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
	
		// First day of the month
        int d = 1; 
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // Create a method to display the calendar
    public static void displayCalendar(int month, int year) {
	
        // Get the name of the month and the number of days
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("\n " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Get user input for month and year
        System.out.print("Enter month (1-12) : ");
        int month = s.nextInt();

        System.out.print("Enter year : ");
        int year = s.nextInt();

        // Display the calendar
        displayCalendar(month, year);
		
		//closing the scanner class object
        s.close();
    }
}
