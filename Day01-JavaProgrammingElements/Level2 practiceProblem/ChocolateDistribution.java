//here import all classes so that we can use their inbuilt functions
import java.util.*;

//Create ChocolateDistribution class to distribute chocolate among childern
public class ChocolateDistribution{

    public static void main(String [] args){
	
	//create object of scanner class to take input
    Scanner s = new Scanner(System.in);
	
	//create a variable numberOfchocolates of integer type to store the number of chocolate
	int numberOfchocolates = s.nextInt();
	
	//create a variable numberOfChildren of integer type to store the number of childern
	int numberOfChildren = s.nextInt();
	
	//create a variable remainingChocolate of integer type to stored the value of remaining chocolate which is not distributed
	int remainingChocolate = numberOfchocolates % numberOfChildren;
	
	//create a variable equallyDistributedCho of integer type to stored the value of how many chocolate are equally distributed
	int equallyDistributedCho = numberOfchocolates / numberOfChildren;
	
	//here print the remaining chocolate and equally distributed among three childern
	System.out.println("The number of chocolates each child gets is " + equallyDistributedCho + " and the number of remaining chocolates are " + remainingChocolate);
	}
}
	