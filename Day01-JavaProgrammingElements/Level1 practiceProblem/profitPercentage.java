//Create ProfitPercentage class to calculate the profit percentage
public class ProfitPercentage{

    public static void main(String [] args){
	
	//take a variable of type int as costPrice to store the value of cost price
	int costPrice = 129;
	
	//take a variable of typr int as sellingPrice to store the value of selling price
	int sellingPrice = 191;
	
	//take a variable of int type as profit for calculate the profit
	int profit = sellingPrice - costPrice;
	
	//take a variable of int double as profitpercentage for calculate the percentage
	//and also do type conversion
	double profitPercentage = (double)((profit/costPrice)*100);
	
	//print the percentage based on cost price  and selling price
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
	System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	
	}
}
	 
	 
	 