//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class CountNumberUsingWhile{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Get the countdown start value from user
        System.out.print("Enter the starting value for countdown : ");
        int count = s.nextInt();

        //Countdown the number
        while (count >= 1) {
            System.out.println(count);
            count--; // Decrementing the count
        }

        s.close();
    }
}