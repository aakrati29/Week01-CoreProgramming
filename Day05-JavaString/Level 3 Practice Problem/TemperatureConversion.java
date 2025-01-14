//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create TemperatureConversion class for convert temperature from celsius to fahrenheit 
public class TemperatureConversion   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create celsius as a variable of type double and take input from user 
	double celsius = s.nextDouble();
	
	//convert the temperature from celsius to fahrenheit
	double fahrenheit = (celsius × (9/5)) + 32;
	
	//here print the temperature in celsius and fahrenheit
	System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
	}
}
	