//here import all classes for access their inbuilt functions
import java.util.*;

//Create FindDistance class to find the distance in yard and miles
public class FindDistance{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new scanner(System.in);
	
	//here take input from user of distance in feet
	double distanceInFeet = s.nextDouble();
	
	//here convert distance from feet to yard and store in distanceInYard variable
	double distanceInYard = distanceInFeet / 3;
	
	//here convert distance from yard to miles and store in distanceInMiles variable
	double distanceInMiles = distanceInYard / 1760;
	
	//here print distance in feet, yard and miles
	System.out.println("The distance in feet is " + distanceInFeet + " in yard is " + distanceInYard + " and in miles " + distanceInMiles);
	}
}