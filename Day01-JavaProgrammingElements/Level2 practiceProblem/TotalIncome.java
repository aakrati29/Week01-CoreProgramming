//here import all classes so that we can use their inbuilt functions
import java.util.*;

//create TotalIncome class for calculate total income
public class TotalIncome   {

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create salary as a variable of type double and take input from user 
	double salary = s.nextDouble();
	
	//create bonus as a variable of type double and take input from user 
	double bonus = s.nextDouble();
	
	//calculate total income and store in totalIncome variable
	double totalIncome = salary + bonus;
	
	//here print salary, bonus and total income
	System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	}
}