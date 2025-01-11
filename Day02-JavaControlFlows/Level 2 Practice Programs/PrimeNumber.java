//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create PrimeNumber class to check the number is prime or not
public class PrimeNumber{

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create a variable number and take input from user
	int number = s.nextInt();
	
	//create a variable isPrime and suppose it as true
	boolean isPrime = true;
	
	//here number is less than or equal to one then it is not a prime number
	if(number <= 1){
		isPrime = false;
	}
	
	// here numbers from 2 to the user input number, If the reminder is zero than break out from the loop
	else{
	for(int i = 2; i < number; i++){
	   if(number % i == 0){
	   isPrime = false;
	   break;
	   }
	}
}
	    
	if(isPrime){
	System.out.println(number + " is prime number");	
	   }
	   
	   else{
	   System.out.println(number + " is not prime");
	}
	}
}
