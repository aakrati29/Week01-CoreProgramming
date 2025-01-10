//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create DoubleOpt class for calculate quotient and reminder
public class DoubleOpt  {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in); 
	
	//create a as a variable of type double and take input from user 
	double a = s.nextDouble();
	
	//create b as a variable of type double and take input from user 
    double b = s.nextDouble();
	
	//create c as a variable of type double and take input from user 
	double c = s.nextDouble();
	
	//calculate the operation with operator precedence and store in operation1 variable
	double operation1 = a + b * c;
	
	//calculate the operation with operator precedence and store in operation2 variable
	double operation2 = a * b + c;
	
	//calculate the operation with operator precedence and store in operation3 variable
	double operation3 = c + a / b;
	
	//calculate the operation with operator precedence and store in operation4 variable
	double operation4 = a % b + c;
	
	//here print all operations
	System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + " and " + operation4);
	}
}