//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args) {
		
		//create object of scanner class
        Scanner s = new Scanner(System.in);

		// Initialize total
        int total = 0; 
		
		// Variable to store user input
        int number;  

        // Taking input from user and continuing the process until 0 is entered
        do {
            System.out.print("Enter a Number (Enter 0 to stop) : ");
            userInput = s.nextInt();
            total += number;   // Add input to total
        } while (number != 0);

        System.out.println("The total sum is : " + total);
        s.close();
    }
}
