//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

class FizzBuzzUsingWhile{
    public static void main(String[] args) {
		
		//create object of scanner class to take input
        Scanner s = new Scanner(System.in);

        //Taking as input
        System.out.print("Enter a number to generate FizzBuzz : ");
        int number = s.nextInt();
		
		//Check if number is less than 0
		if(number < 0){
			return;
		}
		
        //Generating FizzBuzz pattern
		int i=0;
        while(i<=number){
			//Check for the condition if number is divisible by 3 and 5
			if(i%3 == 0 && i%5 == 0){
				System.out.println("FizzBuzz");
			}
			
			//Check for the condition if number is divisible by 3 
			else if(i%3 == 0){
				System.out.println("Fizz");
			}
			
			//Check for the condition if number is divisible by 5
			else if(i%5 == 0){
				System.out.println("Buzz");
			}
			
			else{
				System.out.println(i);
			}
			
			i++;
		}	
		
        s.close();
    }
}