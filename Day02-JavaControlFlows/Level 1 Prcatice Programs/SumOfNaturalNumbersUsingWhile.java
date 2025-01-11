//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

class SumOfNaturalNumbersUsingWhile{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number : ");
        int number = s.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } 
		
		else {
            // Computing the sum using a while loop
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }

            //Compute the sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            //Display the results
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + sumUsingFormula);

            //Compare the results
            if (sum == sumUsingFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } 
			
			else {
                System.out.println("Results are different");
            }
        }

        s.close();
    }
}
