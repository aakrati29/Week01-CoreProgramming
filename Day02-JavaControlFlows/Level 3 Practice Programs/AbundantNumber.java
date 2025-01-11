//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

//create AbundantNumber class for check
public class AbundantNumber {

    public static void main(String[] args) {
	
		//create the scanner object for input
        Scanner s = new Scanner(System.in);

        //Get user input and store in number variable
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Calculate sum of divisors
        int divisorSum 0;
		
		for (int i = 1; i <= number / 2; i++){ 
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        // Check if the number is abundant
        if (divisorSum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        s.close();
    }
}