// Here import all classes so that we can use their inbuilt functions
import java.util.*; 

// Create a class ChocolateDivision to divide chocolates among children and find remainder
public class ChocolateDivision {

    //Method to calculate how many chocolates each child gets and the remainder
    public static int[] findChocolatesAndRemainder(int numberOfChocolates, int numberOfChildren) {
	
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren; 

        // Return an array where [0] is chocolates per child and [1] is remaining chocolates
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
		
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in); 

        // Ask the user to enter the total number of chocolates
        System.out.println("Enter the number of chocolates :");
        int numberOfChocolates = s.nextInt();

        // Ask the user to enter the number of children
        System.out.println("Enter the number of children :");
        int numberOfChildren = s.nextInt();

        // Check if the number of children is greater than 0 to avoid division by zero
        if (numberOfChildren <= 0) {
            System.out.println("The number of children must be greater than 0.");
        } else {
            // Call the method to find chocolates per child and the remainder
            int[] result = findChocolatesAndRemainder(numberOfChocolates, numberOfChildren);

            // Print the results
            System.out.println("Each child will get : " + result[0] + " chocolates");
            System.out.println("Remaining chocolates : " + result[1]);
        }

		// Close the scanner
        s.close(); 
    }
}
