//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
	
		 //create object of scanner class to take input		
        Scanner s = new Scanner(System.in);

        //take input from user and store in number variable
        System.out.print("Enter a number: ");
        int num = s.nextInt();

		//Keep the original number for comparison
        int originalNumber = num; 
        int sum = 0;

        //Calculate the sum of digits
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += digit;            // Add the digit to sum
            num /= 10;            // Remove the last digit
        }

        //Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } 
		else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        s.close();
    }
}
