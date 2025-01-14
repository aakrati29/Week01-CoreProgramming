import java.util.*;
public class CheckPrimeNumber{

	public static void isPrimeNumber(int num){
		if(num%1 == 0 && num%num == 0){
			System.out.println(num + " number is prime");
		}
	
		else{
			System.out.println(num + " number is not prime");
		}
	}

	public static void main(String [] args){
	
	// Create a object of Scanner class to take user input
	Scanner s  = new Scanner(System.in);
	int num = s.nextInt();
	
	isPrimeNumber(num);
	}
}
	
	
	