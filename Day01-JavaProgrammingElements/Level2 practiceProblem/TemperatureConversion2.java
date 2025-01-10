//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create TemperatureConversion2 class for convert temperature from celsius to fahrenheit 
public class TemperatureConversion2   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create fahrenheit as a variable of type double and take input from user 
	double fahrenheit = s.nextDouble();
	
	//convert the temperature from fahrenheit to celsius
	double celsius = ((fahrenheit − 32) * (5/9));
	
	//here print the temperature in fahrenheit and celsius
	System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
	}
}