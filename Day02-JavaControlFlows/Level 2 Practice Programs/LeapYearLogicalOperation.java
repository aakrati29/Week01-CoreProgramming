//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class LeapYearLogicalOperation{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);


        //taking input from user to enter an integer
        System.out.print("Enter a year (>= 1582): ");
		
		//take input from user in variable year
        int year = s.nextInt();

        //Ensure the year is in the Gregorian calendar
        if (year >= 1582) {
		
            // Single if condition using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year");
            } 
			
			else {
               System.out.println("The year " + year + " is not a Leap Year");
            }
        } 
		
		else {
           System.out.println("The year " + year + " is not valid as it's before 1582.");
        }
		
        s.close();
    }
}



