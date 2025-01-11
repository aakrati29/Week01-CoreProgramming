//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
		
		//create object of scanner class to take input
        Scanner s = new Scanner(System.in);

        //create number variable and take input from user
        System.out.print("Enter the base number : ");
        int number = s.nextInt();

        System.out.print("Enter the power : ");
        int power = s.nextInt();

        //Initializing result variable one
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        //Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        s.close();
    }
}
