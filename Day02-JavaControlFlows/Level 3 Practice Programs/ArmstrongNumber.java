//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
		//create object of scanner class to take input		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = s.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Use while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            //Find the remainder of the number (last digit)
            int remainder = originalNumber % 10;

            //Find the cube of the digit and add it to the sum
            sum += remainder * remainder * remainder;

            //Find the quotient and assign it to the originalNumber
            originalNumber /= 10;
        }

        //Check if the sum and the original number are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
		
		s.close();
    }
}
