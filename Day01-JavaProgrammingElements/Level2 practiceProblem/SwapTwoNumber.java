//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create SwapTwoNumber class for swap two number
public class SwapTwoNumber   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create num1 as a variable of type integer and take input from user 
	int num1 = s.nextInt();
	
	//create num2 as a variable of type integer and take input from user 
	int num2 = s.nextInt();
	
	//swap the number
	int temp = num1;  //store num1 in temporary variable as temp
	num1 = num2;      //assign num2 to num1
	num2 = temp;      //assign temp or num1 to num2
	
	//here print num1 and num2
	System.out.println("The swapped numbers are " + num1 + " and " + num2);
	}
}
	
	
	
	
	
	