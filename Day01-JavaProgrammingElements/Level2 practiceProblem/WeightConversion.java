//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create WeightConversion class for convert weight from pounds to kilogram
public class WeightConversion{

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create weightInPounds as a variable of type double and take input from user 
	double weightInPounds = s.nextDouble();
	
	//calculate weight in kg
	double weightInKg = weightInPounds / 2.2;
	
	//here print weight in pounds and kg
	System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
	}
}
	
	
	