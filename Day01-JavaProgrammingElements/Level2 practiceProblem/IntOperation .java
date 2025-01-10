//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create IntOperation class for calculate quotient and reminder
public class IntOperation {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in); 
	
	//create a as a variable and take input from user 
	int a = s.nextInt();
	
	//create b as a variable and take input from user 
    int b = s.nextInt();
	
	//create c as a variable and take input from user 
	int c = s.nextInt();
	
	//calculate the operation with operator precedence and store in operation1 variable
	int operation1 = a + b * c;
	
	//calculate the operation with operator precedence and store in operation2 variable
	int operation2 = a * b + c;
	
	//calculate the operation with operator precedence and store in operation3 variable
	int operation3 = c + a / b;
	
	//calculate the operation with operator precedence and store in operation4 variable
	int operation4 = a % b + c;
	
	//here print all operations
	System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + " and " + operation4);
	}
}
	