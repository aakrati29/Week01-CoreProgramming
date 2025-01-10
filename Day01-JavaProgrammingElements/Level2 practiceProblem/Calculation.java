//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create calculation class for calculate quotient and remainder
public class Calculation{

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create a variable num1 of type double to store value of num1 
    double num1 = s.nextDouble();
	
	//create a variable num2 of type double to store value of num2 
    double num2 = s.nextDouble();
	
	//calculate the quotient and store in quotient variable
    double quotient = num1 / num2;
	
	//calculate the quotient and store in quotient variable
    double reminder = num1 % num2;
	
	//here print quotient and remainder of two number num1 and num2
	System.out.println("The Quotient is " + quotient + " and Reminder is " + " of two number " + num1 + " and " + num2);
	}
}
   
	
   