//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        
		//create object of scanner class to take input
        Scanner s = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        
        //Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        s.close();
    }
}
