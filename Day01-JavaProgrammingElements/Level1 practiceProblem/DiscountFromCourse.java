//here we import all classes for access their inbuilt functions
import java.util.*;

//Create DiscountFromCourse class to convert distance from km to miles
public class DiscountFromCourse{

    public static void main(String [] args){
	
	//create object od scanner class to take input
	Scanner s = new Scanner(System.in);
	
	//create a variable fee of type double and take input from user
	double fee = s.nextInt();
	
	//create a variable discountPercent of type double and take input from user
	double discountPercent =s.nextInt();
	
	//here calculate the discounted amount from total fee and store in discount variable
	double discount = fee * (discountPercent/100);
	
	//here got the final discounted fee of course and store in discountedFee variable 
	double discountedFee = fee - discount;
	
	//here print the discount and discountedFee
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
}
}	