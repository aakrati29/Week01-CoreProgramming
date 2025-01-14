import java.util.*;
public class NumberGuessingGame{

	public static int randomNumberGenerate(int maxRange, int minRange){
		return (maxRange + minRange) / 2;
	}
	
	public static void main(String [] args){
	
	// Create a object of Scanner class to take user input
	Scanner s  = new Scanner(System.in);
	
	// Create variables between range 1 to 100
	int maxRange = 100;
	int minRange = 1;
	System.out.println("Guess a number between 1 to 100 : ");
	int guess = randomNumberGenerate(maxRange, minRange);
	while(true){
		
		System.out.println("Is the number : "+guess);
		System.out.println("If yes then write correct, if low then write low, if high then write high: ");
		String result = s.nextLine().toLowerCase();
		
		if(result.equals("high")){
			maxRange=guess;
			guess = randomNumberGenerate(guess, minRange);
		}
		else if(result.equals("low")){
			minRange=guess;
			guess = randomNumberGenerate(maxRange,guess);
		}
		else{
			System.out.println("I guessed it!");
			break;
		}
	}
  }
}
	
	