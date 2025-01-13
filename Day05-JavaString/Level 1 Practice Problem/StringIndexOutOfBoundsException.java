import java.util.*;

public class StringIndexOutOfBoundsException{

    // Method for generating StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Attempt to access an index beyond the string length
        System.out.println("Character at index beyond length: " + str.charAt(str.length() + 1));
    }

    // Method for handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            
			// Attempt to access an index beyond the string length
            System.out.println("Character at index beyond length: " + str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            
			// Handle the exception and display an error message
            System.out.println("A StringIndexOutOfBoundsException occurred : " + e.getMessage());
        } 
		
		catch (RuntimeException runtimeException) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string : ");
        String input = s.nextLine();

        // Calling the method that generates the exception
        System.out.println("StringIndexOutOfBoundsException generation : ");
        try {
            generateStringIndexOutOfBoundsException(input);
        } 
		
		catch (Exception e) {
            System.out.println("\n\nCaught exception in main : " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nStringIndexOutOfBounds Exception handling  :");
        handleStringIndexOutOfBoundsException(input);

        sc.close();
    }
}
