//Create UniversityCharge class to calculate the university charging for the course
public class UniversityCharge{

    public static void main(String [] args){
	
	//create a variable fee of integer type to store the fee
	int fee = 125000;
	
	//create a variable discountPercent to store how many discount they gave on course
	int discountPercent = 10;
	
	//create a variable discount to calculate discount on the fee
	int discount = fee * (10/100);
	
	//create a variable totalCourseDiscount to store how many discount students take from course fee
	int totalCourseDiscount = fee - discount;
	
	//print the final fee after discount
	System.out.println("The discount amount is INR " + discount + "and final discounted fee is INR " + totalCourseDiscount);
	}
}