//here import all classes for access their inbuilt functions
import java.util.*;

//Create AreaOfTriangle class to calculate area of triangle
public class AreaOfTriangle{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new Scanner(System.in);
	
	//create a variable base of type double and take input from user
	double base = s.nextInt();
	
	//create a variable height of type double and take input from user
	double height = s.nextInt();
	
	//create a variable of type areaOfTriangle of type double to store area of triangle
	double areaOfTriangle = (1/2) * base * height;
	
	//here print area of triangle
	System.out.println("Area of triangle is " + areaOfTriangle);
	}
}