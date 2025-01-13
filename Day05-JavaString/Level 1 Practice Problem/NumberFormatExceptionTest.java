import java.util.*;

public class NumberFormatExceptionTest{

    // Method for generate NumberFormatException
    public static void generateNumberFormatException(String str) {
       
        Integer.parseInt(str); 
    }

    // Method for handle the exception using try-catch block
    public static void handleNumberFormatException(String str) {
        try {
            
			// Call the method to generate the exception
            generateNumberFormatException(str);
        } 
		
		catch (NumberFormatException numberFormatException) {
            System.out.println("\nNumberFormatException caught");
        } 
		
		catch (RuntimeException runtimeException) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input; 

        // Taking user input
        System.out.print("Enter a string that represents a number : ");
        input = s.nextLine();


		try{
			// call the method that generate the exception
			System.out.println("Generate NumberFormatException");
			generateNumberFormatException(input); 
		}
		
		catch(Exception e){
			
			 // call the method to handle the exception
			System.out.println("\n\nHandling the exception");
			handleNumberFormatException(input);
			
		}
    }
}
