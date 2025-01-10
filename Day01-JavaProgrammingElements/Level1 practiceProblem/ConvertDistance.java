//here we import all classes for access their inbuilt functions
import java.util.*;

//Create ConvertDistance class to convert distance from km to miles
public class ConvertDistance{

    public static void main(String [] args){
	
	//create object od scanner class to take input
	Scanner s = new Scanner(System.in);
	
	//create a variable of double type
	double km;
	
	//here take input from user using scanner class
	km = s.nextDouble();
	
	//here  calculate the total miles and store in totalMiles variable of double type
	double totalMiles = km/1.6
	
	//here print the total miles for the given km
	System.out.println("The total miles is " + totalMiles + " + mile for the given " + km);
	}
}