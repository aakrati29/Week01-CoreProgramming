import java.util.*;

public class IllegalArgumentException{

    // Method for generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        
		// Trying to call substring()
        System.out.println("Substring : " + str.substring(5, 2));
    }

    // Create a method to handle IllegalArgumentException
    public static void handledIllegalArgumentException(String str) {
        try {
            
			// Call substring() with start
            System.out.println("Substring : " + str.substring(5, 2));
        } 
		
		catch (Exception e) {
            
			// Handle IllegalArgumentException
            System.out.println("IllegalArgumentException occurred : " + e.getMessage());
        } 
		
		catch (RuntimeException runtimeException) {
         System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string : ");
        String input = s.nextLine();

        // Calling the method that generates the exception
        System.out.println("IllegalArgumentException generation :");
        try {
			
            generatedIllegalArgumentException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in main : " + e.getMessage());
        }

        // Call the method that handles the exception
        System.out.println("\n IllegalArgumentException handling :");
        handledIllegalArgumentException(input);

        sc.close();
    }
}
