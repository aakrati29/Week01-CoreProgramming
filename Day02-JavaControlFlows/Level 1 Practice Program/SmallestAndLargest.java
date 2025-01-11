// Here import all classes so that we can use their inbuilt functions
import java.util.*;

// Class to find the smallest and largest number from three input numbers
public class SmallestAndLargest {

    //Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;
        
        // Compare numbers to find smallest and largest
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1; // number1 is the smallest
        } 
		
		else if (number2 <= number1 && number2 <= number3) {
            smallest = number2; // number2 is the smallest
        } 
		
		else {
            smallest = number3; // number3 is the smallest
        }

        if (number1 >= number2 && number1 >= number3) {
            largest = number1; // number1 is the largest
        } 
		
		else if (number2 >= number1 && number2 >= number3) {
            largest = number2; // number2 is the largest
        } 
		
		else {
            largest = number3; // number3 is the largest
        }

        // Return the result as an array
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 
		
        // Ask the user to enter three numbers
        System.out.println("Enter three numbers : ");

        // Read the three numbers from the user
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        // Call the method to find smallest and largest numbers
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Print the smallest and largest numbers
        System.out.println("Smallest number : " + result[0]);
        System.out.println("Largest number : " + result[1]);

		// Close the scanner 
        s.close(); 
    }
}
