import java.util.*;
public class MaximumOfThreeNumbers{

	public static void maxOfThree(int num1, int num2, int num3){
		if(num1 > num2 && num1 > num3){
			System.out.println(num1 + " num1 is maximum");
		}
		
		else if (num2 > num1 && num2 > num3){
			System.out.println(num2 + " num2 is maximum");
		}
		
		else{
			System.out.println(num3 + " num3 is maximum");
		}
	}
	
	public static void main(String [] args){
	
	// Create a object of Scanner class to take user input
	Scanner s  = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int num3 = s.nextInt();
	maxOfThree(num1, num2, num3);
	}
}
	
	