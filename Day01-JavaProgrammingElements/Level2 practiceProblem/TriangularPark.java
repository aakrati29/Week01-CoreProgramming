//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create TriangularPark class for calculate total number of rounds
public class TriangularPark   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create side1 as a variable of type integer and take input from user 
	double side1 = s.nextInt();
	
	//create side2 as a variable of type integer and take input from user 
	double side2 = s.nextInt();
	
	//create side3 as a variable of type integer and take input from user 
	double side3 = s.nextInt();
	
	//convert given distance in meter and store in distance variable 
	double distance = 5 * 1000;
	
	//calculate the parimetre of triangle and store in parameterOfTriangle variable
	double parameterOfTriangle = side1 + side2 + side3;
	
	//calculate total round and store in totalRound variable
	double totalRound = distance / parameterOfTriangle;
	
	//here print total number of rounds
	System.out.println("The total number of rounds the athlete will run is " + totalRound + " to complete 5 km");
	}
}