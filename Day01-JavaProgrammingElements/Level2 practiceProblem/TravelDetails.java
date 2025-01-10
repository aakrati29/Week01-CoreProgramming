//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create TravelDetails class for store same basic details
public class TravelDetails   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create a variable name of type string 
	String name = s.nextLine();
	
	//create a variable fromCity of type string
	String fromCity = s.nextLine();
	
	//create a variable viaCity of type string
	String viaCity = s.nextLine();
	
	//create a variable toCity of type string
	String toCity = s.nextLine();
	
	//create a variable distanceFromToVia of type double
	double distanceFromToVia = s.nextDouble();
	
	//create a variable distanceViaToFC of type double
	double distanceViaToFC = s.nextDouble();
	
	//create a variable timeTaken of type double
	double timeTaken = sc.nextDouble();
	
	//calculate total distance 
	double totalDistance = fromToVia + viaToFinalCity;
	
	//calculate average speed 
	double averageSpeed = totalDistance / timeTaken;
	
	//here print all the details
    System.out.println("Name " + name);
    System.out.println("From " + fromCity);
    System.out.println("Via " + viaCity);
    System.out.println("To " + toCity);
    System.out.println("Total Distance is " + totalDistance + " miles");
    System.out.println("Total Time Taken " + timeTaken + " hours");
    System.out.printf("Average Speed is " + averageSpeed);
	}
}
	