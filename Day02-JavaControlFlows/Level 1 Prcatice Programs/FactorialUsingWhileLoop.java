//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class FactorialUsingWhileLoop{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a positive integer: ");
        int num = s.nextInt();

        //Check if the input is a positive integer
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } 
		
		else {
            //Compute factorial using a while loop
            int factorial = 1;
            int currentMul = 1;

            while (currentMul <= num) {
                factorial *= currentMul;
                currentMul++;
            }

            System.out.println("The factorial of " + num + " is : " + factorial);
        }

        s.close();
    }
}
