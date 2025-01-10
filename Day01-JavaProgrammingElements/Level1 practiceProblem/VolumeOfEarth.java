//here we import all classes for access their inbuilt functions
import java.util.*;

//Create VolumeOfEarth class to calculate the volume of earth
public class VolumeOfEarth{

    public static void main(String [] args){
	
	//create a variable radius of type double to store the radius
	double radius = 6378;
	
	//create a variable volumeInKm fo type double to store the volume of earth in km
    double volumeInKm = (4/3) * 3.14 * Math.pow(radius, 3);
	
	//here we convert the radius ffrom km to miles and store in radiusInMiles variable
	double radiusInMiles = radius/1.6;
	
	//create a variable volumeInMiles fo type double to store the volume of earth in miles
	double volumeInMiles = (4/3) * 3.14 * Math.pow(radiusInMiles,3);
	
	//here print the output volume in km and miles
	System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
	}
}
	