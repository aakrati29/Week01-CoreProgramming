//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create SimpleInterest class for calculate simple interest
public class SimpleInterest   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create P as a variable of type double and take input from user 
	double P = s.nextDouble();
	
	//create R as a variable of type double and take input from user 
	double R = s.nextDouble();
	
	//create T as a variable of type double and take input from user 
	double T = s.nextDouble();
	
	//calculate simple interest and store in simpleInterest variable
	double simpleInterest = (P*R*T) / 100;
	
	//here print simple interest, principle, rate, and time
	System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + P + ", Rate of Interest " + R + " and Time " + T);
	}
}
	