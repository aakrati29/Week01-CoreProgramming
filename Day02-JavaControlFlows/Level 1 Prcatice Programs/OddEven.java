//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
	
	    //create object of scanner class
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number - ");
        int number = s.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } 
		
		else {
            //Iterate from 1 to the number and check odd/even
            for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                } 
				
				else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
        s.close();
    }
}
