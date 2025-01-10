//here we import all classes for access their inbuilt functions
import java.util.*;

//Create TotalPurchaseItem class to calculate the total purchase item
public class TotalPurchaseItem{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new scanner(System.in);
	
	//here take input of quantity to be bought and store in quantity variable 
	int unitPrice = s.nextInt();
	
	//here take input of quantity to be bought and store in quantity variable 
	int quantity = s.nextInt();
	
	//calculate the total price and store in totalPrice variable
	int totalPrice = unitPrice * quantity;
	
	//here print the total purchase price
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
 }
	
	