//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) 
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = s.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("The year " + year + " is before the Gregorian calendar started.");
        } 
		
		else {
            // Check if the year is a leap year using multiple conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } 
					
					else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } 
				
				else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } 
			
			else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        s.close();
    }
}