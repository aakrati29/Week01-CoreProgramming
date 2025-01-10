//create conversion class for convert the distance from km to miles
public class Conversion{
	
     public static void main(String [] args){
		 
	//create a variable of type double and store the distance in km
	 double distanceInKm = 10.8;
	 
	 //convert distance from kilometer to miles and stored in variable kmToMiles
	 double kmToMiles = distanceInKm * 1.6 
	 
	 //here print the distance in km and in miles
	 System.out.println("The distance " + distanceInKm + "km in miles is " + kmToMiles);
	 }
}