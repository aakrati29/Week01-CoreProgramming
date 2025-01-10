//here import all classes for access their inbuilt functions
import java.util.*;

//Create SideOfSquare class to calculate side of square
public class SideOfSquare{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new Scanner(System.in);
	
	//create a variable parameter of type double to store the parameter of square and take its input from user
	double parameter = s.nextDouble();
	
	//create a variable side to store the calculated side of square
	double side  = parameter/4;
	
	//here print the side of square and parameter
	System.out.println(" The length of the side is " + side + " whose perimeter is " + parameter);
	}
}
