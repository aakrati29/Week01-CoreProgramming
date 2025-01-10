//here we import all classes for access their inbuilt functions
import java.util.*;

//Create BasicCalculator class to perfom some basic task
public class BasicCalculator{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new Scanner(System.in);
	
	//create a variable number1 of type float and take input from user
	float number1 = s.nextFloat();
	
	//create a variable number2 of type float and take input from user
	float number2 = s.nextFloat();
	
	//create a variable add of type float to store the addition of number1 and number2
	float add = number1 + number2;
	
	//create a variable sub of type float to store the subtraction of number1 and number2
	float sub = number1 - number2;
	
	//create a variable mul of type float to store the multiplication of number1 and number2
	float mul = number1 * number2;
	
	//create a variable div of type float to store the division of number1 and number2
	float div = number1 / number2;
	
	//here print the output as addition subtraction multiplication and division
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " number1 + " and " + number2 + " is" + add + sub + mul + " and " + div); 
	}
}
	
	