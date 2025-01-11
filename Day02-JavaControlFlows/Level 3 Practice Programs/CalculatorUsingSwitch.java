//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

class CalculatorUsingSwitch {
    public static void main(String[] args) {
		
		//create object of scanner class to take input		
        Scanner s = new Scanner(System.in);
		
		//Taking input for the first number
        System.out.print("Enter the first number: ");
        double first = s.nextDouble();
		
		//Taking input for the second number
        System.out.print("Enter the second number: ");
        double second = s.nextDouble();
		
		//Taking input for the operator
        System.out.print("Enter the operator (+, -, *, /) : ");
        String operator = s.next();
		
		//Initialize validOperator to true
        double result = 0;
        boolean validOperator = true;

        // Using switch case to perform the desired operation based on the operator
        switch (operator) {
		
		    // Perform addition
            case "+":
                result = first + second; 
                break;
			
			// Perform subtraction
            case "-":
                result = first - second; 
                break;
				
			// Perform multiplication
            case "*":
                result = first * second; 
                break;
				
			// Perform division if second number is not zero
            case "/":
                if (second != 0) {
                    result = first / second; 
                }
				
				else {
                    System.out.println("Cannot divide by zero"); // Handle division by zero
                    validOperator = false; // Set validOperator to false for division by zero
                }
                break;
				
            default:
			
				//Set validOperator to false for invalid operator
                validOperator = false; 
				
				//Print invalid operator message
                System.out.println("Invalid Operator"); 
                break;
        }

        //Print the result if the operator is valid
        if (validOperator) {
            System.out.println("The result of " + first + " " + operator + " " + second + " is: " + result);
        }
		
        s.close();
    }
}
