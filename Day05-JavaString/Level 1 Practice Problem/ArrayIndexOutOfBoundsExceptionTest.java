import java.util.*;

public class ArrayIndexOutOfBoundsExceptionTest{

    // Method for generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] arr, int index) {
        
		// Trying to access an index that is out of bounds of the array
        System.out.println("\nAccessing index " + index + " : " + arr[index]);
    }

    // Method for handle the exception using try-catch block
    public static void handleArrayIndexOutOfBoundsException(String[] arr, int index) {
        try {
            // Calling the method to generate the exception
            generateArrayIndexOutOfBoundsException(arr, index);
        } 
		
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("\nArrayIndexOutOfBoundsException caught : The index " + index + " is out of bounds.");
        } 
		
		catch (RuntimeException runtimeException) {
            System.out.println("\nRuntimeException caught: An unexpected error occurred");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		// Taking input for the array of names
        System.out.print("Enter the number of names you want to input : ");
        int input = sc.nextInt();
		
		// Array to store names input by the user
        String[] arr = new String[input];
		
		
		// Storing a index to access the array and generate the ArrayIndexOutOfBoundsException 
        int indexToAccess = input;
        sc.nextLine(); // Consume the leftover newline character

        // Taking names input from the user
        for (int i = 0; i < input; i++) {
            System.out.print("Enter name " + (i + 1) + " : ");
            arr[i] = sc.nextLine();
        }


		try{
			
			// First calling the method to generate the exception
			System.out.println("\nGenerate ArrayIndexOutOfBoundsException");
			generateArrayIndexOutOfBoundsException(arr, indexToAccess); 
		
		} catch(Exception e){
			
			// Call the method to handle it
			System.out.println("\nHandling the exception");
			
			// This will catch and handle the exception
			handleArrayIndexOutOfBoundsException(arr, indexToAccess); 
		}
		
		sc.close();
	}
}
