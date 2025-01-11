//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class CheckTheNumber{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter a number : ");
        int number = s.nextInt();

        //Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        s.close();
    }
}
